package gb.seminar.seminar_code;

import java.util.ArrayList;
import java.util.List;

public class Seminar1_4_ {

    public static void main(String[] args) {
        Integer[] arr = {1, null, 2, null, 3};
        List<Integer> nullElements = checkArray(arr);
        if (nullElements.size() > 0) {
            System.out.println("Массив содержит пустые элементы на позициях" + nullElements);
        } else {
            System.out.println("Массив не содержит пустых значений");
        }
    }

    public static List<Integer> checkArray(Integer[] arr) {
        List<Integer> nullElements = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullElements.add(i);
            }
        }
        return nullElements;
    }
}
