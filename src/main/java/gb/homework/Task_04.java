package gb.homework;

public class Task_04 {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {2, 5, 6, 8};

        try {
            int[] resultArray = getQuotientArray(array1, array2);
            System.out.print("Результирующий массив: ");
            for (int val : resultArray) {
                System.out.print(val + " ");
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int[] getQuotientArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны. Операция невозможна.");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль в ячейке с индексом " + i);
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
