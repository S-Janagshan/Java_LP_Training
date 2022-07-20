public class Main {
    public static void main(String[] args) {

        Pc p = new PcBuilder().setOS("Windows10").setRam(8).setHarddiskSize(2000).getPc();
        System.out.println(p);
    }
}