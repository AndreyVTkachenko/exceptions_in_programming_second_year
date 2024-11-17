package gb.seminar;

import java.io.IOException;

public class Task_01 {
    public static void main(String[] args) {

        try {
            doSomething();
        } catch (IOException e) {
            System.out.println("Исключение ввода-вывода");
            e.printStackTrace();
        }
    }

    public static void doSomething() throws IOException {
        throw new IOException();
    }
}
