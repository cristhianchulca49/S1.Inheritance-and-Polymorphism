package Level_3.Entities;

import Level_3.Service.MotorcyclingNewsService;

public class Motorcycling extends News {
    private final String team;

    public Motorcycling(String title, String team) {
        super(title);
        this.team = team;
    }

    @Override
    public void calculatePrice() {
        this.price = MotorcyclingNewsService.getBasePrice();

        MotorcyclingNewsService.getPriceRules().forEach((priceKey, extraPrice) -> {
            if (priceKey.equalsIgnoreCase(team)) {
                this.price = this.price.add(extraPrice);
            }
        });
    }

    @Override
    public void calculateScore() {
        this.score = MotorcyclingNewsService.getBaseScore();

        MotorcyclingNewsService.getScoreRules().forEach((scoreKey, extraScore) -> {
            if (scoreKey.equalsIgnoreCase(team)) {
                this.score = this.score + extraScore;
            }
        });

    }
}
