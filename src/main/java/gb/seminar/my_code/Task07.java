package gb.seminar.my_code;

import java.util.Arrays;

public class Task07 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] result = sumArrays(array1, array2);

        if (result != null) {
            System.out.println("Сумма массивов: " + Arrays.toString(result));
        } else {
            System.out.println("Длины массивов не равны");
        }
    }

    public static int[] sumArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return null;
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }
}
