package gb.seminar;

import java.io.IOException;

public class Task_04 {

    public static void main(String[] args) throws IOException {
        String[][] arr = {{"12", "23", "1", "-1"},
                {"-23", "0", "5", "3"},
                {"4", "1", "0", "-7"},
                {"10", "25", "4", "-6"}};
        System.out.println(sumArray(arr));
    }

    public static int sumArray(String[][] array){
        if (array.length != 4 || array[0].length != 4)
            throw new MyArraySizeException(array.length, array[0].length);
        int resultSum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                try{
                    resultSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return resultSum;
    }
}

class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Размер двумерного массива должен быть 4x4");
    }

    public MyArraySizeException(int row, int column){
        super("Размер двумерного массива должен быть 4x4, у Вас (" + row + "; " + column + ")");
    }
}

class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(){
        super("Невозможно преобразовать элемент в числовой формат данных");
    }

    public MyArrayDataException(int i, int j){
        super("\"Невозможно преобразовать элемент в числовой формат данных, находящийся на позиции ->" +
              " (" + i + "; " + j + ")");
    }
}

