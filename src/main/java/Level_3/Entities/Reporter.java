package Level_3.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Reporter {
    private final String dni;
    private final String name;
    private static BigDecimal salary = BigDecimal.valueOf(1500);
    private final List<News> newsList;

    public Reporter(String dni, String name) {
        this.dni = dni;
        this.name = name;
        this.newsList = new ArrayList<>();
    }

    public static BigDecimal getSalary() {
        return salary;
    }

    public static void setSalary(BigDecimal newSalary) {
        Reporter.salary = newSalary;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void addNews(News news) {
        this.newsList.add(news);
    }
}