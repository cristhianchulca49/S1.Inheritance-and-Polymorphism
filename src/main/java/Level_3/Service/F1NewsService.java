package Level_3.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class F1NewsService {
    private static final Map<String, BigDecimal> priceRules = new HashMap<>();
    private static final Map<String, Integer> scoreRules = new HashMap<>();

    static {
        priceRules.put("Ferrari", BigDecimal.valueOf(50));
        priceRules.put("Mercedes", BigDecimal.valueOf(50));

        scoreRules.put("Ferrari", 2);
        scoreRules.put("Mercedes", 2);
    }

    public Map<String, BigDecimal> getPriceRules() {
        return priceRules;
    }

    public Map<String, Integer> getScoreRules() {
        return scoreRules;
    }
}
