package Level_3.Entities;

import Level_3.Service.F1NewsService;

public class F1 extends News {
    private final String racingTeam;

    public F1(String title, String racingTeam) {
        super(title);
        this.racingTeam = racingTeam;
    }

    @Override
    public void calculatePrice() {
        this.price = F1NewsService.getBasePrice();

        F1NewsService.getPriceRules().forEach((ruleKey, extraPrice) -> {
            if (ruleKey.equalsIgnoreCase(racingTeam)) {
                this.price = this.price.add(extraPrice);
            }
        });
    }

    @Override
    public void calculateScore() {
        this.score = F1NewsService.getBaseScore();

        F1NewsService.getScoreRules().forEach((ruleKey, extraScore) -> {
            if (ruleKey.equalsIgnoreCase(racingTeam)) {
                this.score = this.score + extraScore;
            }
        });
    }
}
