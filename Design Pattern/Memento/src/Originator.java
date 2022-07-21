public class Originator
{
    SmartTV TV;

    public SmartTV getSmartTV()
    {
        return TV;
    }

    public void setSmartTV( SmartTV TV )
    {
        this.TV = TV;
    }

    public Memento createMemento()
    {
        return new Memento(TV);
    }

    public void setMemento( Memento memento )
    {
        TV = memento.getSmartTV();
    }

    @Override
    public String toString()
    {
        return "Originator [TV=" + TV + "]";
    }



}