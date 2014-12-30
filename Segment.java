//henry bogardus

import java.awt.Graphics2D;

public class Segment extends Shape
{
    public Segment(ShapeManager shapeManager, Point point1)
    {
        super(shapeManager, point1);
    }

    public void drawShape(Graphics2D g2)
    {
        int width = Math.abs(mPoint2.getX() - mPoint1.getX());
        int height = Math.abs(mPoint2.getY() - mPoint1.getY());
        g2.setColor(mPenColor);
        g2.setStroke(mLineThickness.getStrokeInformation());
        g2.drawLine(mPoint1.getX(), mPoint1.getY(), mPoint2.getX(), mPoint2.getY());
    }
}
