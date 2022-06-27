package tasks.task009;

import java.util.Scanner;

public class Riddle {

    private static String riddle = "Что это такое: синий, большой, с усами и полностью набит зайцами? (What is it: blue, big, with a mustache, and completely full of hares?)";
    private static String userAnswer = "";
    private static String correctAnswer = "Троллейбус";

    private static String enterAnswer = "Введите ответ (Enter answer): ";
    private static String endCorrectAnswer = "Правильный ответ (The correct answer is): троллейбус.";
    private static String right = "Правильно (Right)!";
    private static String thinkAgain = "Подумай еще (Think again).";

    private static String endIGiveUp = "Если вы хотите сдаться, то напишите без скобок (If you want to surrender, write without brackets): ";
    private static String iGiveUp = "Сдаюсь";
    private static Boolean giveUp = false;

    private static Integer attempts = 3;
    private static Boolean equals = false;
    private static String end = "Ваши попытки закончились (Your attempts are over)...";

    public static void run() {

        System.out.println(riddle);
        System.out.println(endIGiveUp + iGiveUp);


        while (attempts > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(enterAnswer);

            String userAnswer = scanner.nextLine();

            boolean result = userAnswer.equalsIgnoreCase(correctAnswer);
            boolean giveUp = userAnswer.equalsIgnoreCase(iGiveUp);

            if ( giveUp == true) {
                System.out.println(endCorrectAnswer);
                attempts = 0;

            } else if (giveUp == false) {
                if (result == true) {
                    System.out.println(right);
                    attempts = 0;

                } else if (result == false) {
                    attempts--;
                    System.out.println(thinkAgain);

                }
            }

        }

    }

}
