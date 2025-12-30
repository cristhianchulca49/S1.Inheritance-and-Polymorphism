package Level_3.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BasketballNewsService {

    private static final BigDecimal BASE_PRICE = BigDecimal.valueOf(250);
    private static final int BASE_SCORE = 4;
    private static final Map<String, BigDecimal> PRICE_RULES = new HashMap<>();
    private static final Map<String, Integer> SCORE_RULES = new HashMap<>();

    static {
        PRICE_RULES.put("Euro league", BigDecimal.valueOf(75));
        PRICE_RULES.put("Barça", BigDecimal.valueOf(75));
        PRICE_RULES.put("Madrid", BigDecimal.valueOf(75));

        SCORE_RULES.put("Euro league", 3);
        SCORE_RULES.put("ACB", 2);
        SCORE_RULES.put("Barça", 1);
        SCORE_RULES.put("Madrid", 1);
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