import java.util.ArrayList;
import java.util.List;

public class Caretaker
{
    private List<Memento> SmartTVList = new ArrayList<Memento>();

    public void addMemento( Memento m )
    {
        SmartTVList.add(m);
        System.out.println("SmartTV's snapshots Maintained by CareTaker :" + SmartTVList);
    }

    public Memento getMemento( int index )
    {
        return SmartTVList.get(index);
    }
}