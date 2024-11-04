package gb.homework;

public class Task_01 {

    public static void main(String[] args) {
        Task_01 examples = new Task_01();

        try {
            examples.causeArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение: " + e);
        }

        try {
            examples.causeNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение: " + e);
        }

        try {
            examples.causeArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e);
        }
    }

    // Метод вызывает ArithmeticException (деление на ноль)
    public void causeArithmeticException() {
        int result = 10 / 0; // Здесь произойдет деление на ноль
    }

    // Метод вызывает NullPointerException (обращение к методу через null-ссылку)
    public void causeNullPointerException() {
        String str = null;
        int length = str.length(); // Попытка вызвать метод у null-ссылки
    }

    // Метод вызывает ArrayIndexOutOfBoundsException (обращение за пределы массива)
    public void causeArrayIndexOutOfBoundsException() {
        int[] array = {1, 2, 3};
        int value = array[5]; // Попытка обратиться к индексу за пределами массива
    }
}

