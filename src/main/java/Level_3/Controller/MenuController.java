package Level_3.Controller;

import Level_3.Entities.News;
import Level_3.Service.NewsServices;
import Level_3.Service.ReporterServices;

import static Level_3.Service.FactoryNews.createNews;

public class MenuController {
    NewsServices newsServices = new NewsServices();
    ReporterServices reporterServices = new ReporterServices();

    public boolean createReporter(String dni, String name) {
        return reporterServices.createAndAddReporter(dni, name);
    }

    public boolean deleteReporter(String dni) {
        return reporterServices.deleteReporterByDni(dni);
    }

    public boolean createNewsAndAddToReporter(String option, String title, String dni) {
        News news = createNews(option, title);
        return newsServices.addNewsToReporter(dni, news);
    }

}
