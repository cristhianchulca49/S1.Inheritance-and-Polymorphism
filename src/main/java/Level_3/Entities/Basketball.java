package Level_3.Entities;

import Level_3.Service.BasketballNewsService;

import java.math.BigDecimal;

public class Basketball extends News {
    private final String competition;
    private final String club;

    public Basketball(String title, String competition, String club, String player) {
        super(title);
        this.competition = competition;
        this.club = club;
    }

    @Override
    public void calculatePrice() {
        super.price = BasketballNewsService.getBasePrice();

        BasketballNewsService.getPriceRules().forEach((ruleKey, extraPrice) -> {
            if (ruleKey.equalsIgnoreCase(competition) || ruleKey.equalsIgnoreCase(club)) {
                this.price = this.price.add(extraPrice);
            }
        });
    }

    @Override
    public void calculateScore() {
        super.score = BasketballNewsService.getBaseScore();

        BasketballNewsService.getScoreRules().forEach((ruleKey, extraScore) -> {
            if (ruleKey.equalsIgnoreCase(competition) || ruleKey.equalsIgnoreCase(club)) {
                this.score = this.score + extraScore;
            }
        });
    }
}
