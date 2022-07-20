package JanaFactoryDesign;

public class ComboPackage extends Package {
    @Override
    protected void packageDetails() {
        basic.add(new Unlimited());
        basic.add(new Timelimited());

    }
}
