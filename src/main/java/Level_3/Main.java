package Level_3;

import Level_3.UI.Input;
import Level_3.UI.MenuUI;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuUI menuUI = new MenuUI();
        List<String> menu = List.of(
                "1: Create Reporter",
                "2: Delete Reporter",
                "3: Add news to Reporter",
                "4: Delete News",
                "5: Show News from a Reporter",
                "6: Calculate the score of the news",
                "7: Calculate the price of the news",
                "0: Exit"
        );

        System.out.println("Sports News Writing");

        while (true) {
            menu.forEach(System.out::println);
            char option = Input.readChar("What do you want to do now?:");
            switch (option) {
                case '1':
                    menuUI.createReporter();
                    break;
                case '2':
                    menuUI.deleteReporter();
                    break;
                case '3':
                    menuUI.addNewsToReporter();
                    break;
                case '4':
                    menuUI.deleteNews();
                    break;
                case '5':
                    menuUI.showNews();
                    break;
                case '6':
                    menuUI.calculateNewsScore();
                    break;
                case '7':
                    menuUI.calculateNewsPrice();
                    break;
                case '0':
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Option not valid. Please try again.");
                    break;
            }
        }
    }
}
