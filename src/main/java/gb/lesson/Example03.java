package gb.lesson;

import java.io.File;

public class Example03 {

    public static void main(String[] args) {
        System.out.print("Этот файл имеет размер: ");
        System.out.print(getFileSize(new File("C:\\Users\\gepat\\Documents\\training at GeekBrains\\" +
                                                "Software Testing - Base Course (Svyatoslav Kulikov) - 3rd edition - RU.pdf")));
        System.out.println(" байт");
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
