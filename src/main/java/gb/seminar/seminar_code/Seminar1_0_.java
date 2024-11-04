package gb.seminar.seminar_code;

public class Seminar1_0_ {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int minLength = 5;

        int result = checkArrayLength(arr, minLength);
        System.out.println(result);
    }

    public static int checkArrayLength(int[] arr, int minLength) {
        if (arr.length < minLength) {
            return -1;
        }
        else {
            return arr.length;
        }
    }
}
