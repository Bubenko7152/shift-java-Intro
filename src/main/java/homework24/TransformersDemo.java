package homework24;

import java.util.ArrayList;
import java.util.List;

public class TransformersDemo {

    public static void main(String[] args) {
        // Создаём по одному трансформеру
        Autobot optimus = new Autobot("Optimus Prime");
        Decepticon megatron = new Decepticon("Megatron");

        // Список трансформеров
        List<Transformer> transformers = new ArrayList<>();
        transformers.add(optimus);
        transformers.add(megatron);

        System.out.println("=== Autobot scenario ===");
        optimus.run();      // из интерфейса Action (default)
        optimus.fire();
        optimus.charge();
        optimus.transform(); // из абстрактного класса (реализация в Autobot)
        optimus.showInfo();

        System.out.println();

        System.out.println("=== Decepticon scenario ===");
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
        megatron.showInfo();

        System.out.println();
        System.out.println("=== List of transformers ===");
        for (Transformer transformer : transformers) {
            transformer.showInfo();
            System.out.println();
        }
    }
}