public class Pc {
    private final String OS;
    private final int ram;
    private final String processor;
    private final int HarddiskSize;

    public Pc(String OS, int ram, String processor, int HarddiskSize) {
        this.OS = OS;
        this.ram = ram;
        this.processor = processor;
        this.HarddiskSize = HarddiskSize;
    }

    @Override
    public String toString() {
        return "Pc{" + "OS=" + OS + ", ram=" + ram + ", processor=" + processor + ", Hard_diskSize=" + HarddiskSize + "}";
    }
}
