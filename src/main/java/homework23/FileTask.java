package homework23;

import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
    public static void main(String[] args) {
        String fileName = "multiplication.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    writer.write((i * j) + "\t");
                }
                writer.write("\n");
            }
            System.out.println("Файл успешно создан: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи файла");
        }
    }
}