package Level_3.UI;

import Level_3.Controller.MenuController;
import Level_3.Entities.News;
import Level_3.UI.NewsData.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
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
        if (menuController.deleteReporter(dni)) {
            System.out.println("Reporter Deleted");
            return;
        }
        System.out.println("Error, Reporter Not Deleted");
    }

    public void addNewsToReporter() {
        String dni = Input.readString("Enter the ID number of the reporter to whom the news will be added.");
        System.out.println("What kind of news do you want to add?");
        NEWSDATA.forEach((key, value) -> {
            System.out.println(key + ". " + value.getClass().getSimpleName().replace("Data", ""));
        });
        String option = Input.readString("Choose an option");

        if (!NEWSDATA.containsKey(option)) {
            System.out.println("Error, Option Not Found");
            return;
        }
        News news = NEWSDATA.get(option).createNews();

        if (menuController.addNewsToReporter(dni, news)) {
            System.out.println("News Added to Reporter");
            return;
        }
        System.out.println("Error, Reporter not found or News is empty");

    }

    public void deleteNews() {
        String dni = Input.readString("Enter the ID number of the reporter");
        String title = Input.readString("Enter the title of the news");
        if (!menuController.deleteNews(dni, title)) {
            System.out.println("Error, Report or News Not Found");
            return;
        }
        System.out.println("News Deleted");

    }

    public void showNews() {
        String dni = Input.readString("Enter the ID number of the reporter");
        List<News> newsList = menuController.showNews(dni);
        if (newsList.isEmpty()) {
            System.out.println("Reporter not exist or NewsList is empty");
            return;
        }
        System.out.println("There have the news of the reporter:");
        for (News news : newsList) {
            System.out.println(news.getTitle());
        }
    }

    public void calculateNewsScore() {
        String dni = Input.readString("Enter the ID number of the reporter");
        String title = Input.readString("Enter the title of the news");
        int score = menuController.calculateNewsScore(dni, title);
        if (score == 0) {
            System.out.println("Error, Report or News Not Found");
            return;
        }
        System.out.println("News Score Calculated");
        System.out.println(score);
    }

    public void calculateNewsPrice() {
        String dni = Input.readString("Enter the ID number of the reporter");
        String title = Input.readString("Enter the title of the news");
        BigDecimal price = menuController.calculateNewsPrice(dni, title);
        if (price.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("Error, Report or News Not Found");
        }
        System.out.println("News Price Calculated");
        System.out.println(price);
    }
}