package Level_3.Service;

import Level_3.Entities.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReporterServices {
    private final List<Reporter> REPORTERS = new ArrayList<>();

    public List<Reporter> getReporters() {
        return Collections.unmodifiableList(REPORTERS);
    }


    public Reporter findReporterByDni(String dni) {
        for (Reporter reporter : REPORTERS) {
            if (reporter.getDni().equalsIgnoreCase(dni)) {
                return reporter;
            }
        }
        return null;
    }

    public boolean createAndAddReporter(String dni, String name) {
        if (findReporterByDni(dni) == null) {
            REPORTERS.add(new Reporter(dni, name));
            return true;
        }
        return false;
    }

    public boolean deleteReporterByDni(String dni) {
        Reporter reporter = findReporterByDni(dni);
        if (reporter != null) {
            REPORTERS.remove(reporter);
            return true;
        }
        return false;
    }
}
