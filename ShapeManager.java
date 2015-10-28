import java.awt.Color;
import java.awt.Graphics2D;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ShapeManager
{
    private PaintMainWindow mMainWindow;
    private Color mCurPenColor = Color.BLACK;
    private Color mCurFillColor = null;
    private LineThickness mCurLineThickness = LineThickness.THIN_LINE;
    private ShapeID mCurShapeID = ShapeID.RECTANGLE;
    private LinkedList<Shape> mShapeList = new LinkedList<Shape>();
    private LinkedList<Shape> mUndoList = new LinkedList<Shape>();
    private Shape mTempShape;

    public ShapeManager(PaintMainWindow mainWindow)
    {
        mMainWindow = mainWindow;   
    }

    public void setShapeID(ShapeID shapeID)
    {
        mCurShapeID = shapeID;
    }

    public ShapeID getCurShapeID()
    {
        return mCurShapeID;
    }

    public void setPenColor(Color penColor)
    {
        mCurPenColor = penColor;
    }
    
    public Color getCurPenColor()
    {
        return mCurPenColor;
    }

    public void setFillColor(Color fillColor)
    {
        mCurFillColor = fillColor;
    }
    
    public Color getCurFillColor()
    {
        return mCurFillColor;
    }
    
    public void setLineThickness(LineThickness thickness)
    {
        mCurLineThickness = thickness;
    }
    
    public LineThickness getCurLineThickness()
    {
        return mCurLineThickness;
    }
    
    public void processMousePressed(Point point)
    {
        mTempShape = ShapeFactory.createNewShape(this, point);
        mUndoList.clear();
    }
    
    public void processMouseReleased(Point point)
    {
        if (mTempShape != null)
        {
            mTempShape.processMouseReleased(point);
            
            if (mTempShape.checkCompleted() == true)
            {
                mShapeList.add(mTempShape);
                mTempShape = null;
            }
        }
    }

    public void processMouseDragged(Point point)
    {
        if (mTempShape != null)
            mTempShape.processMouseDragged(point); 
    }
    
    public void drawShapes(Graphics2D g2)
    {
        for (int i = 0; i < mShapeList.size(); i++)
        {
            Shape curShape = mShapeList.get(i);
            curShape.drawShape(g2);
        }
        
        if (mTempShape != null)
            mTempShape.drawShape(g2);
    }
    
    public void undo()
    {
        if (mTempShape != null)
            mTempShape = null;
        
        else if (mShapeList.isEmpty() == false)
            mUndoList.add(mShapeList.removeLast());
    }
    
    public void redo()
    {
        if (mTempShape != null)
            mTempShape = null;
        else if (mUndoList.isEmpty() == false)
            mShapeList.add(mUndoList.removeLast());
    }
    
    private File chooseFileForSave()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));        
        int response = fileChooser.showSaveDialog(null);
        if (response == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                return fileChooser.getSelectedFile();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        } 
        
        return null;
    }     
    
    public boolean saveToFile()
    {
        boolean succeeded = false;
        try
        {
            File saveFile = chooseFileForSave();
            if (saveFile != null)
            {
                FileOutputStream fileStream = new FileOutputStream(saveFile);    
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(mShapeList);
                os.close();
                succeeded = true;
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Save failed.");
            e.printStackTrace();
        }
        return succeeded;
    }
    
    private File chooseFileForOpen()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));        
        int response = fileChooser.showOpenDialog(null);
        if (response == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                return fileChooser.getSelectedFile();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        } 
        
        return null;
    }     
   
    public boolean loadFromFile()
    {
        boolean succeeded = false;
         try {
            File openFile = chooseFileForOpen();
            if (openFile == null)
                return succeeded;
                
            FileInputStream fileStream = new FileInputStream(openFile);
            ObjectInputStream os = new ObjectInputStream(fileStream);
            Object object1 = os.readObject();
            String className = object1.getClass().getName();
            if (className.matches("java.util.LinkedList"))
            {
                @SuppressWarnings("unchecked")
                LinkedList<Shape> shapeList = (LinkedList<Shape>) object1;
                mMainWindow.repaint();
                mUndoList.clear();
                mShapeList = shapeList; 
                succeeded = true;
            }
            else
                mShapeList = null;
            os.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "File Open failed.");
            e.printStackTrace();
        }
        return succeeded;
    }
}
