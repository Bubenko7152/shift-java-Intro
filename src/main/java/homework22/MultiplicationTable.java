package homework22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();

        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();

        if (step <= 0) {
            System.out.println("Ошибка: шаг должен быть положительным числом.");
            return;
        }

        int from = Math.min(first, second);
        int to = Math.max(first, second);

        int[] values = buildValues(from, to, step);

        int cellWidth = getMaxCellWidth(values);

        printTable(values, cellWidth);
    }

    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }

    private static int[] buildValues(int from, int to, int step) {
        List<Integer> list = new ArrayList<>();

        int current = from;
        list.add(current);

        while (current + step < to) {
            current += step;
            list.add(current);
        }

        if (current != to) {
            list.add(to);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static int getMaxCellWidth(int[] values) {
        int maxWidth = 0;

        for (int value : values) {
            maxWidth = Math.max(maxWidth, getCellWidth(value));
        }

        for (int x : values) {
            for (int y : values) {
                int product = x * y;
                maxWidth = Math.max(maxWidth, getCellWidth(product));
            }
        }

        return maxWidth + 1;
    }

    private static void printTable(int[] values, int cellWidth) {
        System.out.printf("%" + cellWidth + "s", "");
        for (int value : values) {
            System.out.printf("%" + cellWidth + "d", value);
        }
        System.out.println();

        for (int row : values) {
            System.out.printf("%" + cellWidth + "d", row);

            for (int col : values) {
                int product = row * col;
                System.out.printf("%" + cellWidth + "d", product);
            }
            System.out.println();
        }
    }
}
