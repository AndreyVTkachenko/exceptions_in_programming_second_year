package gb.homework;

import java.util.Scanner;

public class Task01 {

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();
            try {
                result = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное дробное число.");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели число: " + userInput);
    }
}

