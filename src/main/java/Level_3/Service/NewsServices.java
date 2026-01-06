package Level_3.Service;

import Level_3.Entities.News;
import Level_3.Entities.Reporter;

import java.util.List;

public class NewsServices {
    public boolean addNewsToReporter(String dni, News news) {
        Reporter reporter = ReporterServices.findReporterByDni(dni);
        if(reporter != null){
            reporter.addNews(news);
            return true;
        }
        return false;
    }

    public List<News> listReporterNews(String dni){
        Reporter reporter = ReporterServices.findReporterByDni(dni);
        if(reporter != null){
           return reporter.getNewsList();
        }
        return null;
    }
}
