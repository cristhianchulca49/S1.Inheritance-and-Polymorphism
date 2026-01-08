package Level_3.Service;

import Level_3.Entities.Reporter;

import java.util.ArrayList;
import java.util.List;

public class ReporterServices {
    private final List<Reporter> REPORTERS = new ArrayList<>();

    public Reporter findReporterByDni(String dni) {
        return REPORTERS.stream()
                .filter(reporter -> reporter.getDni().equalsIgnoreCase(dni))
                .findFirst()
                .orElse(null);
    }

    public void createAndAddReporter(String dni, String name) {
        REPORTERS.add(new Reporter(dni, name));
    }

    public void deleteReporterByDni(Reporter reporter) {
        REPORTERS.remove(reporter);
    }
}
