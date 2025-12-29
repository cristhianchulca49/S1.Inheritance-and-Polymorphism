package Level_3.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Reporter {
    private final String DNI;
    private final String name;
    private static BigDecimal salary = BigDecimal.valueOf(1500);
    private final List<News> reports = new ArrayList<>();

    public Reporter(String DNI, String name) {
        this.DNI = DNI;
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public static void setSalary(BigDecimal newSalary) {
        Reporter.salary = newSalary;
    }

    public List<News> getNews() {
        return reports;
    }
}
