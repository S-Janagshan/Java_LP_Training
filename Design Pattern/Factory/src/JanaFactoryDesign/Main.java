package JanaFactoryDesign;

public class Main {

    public static void main(String[] args) {

        Package package2 = Factory.createPackage(PackageDetails.DataPackage);
        package2.printPack();

        Package package3 = Factory.createPackage(PackageDetails.VoicePackage);
        package3.printPack();

        Package package4 = Factory.createPackage(PackageDetails.ComboPackage);
        package3.printPack();
    }

}