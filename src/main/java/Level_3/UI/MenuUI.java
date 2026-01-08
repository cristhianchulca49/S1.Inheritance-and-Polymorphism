package Level_3.UI;

import Level_3.Controller.MenuController;
import Level_3.Entities.News;
import Level_3.UI.NewsData.*;

import java.util.HashMap;
import java.util.Map;

public class MenuUI {
    MenuController menuController = new MenuController();
    private static final Map<String, NewsData> NEWSDATA = new HashMap<>();

    static {
        NEWSDATA.put("1", new SoccerData());
        NEWSDATA.put("2", new BasketballData());
        NEWSDATA.put("3", new TennisData());
        NEWSDATA.put("4", new F1Data());
        NEWSDATA.put("5", new MotorcyclingData());
    }

    public void createReporter() {
        String dni = Input.readString("Write the DNI of the reporter");
        String name = Input.readString("Write the name of the reporter");
        if (!menuController.createReporter(dni, name)) {
            System.out.println("Error, Reporter Not Created");
            return;
        }
        System.out.println("Reporter Created");
    }

    public void deleteReporter() {
        String dni = Input.readString("Write the DNI of the reporter");
        if (!menuController.deleteReporter(dni)) {
            System.out.println("Error, Reporter Not Deleted");
            return;
        }
        System.out.println("Reporter Deleted");
    }

    public void addNewsToReporter() {
        String dni = Input.readString("Enter the ID number of the reporter to whom the news will be added.");
        System.out.println("What kind of news do you want to add?");
        System.out.println("1. Soccer");
        System.out.println("2. Basketball");
        System.out.println("3. Tennis");
        System.out.println("4. F1");
        System.out.println("5. Motorcycling");
        String option = Input.readString("Choose an option");

        if (!NEWSDATA.containsKey(option)) {
            System.out.println("Error, Option Not Found");
            return;
        }
        News news = NEWSDATA.get(option).createNews();

        if (!menuController.addNewsToReporter(dni, news)) {
            System.out.println("Error, News not add2");
        }
        System.out.println("Reporter Added");
    }

    public void deleteNews() {
        String dni = Input.readString("Enter the ID number of the reporter");
        String title = Input.readString("Enter the title of the news");

    }
}
