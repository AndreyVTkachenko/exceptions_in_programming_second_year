package gb.seminar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = readData("seminar_data.txt");
        writeData("seminar_data.txt", map);
    }

    public static void writeData(String fileName, HashMap<String, Integer> map) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);

            for (String name : map.keySet()) {
                int value = map.get(name);
                writer.write(name + "=" + value + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }

    public static HashMap<String, Integer> readData(String fileName) {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split("=");
                if (split.length != 2) {
                    throw new IllegalArgumentException("Неверные данные в строке: " + line);
                }
                String name = split[0];
                String value = split[1];
                int valueInt = 0;
                if (value.equals("?")) {
                    valueInt = split[0].length();
                } else {
                    try {
                        valueInt = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Неверный формат числа: " + line, e);
                    }
                }
                map.put(name, valueInt);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return map;
    }
}
