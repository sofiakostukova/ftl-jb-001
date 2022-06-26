package tasks.task008;

public class FibonacciNumbers {

    private static Integer number2 = 1;
    private static Integer number1 = 1;
    private static Integer equals = 0;

    public static void run() {

        System.out.print(number1 + " " + number2 + " ");

        while (equals < 89) {
            equals = number1 + number2;
            number1 = number2;
            number2 = equals;
            System.out.print(equals + " ");
        }
        System.out.println(" ");

    }

}
