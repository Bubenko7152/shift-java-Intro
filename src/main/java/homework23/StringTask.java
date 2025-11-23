package homework23;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        System.out.println("Введите символ для замены:");
        String symbol = scanner.nextLine();

        // 1. Убираем лишние пробелы (делаем одинарные)
        String normalized = input.trim().replaceAll("\\s+", " ");

        // Если строка не изменилась после нормализации — запомним это
        boolean sameAfterNormalization = normalized.equals(input);

        // 2. Если символ — пробел, замены запрещены
        if (symbol.equals(" ")) {
            System.out.println("Нельзя использовать пробел как символ для поиска.");
            return;
        }

        // 3. Заменяем ВСЕ вхождения символа на пробел
        String replaced = normalized.replace(symbol, " ");

        // 4. Снова убираем двойные пробелы, которые могли появиться
        replaced = replaced.trim().replaceAll("\\s+", " ");

        // Результат
        System.out.println("Исходная строка: " + input);
        System.out.println("Преобразованная строка: " + replaced);

        if (sameAfterNormalization) {
            System.out.println("Строка не изменилась после преобразования.");
        }
    }
}