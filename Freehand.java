//henry bogardus

import java.awt.Graphics2D;
import java.util.LinkedList;
import java.util.ListIterator;
public class Freehand extends Shape
{
    LinkedList<Point> pointList = new LinkedList<Point>();
    public Freehand(ShapeManager shapeManager, Point point1)
    {
        super(shapeManager, point1);
    }

    public void drawShape(Graphics2D g2)
    {
        g2.setColor(mPenColor);
        g2.setStroke(mLineThickness.getStrokeInformation());
        if (pointList.size() >= 2)
        {
            ListIterator<Point> it1 = pointList.listIterator(0);
            ListIterator<Point> it2 = pointList.listIterator(1);
            while (it2.hasNext())
            {
                Point curPoint = it1.next();
                Point nextPoint = it2.next();
                
                int x1 = curPoint.getX();
                int y1 = curPoint.getY();
                int x2 = nextPoint.getX();
                int y2 = nextPoint.getY();
                
                g2.drawLine(x1, y1, x2, y2);
            }
        }
    }
    
    public void processMousePressed(Point point) 
    {
        pointList.add(point);
    }

    public void processMouseReleased(Point point)
    {
        pointList.add(point);
        mCompleted = true;
    }
    
    public void processMouseDragged(Point point)
    {
        pointList.add(point);
        mCompleted = false;
    }
}
