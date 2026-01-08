package Level_3.Controller;

import Level_3.Entities.News;
import Level_3.Entities.Reporter;
import Level_3.Service.NewsServices;
import Level_3.Service.ReporterServices;

import java.util.List;

public class MenuController {
    private final NewsServices NEWSSERVICES = new NewsServices();
    private final ReporterServices REPORTERSERVICES = new ReporterServices();

    public boolean createReporter(String dni, String name) {
        if (REPORTERSERVICES.findReporterByDni(dni) != null) {
            return false;
        }
        REPORTERSERVICES.createAndAddReporter(dni, name);
        return true;
    }

    public boolean deleteReporter(String dni) {
        Reporter reporterToDelete = REPORTERSERVICES.findReporterByDni(dni);
        if (reporterToDelete == null) {
            return false;
        }
        REPORTERSERVICES.deleteReporterByDni(reporterToDelete);
        return true;
    }

    public boolean addNewsToReporter(String dni, News news) {
        Reporter reporter = REPORTERSERVICES.findReporterByDni(dni);
        if (reporter == null || news == null) {
            return false;
        }
        NEWSSERVICES.addNewsToReporter(reporter, news);
        return true;
    }

    public boolean deleteNews(String dni, String title) {
        Reporter reporter = REPORTERSERVICES.findReporterByDni(dni);
        if (reporter == null) {
            return false;
        }

        News news = NEWSSERVICES.findNews(reporter, title);
        if (news == null) {
            return false;
        }
        NEWSSERVICES.deleteNews(reporter, news);
        return true;
    }

    public List<News> showNews(String dni) {
        Reporter reporter = REPORTERSERVICES.findReporterByDni(dni);
        return (reporter != null) ? NEWSSERVICES.listReporterNews(reporter) : List.of();
    }

    public int calculateNewsScore(String dni, String name) {
        Reporter reporter = REPORTERSERVICES.findReporterByDni(dni);
        if(reporter == null) {
            return -1;
        }
        News news = NEWSSERVICES.findNews(reporter, name);
        if(news == null) {
            return -1;
        }
        return NEWSSERVICES.calculateNewsScore(news);
    }
}
