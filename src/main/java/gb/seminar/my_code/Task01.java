package gb.seminar.my_code;

public class Task01 {
    public static void main(String[] args) {
        arrayMessage(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 20, 1);
        System.out.println("-----------------------------------------------------------------------------------------");
        arrayMessage(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 5, 729);
        System.out.println("-----------------------------------------------------------------------------------------");
        arrayMessage(null, 8, 1);
        System.out.println("-----------------------------------------------------------------------------------------");
        arrayMessage(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 10, 6);
    }

    public static int arrayMethods(int[] array, int minLengthArray, int number) {
        if (array == null) {
            return -3;
        } else if (array.length < minLengthArray) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    return i;
                }
            }
        }
        return -2;
    }

    public static void arrayMessage(int[] array, int minLengthArray, int number) {
        int result = arrayMethods(array, minLengthArray, number);
        switch (result) {
            case -1:
                System.out.println("Длина массива меньше заданного минимума: " + minLengthArray);
                break;
            case -2:
                System.out.println("Искомый элемент: " + number + " не найден.");
                break;
            case -3:
                System.out.println("Вместо массива пришел null");
                break;
            default:
                System.out.println("Индекс искомого элемента: " + result);
        }
    }
}
