package gb.homework.services;

import gb.homework.exceptions.InvalidDataException;
import gb.homework.models.UserData;

public class ValidationService {
    public void validateUserData(UserData userData) {
        validateFullName(userData.getFullName());
        validateDateOfBirth(userData.getDateOfBirth());
        validatePhoneNumber(userData.getPhoneNumber());
        validateGender(userData.getGender());
    }

    void validateFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new InvalidDataException("ФИО не может быть пустым.");
        }

        String[] parts = fullName.split(" ");
        if (parts.length != 3) {
            throw new InvalidDataException("ФИО должно содержать фамилию, имя и отчество, разделенные пробелами.");
        }

        for (String part : parts) {
            if (!part.matches("[a-zA-Zа-яА-Я]+")) {
                throw new InvalidDataException("ФИО должно содержать только буквы.");
            }
        }
    }

    void validateDateOfBirth(String dateOfBirth) {
        if (!dateOfBirth.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InvalidDataException("Дата рождения должна быть в формате ДД.ММ.ГГГГ.");
        }

        String[] parts = dateOfBirth.split("\\.");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (month < 1 || month > 12) {
            throw new InvalidDataException("Месяц должен быть от 1 до 12.");
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int[] daysInMonth = {31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (day < 1 || day > daysInMonth[month - 1]) {
            throw new InvalidDataException("День должен быть корректным для данного месяца.");
        }

        if (year < 1900 || year > 2023) {
            throw new InvalidDataException("Год должен быть в диапазоне 1900–2023.");
        }
    }

    void validatePhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("\\d{11}")) {
            throw new InvalidDataException("Номер телефона должен содержать ровно 11 цифр.");
        }
    }

    void validateGender(String gender) {
        if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) {
            throw new InvalidDataException("Пол должен быть 'male' или 'female'.");
        }
    }
}
