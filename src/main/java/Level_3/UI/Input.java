package Level_3.UI;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                String aux = sc.nextLine().trim().replace(" ", "");
                return Integer.parseInt(aux);
            } catch (Exception e) {
                System.out.println("Sorry, You must write only number, not letters, dot or comma");
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                String aux = sc.nextLine().trim().replace(" ", "");
                return Float.parseFloat(aux);
            } catch (Exception e) {
                System.out.println("Sorry, Format error! check if you write the number with comma");
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                String aux = sc.nextLine().trim().replace(" ", "");
                return Double.parseDouble(aux);
            } catch (Exception e) {
                System.out.println("Sorry, Format error! check if you write the number with comma");
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.println(message);
                String letter = sc.nextLine();
                if (letter.length() > 1) {
                    throw new Exception("Only a single character is supported");
                } else {
                    return letter.charAt(0);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            try {
                System.out.println(message);
                String name = sc.nextLine();
                if (name.equals(name.toLowerCase())) {
                    return name;
                } else {
                    throw new Exception("Only lowercase letters are allowed, no numbers or uppercase letters");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
