package gb.lesson;

public class Example09 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 10 / 0; /// Будет выброшено исключение ArithmeticException
        System.out.println(array[1000]); /// Исключение не будет выброшено, так как программа уже завершилась на предыдущей строке
    }
}
