package Buoi4;

public class TestTime2 {
    public static void main(String[] args) {
        Time2 t1 = new Time2(1, 2, 3);
        System.out.println(t1);
        Time2 t2 = new Time2();
        System.out.println(t2);

        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);
        System.out.println("Hour is: "+ t1.getHour());
        System.out.println("Minute is: "+ t1.getMinute());
        System.out.println("Second is: "+ t1.getSecond());

        t1.setTime2(58, 59, 23);
        System.out.println(t1);

        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
