//henry bogardus

import javax.swing.JMenuBar;

public class PaintMenuBar extends JMenuBar
{
    PaintMainWindow mMainWindow;
    public PaintMenuBar(PaintMainWindow mainWindow)
    {
        mMainWindow = mainWindow;
        
        PaintMenu paintMenu = new PaintMenu(mMainWindow);
        FileMenu fileMenu = new FileMenu(mMainWindow);
        EditMenu editMenu = new EditMenu(mMainWindow);
        ShapeMenu shapeMenu = new ShapeMenu(mMainWindow);
        ColorMenu colorMenu = new ColorMenu(mMainWindow);
        FillMenu fillMenu = new FillMenu(mMainWindow);
        LineWidthMenu lineWidthMenu = new LineWidthMenu(mMainWindow);
        HelpMenu helpMenu = new HelpMenu(mMainWindow);
        
        add(paintMenu);
        add(fileMenu);
        add(editMenu);
        add(shapeMenu);
        add(colorMenu);
        add(fillMenu);
        add(lineWidthMenu);
        add(helpMenu);
    }
}
