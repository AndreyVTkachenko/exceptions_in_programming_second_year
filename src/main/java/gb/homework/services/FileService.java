package gb.homework.services;

import gb.homework.exceptions.FileWriteException;
import gb.homework.models.UserData;

import java.io.FileWriter;
import java.io.IOException;

public class FileService {
    public void saveUserData(UserData userData) {
        String fileName = "C:\\Users\\gepat\\Documents\\training at GeekBrains\\Исключения в программировании и их обработка" +
                          "\\exceptions_in_programming_second_year\\src\\main\\java\\gb\\homework\\list_of_people\\" +
                          userData.getFullName().split(" ")[0] + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            String dataLine = userData.getFullName() + " " +
                              userData.getDateOfBirth() + " " +
                              userData.getPhoneNumber() + " " +
                              userData.getGender() + "\n";
            writer.write(dataLine);
        } catch (IOException e) {
            throw new FileWriteException("Ошибка при записи данных в файл.", e);
        }
    }
}
