class HondaBike extends Bike
{
    public HondaBike()
    {
        this.BikeName = "Honda";
    }

    @Override
    void addBike()
    {
        System.out.println("Honda Bike added");
    }

}