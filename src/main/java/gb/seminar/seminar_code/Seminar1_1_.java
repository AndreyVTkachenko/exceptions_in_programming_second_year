package gb.seminar.seminar_code;

public class Seminar1_1_ {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 5;
        int result = searchElement(arr, element);
        if (result == -1) {
            System.out.println("Длина массива меньше 3");
        } else if (result == -2) {
            System.out.println("Искомый элемент не найден");
        } else if (result == -3) {
            System.out.println("Массив не передан");
        } else {
            System.out.printf("Искомый элемент имеет индекс %d", result);
        }
    }

    public static int searchElement(int[] arr, int element) {
        if (arr == null) {
            return -3;
        }

        int minElement = 3;
        if (arr.length < minElement) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        return -2;
    }
}
