package Level_3.Entities;

import java.math.BigDecimal;

public class Editor {
    private final String DNI;
    private String name;
    static private final BigDecimal salary = BigDecimal.valueOf(1500);

    public Editor(String DNI, String name) {
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
}
