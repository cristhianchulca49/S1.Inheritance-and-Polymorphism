package Level_3.Entities;

import java.math.BigDecimal;

public abstract class News {
    private String title;
    private String description;
    protected int score;
    protected BigDecimal price;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getScore() {
        return score;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public abstract void calculatePrice();

    public abstract void calculateScore();
}
