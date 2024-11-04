package gb.seminar.seminar_code;

public class Seminar1_2_ {

    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int sum = sumElement(matrix);
        System.out.println(sum);
    }

    public static int sumElement(int[][] matrix) {
        int n = matrix.length;
        for (int[] row : matrix) {
            if (row.length != n) {
                throw new RuntimeException("Количество строк не равно количеству столбцов");
            }
        }

        for (int[] row : matrix) {
            for (int element : row) {
                if (element != 0 && element != 1) {
                    throw new RuntimeException("Массив должен содержать только 0 или 1");
                }
            }
        }

        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }
}
