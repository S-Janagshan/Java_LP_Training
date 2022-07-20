import java.util.HashMap;
import java.util.Map;

class BikeStore {

    private static Map<String, Bike> BikeMap = new HashMap<String, Bike>();

    static
    {
        BikeMap.put("Yamaha", new YamahaBike());
        BikeMap.put("Honda", new HondaBike());
    }

    public static Bike getBike(String BikeName)
    {
        return (Bike) BikeMap.get(BikeName).clone();
    }
}
 