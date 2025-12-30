package Level_3.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SoccerNewsService {

    private static final BigDecimal BASE_PRICE = BigDecimal.valueOf(300);
    private static final int BASE_SCORE = 5;
    private static final Map<String, BigDecimal> PRICE_RULES = new HashMap<>();
    private static final Map<String, Integer> SCORE_RULES = new HashMap<>();

    static {
        PRICE_RULES.put("Champions League", BigDecimal.valueOf(100));
        PRICE_RULES.put("League", BigDecimal.valueOf(0));
        PRICE_RULES.put("Madrid", BigDecimal.valueOf(100));
        PRICE_RULES.put("Barça", BigDecimal.valueOf(100));
        PRICE_RULES.put("Ferran Torres", BigDecimal.valueOf(50));
        PRICE_RULES.put("Benzema", BigDecimal.valueOf(50));

        SCORE_RULES.put("Champions League", 3);
        SCORE_RULES.put("League", 2);
        SCORE_RULES.put("Madrid", 1);
        SCORE_RULES.put("Barça", 1);
        SCORE_RULES.put("Ferran Torres", 1);
        SCORE_RULES.put("Benzema", 1);
    }

    public static BigDecimal getBasePrice() {
        return BASE_PRICE;
    }

    public static int getBaseScore() {
        return BASE_SCORE;
    }

    public static Map<String, BigDecimal> getPriceRules() {
        return Collections.unmodifiableMap(PRICE_RULES);
    }

    public static Map<String, Integer> getScoreRules() {
        return Collections.unmodifiableMap(SCORE_RULES);
    }
}