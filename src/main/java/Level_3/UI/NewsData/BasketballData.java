package Level_3.UI.NewsData;


import Level_3.Entities.Basketball;
import Level_3.Entities.News;
import Level_3.UI.Input;

public class BasketballData implements NewsData {
    public News createNews() {
        String title = Input.readString("Enter the title of the news");
        String competitionName = Input.readString("Enter the name of the competition");
        String clubName = Input.readString("Enter the name of the club");
        return new Basketball(title, competitionName, clubName);
    }
}
