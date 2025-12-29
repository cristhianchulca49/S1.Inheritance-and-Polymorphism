package Level_3.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class TennisNewsService {
    public static final Map<String, BigDecimal> priceRules = new HashMap<>();
    public static final Map<String, Integer> scoreRules = new HashMap<>();

    static {
        // Price rules
        priceRules.put("Federer", BigDecimal.valueOf(100));
        priceRules.put("Nadal", BigDecimal.valueOf(100));
        priceRules.put("Djokovic", BigDecimal.valueOf(100));

        // Score rules
        scoreRules.put("Federer", 3);
        scoreRules.put("Nadal", 3);
        scoreRules.put("Djokovic", 3);
    }
}
