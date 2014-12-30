//henry bogardus

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;

public class PaintMainWindow extends JFrame
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 500;
    
    private PaintMenuBar mMenuBar;
    private PaintMainPane mMainPane;
    private ShapeManager mShapeManager;
    
    public PaintMainWindow()
    {
        JFrame frame = new JFrame();        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mMenuBar = new PaintMenuBar(this);
        setJMenuBar(mMenuBar);
        
        mMainPane = new PaintMainPane(this);
        setContentPane(mMainPane);
        
        mShapeManager = new ShapeManager(this);
        
        this.setBackground(Color.white);
        
        setLocationRelativeTo(null);
    }
    
    public ShapeManager getShapeManager()
    {
        return mShapeManager;
    }
    
    public PaintMenuBar getPainMenuBar()
    {
        return mMenuBar;
    }
    
    public PaintMainPane getPaintMainPane()
    {
        return mMainPane;
    }
    
    public void go()
    {
        setVisible(true);
    }
}