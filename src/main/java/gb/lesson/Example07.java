package gb.lesson;

public class Example07 {

    public static void main(String[] args) {

        aVoid();
    }

    public static void aVoid(){
        bVoid();
    }

    public static void bVoid(){
        cVoid();
    }

    public static void cVoid(){
        int[] array = new int[10];
        System.out.println(array[1000]);
    }
}
