package homework24;

public class TransformersDemo {
    public static void main(String[] args) {
        Autobot optimus = new Autobot("Optimus Prime");
        Decepticon megatron = new Decepticon("Megatron");

        System.out.println("=== Autobot scenario ===");
        optimus.run();
        optimus.fire();
        optimus.charge();
        optimus.transform();
        optimus.showInfo();

        System.out.println();
        System.out.println("=== Decepticon scenario ===");
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
        megatron.showInfo();
    }
}