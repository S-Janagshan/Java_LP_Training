import java.util.HashMap;
import java.util.Map;


abstract class Bike implements Cloneable
{

    protected String BikeName;

    abstract void addBike();

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}


