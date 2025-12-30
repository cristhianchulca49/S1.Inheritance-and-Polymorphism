package Level_3.Service;

import Level_3.Entities.Reporter;

import java.util.ArrayList;
import java.util.List;

public class RedactorServices {
    private final List<Reporter> reporters = new ArrayList<>();

    public List<Reporter> getReporters() {
        return reporters;
    }


    public Reporter findReporterByDni(String dni) {
        for (Reporter reporter : reporters) {
            if (reporter.getDni().equalsIgnoreCase(dni)) {
                return reporter;
            }
        }
        return null;
    }

    public boolean createAndAddReporter(String dni, String name) {
        if (findReporterByDni(dni) == null) {
            reporters.add(new Reporter(dni, name));
            return true;
        }
        return false;
    }

    public boolean deleteReporterByDni(String dni) {
        Reporter reporter = findReporterByDni(dni);
        if (reporter != null) {
            reporters.remove(reporter);
            return true;
        }
        return false;
    }
}
