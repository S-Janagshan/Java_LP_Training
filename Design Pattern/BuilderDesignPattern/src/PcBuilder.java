public class PcBuilder {
    private String OS;
    private int ram;
    private String processor;

    private int setHarddiskSize;


    public PcBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PcBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PcBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PcBuilder setHarddiskSize(int setHarddiskSize) {
        this.setHarddiskSize = setHarddiskSize;
        return this;
    }


    public Pc getPc()
    {
        return new Pc(OS, ram, processor, setHarddiskSize);
    }

}
