//henry bogardus

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LineWidthMenu extends JMenu
{
    PaintMainWindow mMainWindow;
    public LineWidthMenu(PaintMainWindow mainWindow)
    {        
        super("Line Width");
        mMainWindow = mainWindow;
        JMenuItem thinLineMenuItem = new JMenuItem("Thin");
        add(thinLineMenuItem);
        class ThinLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setLineThickness(LineThickness.THIN_LINE);
            }    
        }
        thinLineMenuItem.addActionListener(new ThinLineMenuOptionListener());
       
        JMenuItem mediumLineMenuItem = new JMenuItem("Medium");
        add(mediumLineMenuItem);
        class MediumLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setLineThickness(LineThickness.MEDIUM_LINE);
            }    
        }
        mediumLineMenuItem.addActionListener(new MediumLineMenuOptionListener());
         
        JMenuItem thickLineMenuItem = new JMenuItem("Thick");
        add(thickLineMenuItem);
        class ThickLineMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().setLineThickness(LineThickness.THICK_LINE);
            }    
        }
        thickLineMenuItem.addActionListener(new ThickLineMenuOptionListener());
    }
}