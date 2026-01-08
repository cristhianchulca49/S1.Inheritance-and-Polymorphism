package Level_3.Controller;

import Level_3.Entities.News;
import Level_3.Entities.Reporter;
import Level_3.Service.NewsServices;
import Level_3.Service.ReporterServices;

public class MenuController {
    NewsServices newsServices = new NewsServices();
    ReporterServices reporterServices = new ReporterServices();

    public boolean createReporter(String dni, String name) {
        return reporterServices.createAndAddReporter(dni, name);
    }

    public boolean deleteReporter(String dni) {
        return reporterServices.deleteReporterByDni(dni);
    }

    public boolean addNewsToReporter(String dni, News news) {
        Reporter reporter = reporterServices.findReporterByDni(dni);
        if (news == null || reporter == null) {
            return false;
        }
        return newsServices.addNewsToReporter(reporter, news);
    }

}
