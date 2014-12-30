import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.Serializable;

abstract public class Shape implements Serializable
{
    protected transient ShapeManager mShapeManager;
    protected Point mPoint1;
    protected Point mPoint2;
    protected ShapeID mShapeID = ShapeID.DEFAULT_SHAPE;
    protected Color mPenColor = Color.BLUE;
    protected Color mFillColor = null;
    protected LineThickness mLineThickness = LineThickness.THIN_LINE;
    protected boolean mCompleted = false;
    
    public Shape (ShapeManager shapeManager, Point point)
    {
        mShapeManager = shapeManager;
        mShapeID = shapeManager.getCurShapeID();
        mPenColor = shapeManager.getCurPenColor();
        mFillColor = shapeManager.getCurFillColor();
        mLineThickness = shapeManager.getCurLineThickness();
        mPoint1 = new Point(point);
        mPoint2 = new Point(point);
    }
    
    public boolean checkCompleted()
    {
        return mCompleted;
    }
    
    public void processMousePressed(Point point) {}

    public void processMouseReleased(Point point)
    {
        mPoint2.setLocation(point);
        mCompleted = true;
    }
    
    public void processMouseDragged(Point point)
    {
        mPoint2.setLocation(point);
        mCompleted = false;
    }

    abstract public void drawShape(Graphics2D g2);
}
