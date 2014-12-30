import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PaintMainPane extends JPanel
{
    PaintMainWindow mMainWindow;
    
    public PaintMainPane(PaintMainWindow mainWindow)
    {
        mMainWindow = mainWindow;
        
        // Create the mouse listener
        class MousePressListener implements MouseListener
        {
            public void mousePressed(MouseEvent event)
            {
                processMousePressed(event);
            }

            public void mouseReleased(MouseEvent event)
            {
                processMouseReleased(event);
            }     
            public void mouseClicked(MouseEvent event) {}
            public void mouseEntered(MouseEvent event) {}
            public void mouseExited(MouseEvent event) {}
        }
        addMouseListener(new MousePressListener());
           
        // Create the mouse motion listener
        class MouseMoveListener implements MouseMotionListener
        {
            public void mouseDragged(MouseEvent event)
            {
                processMouseDragged(event);
            }
            
            public void mouseMoved(MouseEvent event) {}
        }
        addMouseMotionListener(new MouseMoveListener());

    }
    
    final public void processMousePressed(MouseEvent event)
    {
        ShapeManager shapeManager = mMainWindow.getShapeManager();
        if (shapeManager == null)
            return;

        shapeManager.processMousePressed(new Point(event.getX(), event.getY()));
        refreshDisplay();
    }
    
    final public void processMouseReleased(MouseEvent event)
    {
        ShapeManager shapeManager = mMainWindow.getShapeManager();
        if (shapeManager == null)
            return;

        shapeManager.processMouseReleased(new Point(event.getX(), event.getY()));
        refreshDisplay();
    }

    final public void processMouseDragged(MouseEvent event)
    {
        ShapeManager shapeManager = mMainWindow.getShapeManager();
        if (shapeManager == null)
            return;

        shapeManager.processMouseDragged(new Point(event.getX(), event.getY()));
        refreshDisplay();
    }
               
    public void refreshDisplay()
    {
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {  
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
      
        ShapeManager shapeManager = mMainWindow.getShapeManager();
        shapeManager.drawShapes(g2);
    }  
    
}















