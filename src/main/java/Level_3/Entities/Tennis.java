package Level_3.Entities;

import Level_3.Service.TennisNewsService;

public class Tennis extends News {
    private final String competition;
    private final String player;
    private final String player2;

    public Tennis(String title, String competition, String player, String player2) {
        super(title);
        this.competition = competition;
        this.player = player;
        this.player2 = player2;

    }

    @Override
    public void calculatePrice() {
        this.price = TennisNewsService.getBasePrice();

        TennisNewsService.getPriceRules().forEach((ruleKey, extraPrice) -> {
            if (ruleKey.equalsIgnoreCase(competition) || ruleKey.equalsIgnoreCase(player) || ruleKey.equalsIgnoreCase(player2)) {
                this.price = price.add(extraPrice);
            }
        });

    }

    @Override
    public void calculateScore() {
        this.score = TennisNewsService.getBaseScore();

        TennisNewsService.getScoreRules().forEach((ruleKey, extraScore) -> {
            if (ruleKey.equalsIgnoreCase(competition) || ruleKey.equalsIgnoreCase(player) || ruleKey.equalsIgnoreCase(player2)) {
                this.score = this.score + extraScore;
            }
        });
    }
}
