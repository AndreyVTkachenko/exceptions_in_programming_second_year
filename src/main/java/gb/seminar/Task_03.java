package gb.seminar;

import java.io.FileNotFoundException;

public class Task_03 {

    public class DivisionByZeroException extends Exception {
        public DivisionByZeroException() {
            super("Делить на ноль нельзя!");
        }
    }

    public class NullArrayElementException extends Exception {
        public NullArrayElementException() {
            super("Обращение к пустому элементу массива.");
        }
    }

    public class FileNotFoundException extends Exception {
        public FileNotFoundException() {
            super("Файл не найден.");
        }
    }
}


