package homework24;

import java.util.Arrays;
import java.util.List;

public class TransformersDemo {

    public static void main(String[] args) {
        Autobot optimus = new Autobot("Optimus Prime");
        Decepticon megatron = new Decepticon("Megatron");

        List<Transformer> transformers = Arrays.asList(optimus, megatron);

        System.out.println("=== Scenario ===");
        for (Transformer t : transformers) {
            t.run();
            t.fire();
            t.charge();
            t.transform();
            t.showInfo();
            System.out.println();
        }
    }
}