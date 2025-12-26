package Level_3.Entities;
import java.math.BigDecimal;

public abstract class News {
    private String title;
    private String description;
    private int score;
    private BigDecimal price;

    public News(String title) {
        this.title = title;
    }

    public abstract void calculatePrice();
    public abstract void calculateScore();
}
