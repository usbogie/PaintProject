/**
 * Class used to encapsulate shape identifier information.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.Serializable;

public class ShapeID implements Serializable
{
    final static public ShapeID DEFAULT_SHAPE = new ShapeID();
    final static public ShapeID DOT = DEFAULT_SHAPE;
    final static public ShapeID RECTANGLE = new ShapeID();
    final static public ShapeID SQUARE = new ShapeID();
    final static public ShapeID OVAL = new ShapeID();
    final static public ShapeID CIRCLE = new ShapeID();
    final static public ShapeID SEGMENT = new ShapeID();
    final static public ShapeID FREEHAND = new ShapeID();
    final static public ShapeID TEXT = new ShapeID();
}
