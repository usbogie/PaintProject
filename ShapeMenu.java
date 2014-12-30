import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeMenu extends JMenu
{
    PaintMainWindow mMainWindow;
    ShapeManager mShapeManager = new ShapeManager(mMainWindow);
    public ShapeMenu(PaintMainWindow mainWindow)
    {
        super("Shape");
        mMainWindow = mainWindow;
        
        JMenu shapeMenu = new JMenu("File");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        
        JRadioButtonMenuItem drawDot = new JRadioButtonMenuItem("Dot");
        buttonGroup.add(drawDot);
        add(drawDot);
        class DrawDotMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setShapeID(ShapeID.DOT);
            }    
        }
        drawDot.addActionListener(new DrawDotMenuOptionListener());
        
        JRadioButtonMenuItem drawRectangle = new JRadioButtonMenuItem("Rectangle");
        buttonGroup.add(drawRectangle);
        add(drawRectangle);
        class DrawRectangleMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setShapeID(ShapeID.RECTANGLE);
            }    
        }
        drawRectangle.addActionListener(new DrawRectangleMenuOptionListener());

        JRadioButtonMenuItem drawSquare = new JRadioButtonMenuItem("Square");
        buttonGroup.add(drawSquare);
        add(drawSquare);
        class DrawSquareMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setShapeID(ShapeID.SQUARE);
            }    
        }
        drawSquare.addActionListener(new DrawSquareMenuOptionListener());
        
        JRadioButtonMenuItem drawOval = new JRadioButtonMenuItem("Oval");
        buttonGroup.add(drawOval);
        add(drawOval);
        class DrawOvalMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setShapeID(ShapeID.OVAL);
            }    
        }
        drawOval.addActionListener(new DrawOvalMenuOptionListener());
        
        JRadioButtonMenuItem drawCircle = new JRadioButtonMenuItem("Circle");
        buttonGroup.add(drawCircle);
        add(drawCircle);
        class DrawCircleMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setShapeID(ShapeID.CIRCLE);
            }    
        }
        drawCircle.addActionListener(new DrawCircleMenuOptionListener());
        
        JRadioButtonMenuItem drawSegment = new JRadioButtonMenuItem("Segment");
        buttonGroup.add(drawSegment);
        add(drawSegment);
        class DrawSegmentMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setShapeID(ShapeID.SEGMENT);
            }    
        }
        drawSegment.addActionListener(new DrawSegmentMenuOptionListener());
        
        JRadioButtonMenuItem drawFreehand = new JRadioButtonMenuItem("Freehand");
        buttonGroup.add(drawFreehand);
        add(drawFreehand);
        class DrawFreehandMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setShapeID(ShapeID.FREEHAND);
            }    
        }
        drawFreehand.addActionListener(new DrawFreehandMenuOptionListener());
    }
}