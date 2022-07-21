public class MementoClient
{

    public static void main( String[] args )
    {
        Originator originator = new Originator();
        originator.setSmartTV(new SmartTV("42 inch", "60000Rs", false));

        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.createMemento());

        originator.setSmartTV(new SmartTV("46 inch", "80000Rs", true));
        caretaker.addMemento(originator.createMemento());

        originator.setSmartTV(new SmartTV("50 inch", "100000Rs", true));

        System.out.println("\n Originator current state : " + originator);

        System.out.println("\n Originator restoring to 42 inch Smart TV...");

        originator.setMemento(caretaker.getMemento(0));

        System.out.println("\n Originator current state : " + originator);

    }

}