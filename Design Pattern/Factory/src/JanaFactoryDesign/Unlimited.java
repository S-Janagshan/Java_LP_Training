package JanaFactoryDesign;

public class Unlimited extends Basic {

    public String name = "Monthly";
    public int price = 6500;


    @Override
    public void printPack() {
        System.out.printf("%-15s %10s %n",name, price);
    }
}
