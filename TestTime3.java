package Buoi4;

public class TestTime3 {
    public static void main(String[] args) {
        Time3 t1 = new Time3(1, 2, 3);
        System.out.println(t1);

        //Time3 t2 = new Time3(60, 59, 12);

        try {
            Time3 t3 = new Time3(60, 59, 12);
            System.out.println("This line will be skipped, if exception occurs");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        System.out.println("Continue after exception!");
    }
}
