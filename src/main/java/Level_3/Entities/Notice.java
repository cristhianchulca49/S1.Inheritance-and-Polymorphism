package Level_3.Entities;

import java.math.BigDecimal;

public abstract class Notice {
    private String title;
    private String description;
    private int score;
    private BigDecimal price;

    public Notice(String title, int score, BigDecimal price) {
        this.title = title;
        this.score = score;
        this.price = price;
    }
}
