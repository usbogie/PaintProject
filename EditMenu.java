//henry bogardus

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import java.awt.Toolkit;

public class EditMenu extends JMenu
{
    PaintMainWindow mMainWindow;
    public EditMenu(PaintMainWindow mainWindow)
    {
        super("Edit");
        mMainWindow = mainWindow;
        JMenuItem undoMenuItem = new JMenuItem("Undo");
        add(undoMenuItem);
        undoMenuItem.setMnemonic(KeyEvent.VK_Z);
        undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        class UndoMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().undo();
                mMainWindow.getPaintMainPane().refreshDisplay();
            }    
        }
        undoMenuItem.addActionListener(new UndoMenuOptionListener());
        
        JMenuItem redoMenuItem = new JMenuItem("Redo");
        add(redoMenuItem);
        redoMenuItem.setMnemonic(KeyEvent.VK_R);
        redoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        class RedoMenuOptionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                mMainWindow.getShapeManager().redo();
                mMainWindow.getPaintMainPane().refreshDisplay();
            }    
        }
        redoMenuItem.addActionListener(new RedoMenuOptionListener());
    }   
}