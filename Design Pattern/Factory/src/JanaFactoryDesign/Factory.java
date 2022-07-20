package JanaFactoryDesign;

public class Factory {

    public static Package createPackage(PackageDetails packageDetails) {

        switch (packageDetails) {

            case DataPackage:
                return new DataPackage();
            case VoicePackage:
                return new VoicePackage();
            case ComboPackage:
                return new ComboPackage();

            default:
                return null;
        }
    }
}
