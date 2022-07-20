package JanaFactoryDesign;

public class DataPackage extends Package {
    @Override
    protected void packageDetails() {
        basic.add(new Unlimited());
        basic.add(new Timelimited());


    }
}
