class Prototype
{
    public static void main (String[] args)
    {
        BikeStore.getBike("Yamaha").addBike();
        BikeStore.getBike("Honda").addBike();
        BikeStore.getBike("Honda").addBike();
        BikeStore.getBike("Yamaha").addBike();
    }
}