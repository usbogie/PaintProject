//henry bogardus

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FileMenu extends JMenu
{
    PaintMainWindow mMainWindow;
    public FileMenu(PaintMainWindow mainWindow)
    {
        super("File");
        mMainWindow = mainWindow;
        JMenu fileMenu = new JMenu("File");
        
        JMenuItem newMenuItem = new JMenuItem("New");
        add(newMenuItem);
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        class NewMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                newWindow();
            }    
        }
        newMenuItem.addActionListener(new NewMenuOptionListener());
        
        JMenuItem openMenuItem = new JMenuItem("Open");
        add(openMenuItem);
        openMenuItem.setMnemonic(KeyEvent.VK_O);
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        class OpenMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().loadFromFile();
            }    
        }
        openMenuItem.addActionListener(new OpenMenuOptionListener());
        
        addSeparator();
                
        JMenuItem saveMenuItem = new JMenuItem("Save");
        add(saveMenuItem);
        saveMenuItem.setMnemonic(KeyEvent.VK_S);
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        class SaveMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().saveToFile();
            }    
        }
        saveMenuItem.addActionListener(new SaveMenuOptionListener());
        
    }
    
    public void newWindow()
    {
        Object[] options = {"OK", "Back To Paint", "Save"};
        int option = JOptionPane.showOptionDialog(null, "Are you sure you want to open\na new window without saving?",
                                            "New Window Options", JOptionPane.YES_NO_CANCEL_OPTION, 
                                            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        if (option == 0)
        {
            PaintMainWindow mainWindow = new PaintMainWindow();
            mainWindow.go();
        }
        else if (option == 2)
        {
            mMainWindow.getShapeManager().saveToFile();
            PaintMainWindow mainWindow = new PaintMainWindow();
            mainWindow.go();
        }
    }
}
