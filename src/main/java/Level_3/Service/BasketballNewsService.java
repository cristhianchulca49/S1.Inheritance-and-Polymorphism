package Level_3.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BasketballNewsService {
    private static final Map<String, BigDecimal> priceRules = new HashMap<>();
    private static final Map<String, Integer> scoreRules = new HashMap<>();

    static {
        priceRules.put("Euro league", BigDecimal.valueOf(75));
        priceRules.put("ACB", BigDecimal.valueOf(0));
        priceRules.put("Madrid", BigDecimal.valueOf(75));
        priceRules.put("Barça", BigDecimal.valueOf(75));

        scoreRules.put("Euro league", 3);
        scoreRules.put("ACB", 2);
        scoreRules.put("Madrid", 1);
        scoreRules.put("Barça", 1);
    }

    public static Map<String, BigDecimal> getPriceRules() {
        return Collections.unmodifiableMap(priceRules);
    }

    public static Map<String, Integer> getScoreRules() {
        return Collections.unmodifiableMap(scoreRules);
    }
}
