package homework21;

public class LogicalOperationTable {
    public static void main(String[] args) {

        System.out.println("P\tQ\tP AND Q\tP OR Q\tP XOR Q\tNOT P");

        boolean[] values = {false, true};

        for (boolean P : values) {
            for (boolean Q : values) {
                System.out.println(
                        P + "\t" +
                                Q + "\t" +
                                (P && Q) + "\t\t" +
                                (P || Q) + "\t\t" +
                                (P ^ Q) + "\t\t" +
                                (!P)
                );
            }
        }
    }
}
