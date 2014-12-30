import javax.swing.JOptionPane;

public class ShapeFactory
{
    public static Shape createNewShape(ShapeManager shapeManager, Point point)    
    {
        ShapeID shapeID = shapeManager.getCurShapeID();
        if (shapeID == ShapeID.RECTANGLE)
            return (Shape) new Rectangle(shapeManager, point);        
        else if (shapeID == shapeID.DOT)
             return (Shape) new Dot(shapeManager, point);
        else if (shapeID == ShapeID.SEGMENT)
            return (Shape) new Segment(shapeManager, point);              
        else if (shapeID == ShapeID.SQUARE)
            return (Shape) new Square(shapeManager, point);
        else if (shapeID == ShapeID.OVAL)
            return (Shape) new Oval(shapeManager, point);
        else if (shapeID == ShapeID.CIRCLE)
            return (Shape) new Circle(shapeManager, point);
        else if (shapeID == ShapeID.FREEHAND)
            return (Shape) new Freehand(shapeManager, point);
        else
        {
            JOptionPane.showMessageDialog(null, "Unrecognized Shape ID!");
            System.out.println("Unrecognized shape type!");
        }
            
        return null;
    }
}
