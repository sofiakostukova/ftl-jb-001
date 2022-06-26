package tasks007;

import java.util.Arrays;

public class ManyLittleStars {

    private static String[][] manyLittleStars;

    public static void run() {

        String[][] manyLittleStars;
        manyLittleStars = new String[][]{{"* * * * *"}, {"* * * * *"}, {"* * * * *"}};

        for (String[] innerArray: manyLittleStars) {
            for(String data: innerArray) {
                System.out.println(data);
            }
        }
    }
}
