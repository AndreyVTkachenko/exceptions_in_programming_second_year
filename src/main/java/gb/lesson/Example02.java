package gb.lesson;

import java.io.File;

public class Example02 {

    public static void main(String[] args) {
        System.out.println(getFileSize(new File("несуществующий_файл")));
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L; /// Код ошибки
        }
        return file.length();
    }
}
