package gb.seminar.my_code;

public class Task04_2 {

    public static void main(String[] args) {
        checkArray(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("-----------------------------------------------------------------------------------------");
        checkArray(new Integer[]{1, 2, null, 4, 5, 6, 7, 8, null, 10});
    }

    public static void checkArray(Integer[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                stringBuilder.append(i).append(" ");
            }
        }
        if (!stringBuilder.isEmpty()) {
            throw new RuntimeException("Индексы null'ов: " + stringBuilder);
        }
    }
}
