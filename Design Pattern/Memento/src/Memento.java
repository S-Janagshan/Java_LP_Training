public class Memento
{
    private SmartTV TV;

    public Memento( SmartTV TV )
    {
        super();
        this.TV = TV;
    }

    public SmartTV getSmartTV()
    {
        return TV;
    }

    public void setLedTV( SmartTV TV )
    {
        this.TV = TV;
    }

    @Override
    public String toString()
    {
        return "Memento [TV=" + TV + "]";
    }



}