package gb.homework;

public class Task_03 {

    public static void main(String[] args) {
        int[] array1 = {5, 10, 15, 20};
        int[] array2 = {3, 8, 12, 18};

        try {
            int[] resultArray = getDifferenceArray(array1, array2);
            System.out.print("Результирующий массив: ");
            for (int val : resultArray) {
                System.out.print(val + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int[] getDifferenceArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длины массивов не равны. Операция невозможна.");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}

