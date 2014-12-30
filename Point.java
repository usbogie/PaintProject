//henry bogardus

import java.io.Serializable;

public class Point implements Serializable
{
    int x;
    int y;

    public Point(int xValue, int yValue)
    {
        x = xValue;
        y = yValue;
    }
    
    public Point(Point toCopy)
    {
        x = toCopy.getX();
        y = toCopy.getY();
    }
        
    public void setX(int xValue)
    {
        x = xValue;
    }
       
    public int getX()
    {
        return x;
    }
    
    public void setY(int yValue)
    {
        y = yValue;
    }

    public int getY()
    {
        return y;
    }
    
    public void setLocation(Point point)
    {
        x = point.getX();
        y = point.getY();
    }
    
    public Point getLocation()
    {
        return this;
    }
}
