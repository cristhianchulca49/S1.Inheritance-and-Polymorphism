package Level_3.Entities;

import Level_3.Service.SoccerNewsService;

import java.math.BigDecimal;

public class Soccer extends News {
    private final String competition;
    private final String club;
    private final String player;

    public Soccer(String title, String competition, String club, String player) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    public void calculatePrice() {
        this.price = SoccerNewsService.getBasePrice();

        SoccerNewsService.getPriceRules().forEach((ruleKey, extraPrice) -> {
            if (ruleKey.equalsIgnoreCase(competition) || ruleKey.equalsIgnoreCase(club) || ruleKey.equalsIgnoreCase(player)) {
                this.price = this.price.add(extraPrice);
            }
        });
    }

    @Override
    public void calculateScore() {
        this.score = SoccerNewsService.getBaseScore();

        SoccerNewsService.getScoreRules().forEach((ruleKey, extraScore) -> {
            if (ruleKey.equalsIgnoreCase(competition) || ruleKey.equalsIgnoreCase(club) || ruleKey.equalsIgnoreCase(player)) {
                this.score = this.score + extraScore;
            }
        });
    }
}
