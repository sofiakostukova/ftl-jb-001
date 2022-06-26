package tasks.tasks005;

public class SevenMultiplication {

    private static Integer seven = 7;
    private static Integer number = 1;
    private static Integer equals = 0;
    public static void run() {

        while (number < 15) {
            equals = seven * number;
            System.out.print(equals + " ");
            number++;
        }

    }

}
