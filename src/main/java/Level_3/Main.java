package Level_3;

import Level_3.UI.MenuUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuUI menuUI = new MenuUI();
        System.out.println("Sports News Writing");

        while (true) {
            System.out.println("What do you want to do now?:");
            switch (sc.nextLine()) {
                case "1":
                    menuUI.createReporter();
                    break;
                case "2":
                    menuUI.deleteReporter();
                case "3":
                    break;
                case "0":
                    return;
            }

        }


    }
}
