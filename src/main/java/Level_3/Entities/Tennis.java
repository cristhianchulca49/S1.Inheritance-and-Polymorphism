package Level_3.Entities;

import Level_3.Service.TennisNewsService;

import java.math.BigDecimal;

public class Tennis extends News {
    private final String competition;
    private final String player;

    public Tennis(String title, String competition, String player) {
        super(title);
        this.competition = competition;
        this.player = player;

    }

    @Override
    public void calculatePrice() {
        this.price = TennisNewsService.getBasePrice();

        TennisNewsService.getPriceRules().forEach((ruleKey, extraPrice) -> {
            if (ruleKey.equalsIgnoreCase(competition) || ruleKey.equalsIgnoreCase(player)) {
                this.price = price.add(extraPrice);
            }
        });

    }

    @Override
    public void calculateScore() {
        this.score = TennisNewsService.getBaseScore();

        TennisNewsService.getScoreRules().forEach((ruleKey, extraScore) -> {
            if (ruleKey.equalsIgnoreCase(competition) || ruleKey.equalsIgnoreCase(player)) {
                this.score = this.score + extraScore;
            }
        });
    }
}
