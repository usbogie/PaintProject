//henry bogardus

import java.awt.Graphics2D;
import java.awt.Color;
public class Circle extends Shape
{
    public Circle(ShapeManager shapeManager, Point mPoint1)
    {
        super(shapeManager, mPoint1);
    }

    public void drawShape(Graphics2D g2)
    {
        int x1 = mPoint1.getX();
        int x2 = mPoint2.getX();
        int y1 = mPoint1.getY();
        int y2 = mPoint2.getY();
        int width = Math.abs(x2-x1);
        int height = Math.abs(y2-y1);
        
        if (width < height)
            height = width;
        else if (height < width)
            width = height;
        
        if (x1 > x2 && y1 > y2)
        {
            if (x1-x2 > y1-y2)
            {
                x2 = x1 + y2 - y1;
            }
            else if (y1-y2 > x1-x2)
            {
                y2 = y1 + x2 - x1;
            }
            drawCircle(g2, x2, y2, width, height);
        }
        else if (x1 > x2)
        {
            if (x1-x2 > y1-y2)
            {
                x2 = x1 - width;
            }
            drawCircle(g2, x2, y1, width, height);
        }
        else if (y1 > y2)
        {
            if (y1-y2 > x1-x2)
            {
                y2 = y1 - height;
            }
            drawCircle(g2, x1, y2, width, height);
        }
        else
        {
            drawCircle(g2, x1, y1, width, height);
        }
    }
    
    public void drawCircle(Graphics2D g2, int x, int y, int width, int height)
    {
        g2.setColor(mFillColor);
        if (mFillColor != Color.white)
            g2.fillOval(x, y, width, height);
        g2.setColor(mPenColor);
        g2.setStroke(mLineThickness.getStrokeInformation());
        g2.drawOval(x, y, width, height);
    }
}
