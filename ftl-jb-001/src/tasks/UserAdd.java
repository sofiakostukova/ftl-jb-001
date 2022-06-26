package tasks;
import java.util.Scanner;

public class UserAdd {

    private static Integer one = 1;
    private static Integer userNumber = 0;
    private static Integer equals = 0;
    public static void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();


            if (userNumber > one) {

                while (userNumber > one) {
                    equals = equals + userNumber;
                    userNumber--;
                }
                System.out.println(equals + one);

            } else if (userNumber == one) {
                System.out.println(one);

            } else {
                System.out.println("You entered a negative number");
            }


        } else {
            System.out.println("You entered not an integer!");
        }
    }
}
