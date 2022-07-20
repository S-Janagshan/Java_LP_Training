package JanaFactoryDesign;

public class Timelimited extends Basic {

    public String name = "Hoursly";
    public int price = 300;


    @Override
    public void printPack() {
        System.out.printf("%-15s %10s %n",name, price);
    }
}
