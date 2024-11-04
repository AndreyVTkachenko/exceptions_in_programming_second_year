package gb.seminar.my_code;

public class Task03_2 {

    public static void main(String[] args) {
        int[][] array2dFirst = new int[][]{
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1},
        };
        System.out.println(sumArray2d(array2dFirst));
        System.out.println("-----------------------------------------------------------------------------------------");
        int[][] array2dSecond = new int[][]{
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0},
        };
        System.out.println(sumArray2d(array2dSecond));
        System.out.println("-----------------------------------------------------------------------------------------");
        int[][] array2dThird = new int[][]{
                {1, 0, 1},
                {0, 1, 0},
                {1, 5, 1},
        };
        System.out.println(sumArray2d(array2dThird));
    }

    public static int sumArray2d(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[0].length)
                return -1;
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    return -2;
                }
                sum += array[i][j];
            }
        }
        return sum;
    }
}
