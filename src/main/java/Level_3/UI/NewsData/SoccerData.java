package Level_3.UI.NewsData;

import Level_3.Entities.News;
import Level_3.Entities.Soccer;
import Level_3.UI.Input;

public class SoccerData implements NewsData {

    public News createNews() {
        String title = Input.readString("Enter the title of the news");
        String competitionName = Input.readString("Enter the name of the competition");
        String clubName = Input.readString("Enter the name of the club");
        String playerName = Input.readString("Enter the name of the player");

        return new Soccer(title, competitionName, clubName, playerName);
    }
}
