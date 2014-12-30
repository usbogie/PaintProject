import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ColorMenu extends JMenu
{
    PaintMainWindow mMainWindow;
    public ColorMenu(PaintMainWindow mainWindow)
    {
        super("Color");
        mMainWindow = mainWindow;
        
        JMenu colorMenu = new JMenu("Color");
        ButtonGroup buttonGroup = new ButtonGroup();
        
        JRadioButtonMenuItem blackMenuItem = new JRadioButtonMenuItem("Black");
        buttonGroup.add(blackMenuItem);
        add(blackMenuItem);
        class BlackLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setPenColor(Color.black);
            }    
        }
        blackMenuItem.addActionListener(new BlackLineMenuOptionListener());
        
        JRadioButtonMenuItem redMenuItem = new JRadioButtonMenuItem("Red");
        buttonGroup.add(redMenuItem);
        add(redMenuItem);
        class RedLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setPenColor(Color.RED);
            }    
        }
        redMenuItem.addActionListener(new RedLineMenuOptionListener());

        JRadioButtonMenuItem orangeMenuItem = new JRadioButtonMenuItem("Orange");
        buttonGroup.add(orangeMenuItem);
        add(orangeMenuItem);
        class OrangeLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setPenColor(Color.orange);
            }    
        }
        orangeMenuItem.addActionListener(new OrangeLineMenuOptionListener());
        
        JRadioButtonMenuItem yellowMenuItem = new JRadioButtonMenuItem("Yellow");
        buttonGroup.add(yellowMenuItem);
        add(yellowMenuItem);
        class YellowLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setPenColor(Color.yellow);
            }    
        }
        yellowMenuItem.addActionListener(new YellowLineMenuOptionListener());
        
        JRadioButtonMenuItem greenMenuItem = new JRadioButtonMenuItem("Green");
        buttonGroup.add(greenMenuItem);
        add(greenMenuItem);
        class GreenLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setPenColor(Color.green);
            }    
        }
        greenMenuItem.addActionListener(new GreenLineMenuOptionListener());
        
        JRadioButtonMenuItem blueMenuItem = new JRadioButtonMenuItem("Blue");
        buttonGroup.add(blueMenuItem);
        add(blueMenuItem);
        class BlueLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setPenColor(Color.blue);
            }    
        }
        blueMenuItem.addActionListener(new BlueLineMenuOptionListener());
        
        JRadioButtonMenuItem brownMenuItem = new JRadioButtonMenuItem("Brown");
        buttonGroup.add(brownMenuItem);
        add(brownMenuItem);
        class BrownLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                int r = 153;
                int g = 102;
                int b = 51;
                Color c = new Color(r, g, b);
                mMainWindow.getShapeManager().setPenColor(c);
            }    
        }
        brownMenuItem.addActionListener(new BrownLineMenuOptionListener());
        
        JRadioButtonMenuItem grayMenuItem = new JRadioButtonMenuItem("Gray");
        buttonGroup.add(grayMenuItem);
        add(grayMenuItem);
        class GrayLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setPenColor(Color.gray);
            }    
        }
        grayMenuItem.addActionListener(new GrayLineMenuOptionListener());
    }
}