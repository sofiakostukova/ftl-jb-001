package tasks.tasks003;

public class Multiplication {

    private static Integer three = 3;
    private static Integer number = 1;
    private static Integer equals = 0;
    public static void run() {

        while (number < 11) {
            equals = three * number;
            System.out.println(three + "*" + number + "=" + equals);
            number++;
        }

    }

}
