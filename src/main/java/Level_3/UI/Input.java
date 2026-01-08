package Level_3.UI;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    public static char readChar(String message) {
        while (true) {
            System.out.println(message);
            String input = sc.nextLine();
            if (input.length() == 1) {
                return input.charAt(0);
            }
            System.out.println("Error: Please enter exactly one character.");
        }
    }

    public static String readString(String message) {
        System.out.println(message);
        return sc.nextLine().trim();
    }
}
