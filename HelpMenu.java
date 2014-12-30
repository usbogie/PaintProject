//henry bogardus

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class HelpMenu extends JMenu
{
    PaintMainWindow mMainWindow;
    public HelpMenu(PaintMainWindow mainWindow)
    {        
        super("Help");
        mMainWindow = mainWindow;
        JMenuItem helpMenuItem = new JMenuItem("Help");
        add(helpMenuItem);
        class HelpMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                JOptionPane.showMessageDialog(null, "Help? Lol jk");
            }    
        }
        helpMenuItem.addActionListener(new HelpMenuOptionListener());
    }
}
