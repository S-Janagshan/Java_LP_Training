package Jana_singleton_design;

public class ManagerMain {
    public static void main(String[] args) {
        Manager manager1 = Manager.getManager();
        System.out.println("First object " + manager1);

        Manager manager2 = Manager.getManager();
        System.out.println("Second object " + manager2);
    }
}
