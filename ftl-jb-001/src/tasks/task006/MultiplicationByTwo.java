package tasks.task006;

public class MultiplicationByTwo {

    private static Integer two = 2;
    private static Integer number = 1;

    public static void run() {

        System.out.println(" ");
        while (number < 511) {
            number = number * two;
            System.out.print(number + " ");
        }
        System.out.println(" ");

    }

}
