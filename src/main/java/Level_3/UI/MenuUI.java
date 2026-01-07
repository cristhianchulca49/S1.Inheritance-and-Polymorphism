package Level_3.UI;

import Level_3.Controller.MenuController;

import java.util.Scanner;

public class MenuUI {
    MenuController menuController = new MenuController();
    Scanner sc = new Scanner(System.in);

    public void createReporter() {
        System.out.println("Write the reporter´s DNI");
        String dni = sc.nextLine();
        System.out.println("Write the reporter's Name");
        String name = sc.nextLine();

        if (menuController.createReporter(dni, name)) {
            System.out.println("Reporter Created");
        } else {
            System.out.println("Error, Reporter Not Created");
        }
    }

    public void deleteReporter() {
        System.out.println("Write the reporter's DNI");
        String dni = sc.nextLine();
        if (menuController.deleteReporter(dni)) {
            System.out.println("Reporter Deleted");
        } else {
            System.out.println("Error, Reporter Not Deleted");
        }
    }

}
