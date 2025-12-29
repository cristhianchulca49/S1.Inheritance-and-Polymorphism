package Level_3.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MotorcyclingNewsService {
    private static final Map<String, BigDecimal> priceRules = new HashMap<>();
    private static final Map<String, Integer> scoreRules = new HashMap<>();

    static {
        priceRules.put("Honda", BigDecimal.valueOf(50));
        priceRules.put("Yamaha", BigDecimal.valueOf(50));

        scoreRules.put("Honda", 3);
        scoreRules.put("Yamaha", 3);
    }

    public Map<String, BigDecimal> getPriceRules() {
        return priceRules;
    }

    public Map<String, Integer> getScoreRules() {
        return scoreRules;
    }
}