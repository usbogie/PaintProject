//henry bogardus

import java.awt.Graphics2D;
import java.awt.Color;
public class Rectangle extends Shape
{
    public Rectangle(ShapeManager shapeManager, Point point1)
    {
        super(shapeManager, point1);
    }

    public void drawShape(Graphics2D g2)
    {
        int width = Math.abs(mPoint2.getX() - mPoint1.getX());
        int height = Math.abs(mPoint2.getY() - mPoint1.getY());
        g2.setColor(mFillColor);
        if (mPoint2.getX() < mPoint1.getX() && mPoint2.getY() < mPoint1.getY())
        {
            if (mFillColor != Color.white)
                g2.fillRect(mPoint2.getX(), mPoint2.getY(), width, height);
            g2.setColor(mPenColor);
            g2.setStroke(mLineThickness.getStrokeInformation());
            g2.drawRect(mPoint2.getX(), mPoint2.getY(), width, height);
        }
        else if (mPoint2.getX() < mPoint1.getX())
        {
            if (mFillColor != Color.white)
                g2.fillRect(mPoint2.getX(), mPoint1.getY(), width, height);   
            g2.setColor(mPenColor);
            g2.setStroke(mLineThickness.getStrokeInformation());
            g2.drawRect(mPoint2.getX(), mPoint1.getY(), width, height);           
        }
        else if (mPoint2.getY() < mPoint1.getY())
        {
            if (mFillColor != Color.white)
                g2.fillRect(mPoint1.getX(), mPoint2.getY(), width, height);
            g2.setColor(mPenColor);
            g2.setStroke(mLineThickness.getStrokeInformation());
            g2.drawRect(mPoint1.getX(), mPoint2.getY(), width, height);
        }
        else
        {
            if (mFillColor != Color.white)
                g2.fillRect(mPoint1.getX(), mPoint1.getY(), width, height);
            g2.setColor(mPenColor);
            g2.setStroke(mLineThickness.getStrokeInformation());
            g2.drawRect(mPoint1.getX(), mPoint1.getY(), width, height);
        }
    }
}
