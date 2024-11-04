package gb.seminar.my_code;

import java.util.ArrayList;
import java.util.List;

public class Task04_1 {
    public static void main(String[] args) {
        checkArray(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("-----------------------------------------------------------------------------------------");
        checkArray(new Integer[]{1, 2, null, 4, 5, 6, null, 8, null, 10});
    }

    public static void checkArray(Integer[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                list.add(i);
            }
        }
        if (list.size() > 0) {
            throw new RuntimeException("Индексы элементов массива равные null: " + list);
        }
    }
}
