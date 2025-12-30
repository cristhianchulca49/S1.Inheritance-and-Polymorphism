package Level_3.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TennisNewsService {

    private static final BigDecimal BASE_PRICE = BigDecimal.valueOf(150);
    private static final int BASE_SCORE = 4;
    private static final Map<String, BigDecimal> PRICE_RULES = new HashMap<>();
    private static final Map<String, Integer> SCORE_RULES = new HashMap<>();

    static {
        BigDecimal extraPrice = BigDecimal.valueOf(100);
        PRICE_RULES.put("Federer", extraPrice);
        PRICE_RULES.put("Nadal", extraPrice);
        PRICE_RULES.put("Djokovic", extraPrice);

        SCORE_RULES.put("Federer", 3);
        SCORE_RULES.put("Nadal", 3);
        SCORE_RULES.put("Djokovic", 3);
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