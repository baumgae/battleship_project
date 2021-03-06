package battleshipGUI;

import java.util.List;
import java.util.Set;

import com.hdm_stuttgart.Battleship.GameManager;
import com.hdm_stuttgart.Battleship.Highscore;
import com.hdm_stuttgart.Battleship.HighscoreItem;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Score Screen
 * <p>
 * This is the GUI, if the current game has ended. Over here the user will be
 * able to see how many hits and points he got as well as these information
 * about the player.
 * <p>
 * 
 * 
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class ScoreScreen {

	public VBox getScreen() {

		VBox root = new VBox();

		Highscore highscore = new Highscore();
		// highscore.addScore(SetNameScreen.nameOne,
		// GameManager.getInstance().getPlayerOne().getCountedHits());
		// highscore.addScore(SetNameScreen.nameTwo,
		// GameManager.getInstance().getPlayerTwo().getCountedHits());

		if (GameManager.playerNumber == 1) {

			highscore.addScore(SetNameScreen.name, GameManager.getInstance().getScore());
			highscore.addScore("Computer Hans", GameManager.getInstance().getScore());
			highscore.sortedScores();
			List<HighscoreItem> highscoreList= highscore.getScore();

			for (int i = 0; i < highscoreList.size(); i++) {
				
				Label label = new Label("Scores: ");
				Label labelScore = new Label("Name: " + highscoreList.get(i).getName() + " | Scores: "
						+ highscoreList.get(i).getScore());

				root.getChildren().addAll(label, labelScore);

			}

			return root;
		} 
		else {
			highscore.addScore(SetNameScreen.nameOne, GameManager.getInstance().getScore());
			highscore.addScore(SetNameScreen.nameTwo, GameManager.getInstance().getScore());
			highscore.sortedScores();
			List<HighscoreItem> highscoreList= highscore.getScore();

			for (int i = 0; i < highscoreList.size(); i++) {
				
				Label label = new Label("Scores: ");
				Label labelScore = new Label("Name: " + highscoreList.get(i).getName() + " | Scores: "
						+ highscoreList.get(i).getScore());

				root.getChildren().addAll(label, labelScore);

			}
			return root;
		}

	}
}
