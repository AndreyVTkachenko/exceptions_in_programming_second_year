package gb.homework.services;

import gb.homework.models.UserData;

import java.util.Scanner;

public class ConsoleService {
    private final Scanner scanner = new Scanner(System.in);

    public UserData collectUserData() {
        UserData userData = new UserData();

        System.out.println("Введите ФИО:");
        String fullName = scanner.nextLine();
        userData.setFullName(fullName);

        System.out.println("Введите дату рождения (ДД.ММ.ГГГГ):");
        String dateOfBirth = scanner.nextLine();
        userData.setDateOfBirth(dateOfBirth);

        System.out.println("Введите номер телефона (11 цифр):");
        String phoneNumber = scanner.nextLine();
        userData.setPhoneNumber(phoneNumber);

        System.out.println("Введите пол (male/female):");
        String gender = scanner.nextLine();
        userData.setGender(gender);

        return userData;
    }
}
