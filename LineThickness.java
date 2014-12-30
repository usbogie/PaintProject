import java.awt.BasicStroke;
import java.io.Serializable;

public class LineThickness implements Serializable
{
    private static final float THIN_LINE_THICKNESS = 2f;
    private static final float MEDIUM_LINE_THICKNESS = 5f;
    private static final float THICK_LINE_THICKNESS = 10f;

    public static final LineThickness THIN_LINE = new LineThickness(THIN_LINE_THICKNESS);
    public static final LineThickness MEDIUM_LINE = new LineThickness(MEDIUM_LINE_THICKNESS);
    public static final LineThickness THICK_LINE = new LineThickness(THICK_LINE_THICKNESS);

    private float mThickness = THIN_LINE_THICKNESS;
    
    public LineThickness()
    {
        mThickness = THIN_LINE_THICKNESS;        
    }
    
    public LineThickness(float thickness)
    {
        mThickness = thickness;        
    }

    public LineThickness(LineThickness thickness)
    {
        if (thickness == LineThickness.THIN_LINE)
            mThickness = THIN_LINE_THICKNESS;
        else if (thickness == MEDIUM_LINE)
            mThickness = MEDIUM_LINE_THICKNESS;
        else if (thickness == THICK_LINE)
            mThickness = THICK_LINE_THICKNESS;
        else
            mThickness = THIN_LINE_THICKNESS;
    }
    
    public BasicStroke getStrokeInformation()
    {
        return new BasicStroke(mThickness);
    }
    
    public float getLineThickness()
    {
        return mThickness;
    }
}
