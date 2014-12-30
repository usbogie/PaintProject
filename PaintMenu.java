//henry bogardus

import javax.swing.*;
import java.awt.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintMenu extends JMenu
{
    PaintMainWindow mMainWindow;
    public PaintMenu(PaintMainWindow mainWindow)
    {
        super("Paint");
        mMainWindow = mainWindow;
        JMenuItem aboutMenuItem = new JMenuItem("About Paint");
        add(aboutMenuItem);
        class AboutMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                JOptionPane.showMessageDialog(null, "This is Henry's Paint!!!!!!!!!!\nYou can draw in it and stuff");
            }    
        }
        aboutMenuItem.addActionListener(new AboutMenuOptionListener());
        
        JMenuItem quitMenuItem = new JMenuItem("Quit");
        add(quitMenuItem);
        quitMenuItem.setMnemonic(KeyEvent.VK_Q);
        quitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        class QuitMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                quitOption();
            }    
        }
        quitMenuItem.addActionListener(new QuitMenuOptionListener());
        
    }
    
    public void quitOption()
    {
        int optionInt = JOptionPane.showConfirmDialog(null, "Please save if you havent't already.", "Quit Option Selected", JOptionPane.YES_NO_OPTION);
        
        if (optionInt == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }
}