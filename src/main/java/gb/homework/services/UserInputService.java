package gb.homework.services;

import gb.homework.exceptions.InvalidDataException;
import gb.homework.models.UserData;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInputService {
    private final ValidationService validationService;

    public UserInputService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public UserData getUserData() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> userDataMap = new HashMap<>();

        System.out.println("Введите порядок номеров для ввода своих данных через запятую:");
        System.out.println("1 - Фамилия Имя Отчество");
        System.out.println("2 - Дата рождения");
        System.out.println("3 - Номер телефона");
        System.out.println("4 - Пол");

        String inputOrder = scanner.nextLine();
        String[] inputSequence = inputOrder.split(",");

        for (String inputOption : inputSequence) {
            switch (inputOption.trim()) {
                case "1":
                    System.out.println("Введите фамилию, имя и отчество, разделяя их пробелом:");
                    String fullName = scanner.nextLine();
                    validationService.validateFullName(fullName);
                    userDataMap.put("ФИО", fullName);
                    break;
                case "2":
                    System.out.println("Введите свою дату рождения в формате ДД.ММ.ГГГГ:");
                    String dateOfBirth = scanner.nextLine();
                    validationService.validateDateOfBirth(dateOfBirth);
                    userDataMap.put("Дата рождения", dateOfBirth);
                    break;
                case "3":
                    System.out.println("Введите номер своего телефона в международном формате (11 цифр):");
                    String phoneNumber = scanner.nextLine();
                    validationService.validatePhoneNumber(phoneNumber);
                    userDataMap.put("Телефон", phoneNumber);
                    break;
                case "4":
                    System.out.println("Введите свой пол (мужской -> male, женский -> female):");
                    String gender = scanner.nextLine().toLowerCase();
                    validationService.validateGender(gender);
                    userDataMap.put("Пол", gender);
                    break;
                default:
                    throw new InvalidDataException("Введен неверный номер: " + inputOption);
            }
        }

        if (userDataMap.size() != 4) {
            throw new InvalidDataException("Не все данные введены. Перезапустите программу.");
        }

        return new UserData(userDataMap.get("ФИО"),
                userDataMap.get("Дата рождения"),
                userDataMap.get("Телефон"),
                userDataMap.get("Пол"));
    }
}

