package Level_3.Controller;

import Level_3.Entities.News;
import Level_3.Entities.Reporter;
import Level_3.Service.NewsServices;
import Level_3.Service.ReporterServices;

public class MenuController {
    NewsServices newsServices = new NewsServices();
    ReporterServices reporterServices = new ReporterServices();

    public boolean createReporter(String dni, String name) {
        if (reporterServices.findReporterByDni(dni) == null) {
            return false;
        }
        reporterServices.createAndAddReporter(dni, name);
        return true;
    }

    public boolean deleteReporter(String dni) {
        Reporter reporterToDelete = reporterServices.findReporterByDni(dni);
        if (reporterToDelete == null) {
            return false;
        }
        reporterServices.deleteReporterByDni(reporterToDelete);
        return true;
    }

    public boolean addNewsToReporter(String dni, News news) {
        Reporter reporter = reporterServices.findReporterByDni(dni);
        if (reporter == null || news == null) {
            return false;
        }
        newsServices.addNewsToReporter(reporter, news);
        return true;
    }

    public boolean deleteNews(String dni, String title) {
        Reporter reporter = reporterServices.findReporterByDni(dni);
        if (reporter == null) {
            return false;
        }

        News news = newsServices.findNews(reporter, title);
        if (news == null) {
            return false;
        }
        newsServices.deleteNews(reporter, news);
        return true;
    }
}
