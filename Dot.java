//henry bogardus

import java.awt.Graphics2D;

public class Dot extends Shape
{
    public Dot(ShapeManager shapeManager, Point point1)
    {
        super(shapeManager, point1);
    }

    public void drawShape(Graphics2D g2)
    {
        g2.setColor(mPenColor);
        g2.setStroke(mLineThickness.getStrokeInformation()); 
        g2.drawOval(mPoint1.getX()-3, mPoint1.getY()-3, 6, 6);
        g2.fillOval(mPoint1.getX()-3, mPoint1.getY()-3, 6, 6);
    }
}
