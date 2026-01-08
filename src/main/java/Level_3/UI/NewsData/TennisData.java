package Level_3.UI.NewsData;

import Level_3.Entities.News;
import Level_3.Entities.Tennis;
import Level_3.UI.Input;

public class TennisData implements NewsData {

    public News createNews() {
        String title = Input.readString("Enter the title of the news");
        String competitionName = Input.readString("Enter the name of the competition");
        String player1 = Input.readString("Enter the name of the player 1");
        String player2 = Input.readString("Enter the name of the player 2");

        return new Tennis(title, competitionName, player1, player2);
    }
}
