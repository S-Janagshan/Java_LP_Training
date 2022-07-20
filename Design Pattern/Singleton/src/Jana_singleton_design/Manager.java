package Jana_singleton_design;

public class Manager {
    private static volatile Manager manager;

    //Making method private so the object can't create from outside
    private Manager() {
        if (manager != null) {
            throw new RuntimeException("Use getPrinterInstance() method");
        }
    }

    public static Manager getManager() {
        if (manager == null) {
            synchronized (Manager.class) {
                manager = new Manager();
            }
        }
        return manager;
    }

}
