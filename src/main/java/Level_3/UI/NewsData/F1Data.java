package Level_3.UI.NewsData;

import Level_3.Entities.F1;
import Level_3.Entities.News;
import Level_3.UI.Input;

public class F1Data implements NewsData {

    public News createNews() {
        String title = Input.readString("Enter the title of the news");
        String teamName = Input.readString("Enter the name of the team");

        return new F1(title, teamName);
    }
}
