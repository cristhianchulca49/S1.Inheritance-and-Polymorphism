package Level_3.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SoccerNewsService {
    private static final Map<String, BigDecimal> priceRules = new HashMap<>();
    private static final Map<String, Integer> scoreRules = new HashMap<>();

    static {
        // Price rules
        priceRules.put("Champions League", BigDecimal.valueOf(100));
        priceRules.put("League", BigDecimal.valueOf(0));
        priceRules.put("Madrid", BigDecimal.valueOf(100));
        priceRules.put("Barça", BigDecimal.valueOf(100));
        priceRules.put("Ferran Torres", BigDecimal.valueOf(50));
        priceRules.put("Benzema", BigDecimal.valueOf(50));

        // Score rules
        scoreRules.put("Champions League", 3);
        scoreRules.put("League", 2);
        scoreRules.put("Madrid", 1);
        scoreRules.put("Barça", 1);
        scoreRules.put("Ferran Torres", 1);
        scoreRules.put("Benzema", 1);
    }

    public static Map<String, BigDecimal> getPriceRules() {
        return Collections.unmodifiableMap(priceRules);
    }

    public static Map<String, Integer> getScoreRules() {
        return Collections.unmodifiableMap(scoreRules);
    }
}
