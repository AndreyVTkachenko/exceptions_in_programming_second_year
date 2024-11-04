package gb.lesson;

import java.io.File;

public class Example01 {

    public static void main(String[] args) {
        System.out.println(getFileSize(new File("несуществующий_файл")));
    }

    public static long getFileSize(File file) {
        return file.length();
    }
}
