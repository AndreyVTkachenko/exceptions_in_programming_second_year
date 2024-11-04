package gb.lesson;

public class Example05 {

    public static void main(String[] args) {
        System.out.println(divide(-10, 10));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return -1; /// Код ошибки
        }
        return a / b;
    }
}
