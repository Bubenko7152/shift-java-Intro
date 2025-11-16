package homework21;

public class ParrotsTask {
    public static void main(String[] args) {

        int snakeLengthCm = 380;
        int parrotsCount = 38;
        int monkeysCount = 5;
        int elephantsCount = 2;

        // 1 попугай = 380 / 38 см
        double parrotMeter = (double) snakeLengthCm / parrotsCount / 100;

        // 1 мартышка = 380 / 5 см
        double monkeyMeter = (double) snakeLengthCm / monkeysCount / 100;

        // 1 слонёнок = 380 / 2 см
        double elephantMeter = (double) snakeLengthCm / elephantsCount / 100;

        System.out.println("Рост удава: " + snakeLengthCm / 100.0 + " м");
        System.out.println("Рост попугая: " + parrotMeter + " м");
        System.out.println("Рост мартышки: " + monkeyMeter + " м");
        System.out.println("Рост слонёнка: " + elephantMeter + " м");

        double sum = (snakeLengthCm / 100.0)
                + parrotMeter + monkeyMeter + elephantMeter;

        System.out.println("Суммарный рост всех персонажей: " + sum + " м");
    }
}
