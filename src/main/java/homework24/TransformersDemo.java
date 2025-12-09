package homework24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransformersDemo {

    public static void main(String[] args) {
        // Создаём по одному трансформеру
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

        System.out.println();

        List<Transformer> transformers = Arrays.asList(optimus, megatron);

        System.out.println("=== List of transformers ===");
        for (Transformer transformer : transformers) {
            transformer.showInfo();
            System.out.println();
        }
    }
}