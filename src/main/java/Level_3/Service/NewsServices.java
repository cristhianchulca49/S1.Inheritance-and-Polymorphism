package Level_3.Service;

import Level_3.Entities.News;
import Level_3.Entities.Reporter;

import java.util.List;

public class NewsServices {
    public void addNewsToReporter(Reporter reporter, News news) {
        reporter.addNews(news);
    }

    public News findNews(Reporter reporter, String title) {
        return reporter.getNewsList().stream()
                .filter(news -> news.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public void deleteNews(Reporter reporter, News news) {
        reporter.getNewsList().remove(news);
    }

    public List<News> listReporterNews(Reporter reporter) {
        return reporter.getNewsList();
    }
}
