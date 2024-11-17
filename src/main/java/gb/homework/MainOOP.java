package gb.homework;

import gb.homework.exceptions.InvalidDataException;
import gb.homework.models.UserData;
import gb.homework.services.FileService;
import gb.homework.services.UserInputService;
import gb.homework.services.ValidationService;

public class MainOOP {
    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();
        UserInputService userInputService = new UserInputService(validationService);
        FileService fileService = new FileService();

        try {
            UserData userData = userInputService.getUserData();
            fileService.saveUserData(userData);
            System.out.println("Данные успешно сохранены!");
        } catch (InvalidDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла неожиданная ошибка: " + e.getMessage());
        }
    }
}
