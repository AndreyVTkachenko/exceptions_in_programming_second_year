package gb.seminar.my_code;

public class Task00 {
    public static void main(String[] args) {
        System.out.println(arrayLength(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 5));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(arrayLength(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 20));
    }

    public static int arrayLength(int[] array, int minLengthArray) {
        if (array.length < minLengthArray) {
            return -1;
        } else {
            return array.length;
        }
    }
}
