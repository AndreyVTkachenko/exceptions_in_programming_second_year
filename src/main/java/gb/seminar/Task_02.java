package gb.seminar;

import java.io.IOException;

public class Task_02 {

    public static void main(String[] args) {
        try(Count count = new Count()){
            count.add(); // 1
            count.add(); // 2
            count.add(); // 3
            System.out.println(count.getCount()); // count = 3
            count.close(); // count = null
            count.add(); // null + 1 -> ERROR
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    public static class Count implements AutoCloseable {
        private Integer count;

        public Count() {
            this.count = 0;
        }

        public void add() throws IOException {
            checkClose();
            this.count++;
        }

        public Integer getCount() throws IOException {
            checkClose();
            return count;
        }

        public void checkClose() throws IOException {
            if (this.count == null)
                throw new IOException("Экземпляр закрыт!");
        }

        @Override
        public void close() {
            this.count = null;
        }
    }
}
