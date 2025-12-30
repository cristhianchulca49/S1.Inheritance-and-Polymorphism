package Level_3.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MotorcyclingNewsService {

    private static final BigDecimal BASE_PRICE = BigDecimal.valueOf(100);
    private static final int BASE_SCORE = 3;
    private static final Map<String, BigDecimal> PRICE_RULES = new HashMap<>();
    private static final Map<String, Integer> SCORE_RULES = new HashMap<>();

    static {
        BigDecimal extraPrice = BigDecimal.valueOf(50);
        PRICE_RULES.put("Honda", extraPrice);
        PRICE_RULES.put("Yamaha", extraPrice);

        SCORE_RULES.put("Honda", 3);
        SCORE_RULES.put("Yamaha", 3);
    }

    public static BigDecimal getBasePrice() { return BASE_PRICE; }
    public static int getBaseScore() { return BASE_SCORE; }
    public static Map<String, BigDecimal> getPriceRules() { return Collections.unmodifiableMap(PRICE_RULES); }
    public static Map<String, Integer> getScoreRules() { return Collections.unmodifiableMap(SCORE_RULES); }
}