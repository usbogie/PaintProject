import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class FillMenu extends JMenu
{
    PaintMainWindow mMainWindow;
    public FillMenu(PaintMainWindow mainWindow)
    {
        super("Fill");
        mMainWindow = mainWindow;
        
        JMenu fillMenu = new JMenu("Fill");
        ButtonGroup buttonGroup = new ButtonGroup();
        
        JRadioButtonMenuItem blackMenuItem = new JRadioButtonMenuItem("Black");
        buttonGroup.add(blackMenuItem);
        add(blackMenuItem);
        class BlackFillMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setFillColor(Color.black);
            }    
        }
        blackMenuItem.addActionListener(new BlackFillMenuOptionListener());
        
        JRadioButtonMenuItem redMenuItem = new JRadioButtonMenuItem("Red");
        buttonGroup.add(redMenuItem);
        add(redMenuItem);
        class RedFillMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setFillColor(Color.red);
            }    
        }
        redMenuItem.addActionListener(new RedFillMenuOptionListener());

        JRadioButtonMenuItem orangeMenuItem = new JRadioButtonMenuItem("Orange");
        buttonGroup.add(orangeMenuItem);
        add(orangeMenuItem);
        class OrangeFillMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setFillColor(Color.orange);
            }    
        }
        orangeMenuItem.addActionListener(new OrangeFillMenuOptionListener());
        
        JRadioButtonMenuItem yellowMenuItem = new JRadioButtonMenuItem("Yellow");
        buttonGroup.add(yellowMenuItem);
        add(yellowMenuItem);
        class YellowFillMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setFillColor(Color.yellow);
            }    
        }
        yellowMenuItem.addActionListener(new YellowFillMenuOptionListener());
        
        JRadioButtonMenuItem greenMenuItem = new JRadioButtonMenuItem("Green");
        buttonGroup.add(greenMenuItem);
        add(greenMenuItem);
        class GreenFillMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setFillColor(Color.green);
            }    
        }
        greenMenuItem.addActionListener(new GreenFillMenuOptionListener());
        
        JRadioButtonMenuItem blueMenuItem = new JRadioButtonMenuItem("Blue");
        buttonGroup.add(blueMenuItem);
        add(blueMenuItem);
        class BlueFillMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setFillColor(Color.blue);
            }    
        }
        blueMenuItem.addActionListener(new BlueFillMenuOptionListener());
        
        JRadioButtonMenuItem brownMenuItem = new JRadioButtonMenuItem("Brown");
        buttonGroup.add(brownMenuItem);
        add(brownMenuItem);
        class BrownFillMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setFillColor(Color.black);
            }    
        }
        blackMenuItem.addActionListener(new BrownFillMenuOptionListener());
        
        JRadioButtonMenuItem grayMenuItem = new JRadioButtonMenuItem("Gray");
        buttonGroup.add(grayMenuItem);
        add(grayMenuItem);
        class GrayFillMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setFillColor(Color.gray);
            }    
        }
        grayMenuItem.addActionListener(new GrayFillMenuOptionListener());
        
        JRadioButtonMenuItem noneMenuItem = new JRadioButtonMenuItem("<none>");
        buttonGroup.add(noneMenuItem);
        add(noneMenuItem);
        class NoneFillMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setFillColor(Color.white);
            }    
        }
        noneMenuItem.addActionListener(new NoneFillMenuOptionListener());
    }
}