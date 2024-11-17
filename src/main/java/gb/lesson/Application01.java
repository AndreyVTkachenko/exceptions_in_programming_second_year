package gb.lesson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\gepat\\Documents\\training at GeekBrains" +
                                                "\\Исключения в программировании и их обработка\\exceptions_in_programming_second_year" +
                                                "\\src\\main\\java\\gb\\lesson\\test.txt");
             FileWriter writer = new FileWriter("C:\\Users\\gepat\\Documents\\training at GeekBrains" +
                                                "\\Исключения в программировании и их обработка\\exceptions_in_programming_second_year" +
                                                "\\src\\main\\java\\gb\\lesson\\file.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
        }
        System.out.println("Копирование завершено.");
    }
}
