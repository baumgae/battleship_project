package battleshipGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Select Difficulty Screen
 * <p>
 * This is the GUI, after the user choose the mode. Here it is possible for him
 * to decide, which Difficulty he wants to play.
 * <p>
 * 
 * The user has different options. He can start the game in EASY mode by pushing
 * the button {@easy}.<br>
 * He can start the game in NORMAL mode by pushing the button {@normal}.<br>
 * He can start the game in HARD mode by pushing the button {@hard}.<br>
 * He can start the game in SUICIDAL mode by pushing the button {@suicidal}.<br>
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class SelectDifficultyScreen {

	public static int difficultyNumber;

	/**
	 * 
	 * @return VBox containing the whole SelectDifficultyScreen
	 */
	public VBox getScreen() {
		VBox root = new VBox();

		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Set your difficulty!");

		Button easy = new Button("Easy");
		Button normal = new Button("Normal");
		Button hard = new Button("Hard");
		Button suicidal = new Button("Suicidal");

		easy.setOnAction(event -> {

			int difficultyNumber = 1;
			this.difficultyNumber = difficultyNumber;

			SetShipsScreen nsc = new SetShipsScreen();
			VBox setShips = nsc.getScreen();
			Scene scene3 = new Scene(setShips, 800, 1000);
			OpeningScreen.getPrimaryStage().setScene(scene3);

		});

		normal.setOnAction(event -> {

			int difficultyNumber = 2;
			this.difficultyNumber = difficultyNumber;

			SetShipsScreen nsc = new SetShipsScreen();
			VBox setShips = nsc.getScreen();
			Scene scene3 = new Scene(setShips, 800, 1000);
			OpeningScreen.getPrimaryStage().setScene(scene3);

		});

		hard.setOnAction(event -> {

			int difficultyNumber = 3;
			this.difficultyNumber = difficultyNumber;

			SetShipsScreen nsc = new SetShipsScreen();
			VBox setShips = nsc.getScreen();
			Scene scene3 = new Scene(setShips, 800, 1000);
			OpeningScreen.getPrimaryStage().setScene(scene3);

		});

		suicidal.setOnAction(event -> {

			int difficultyNumber = 4;
			this.difficultyNumber = difficultyNumber;

			SetShipsScreen nsc = new SetShipsScreen();
			VBox setShips = nsc.getScreen();
			Scene scene3 = new Scene(setShips, 800, 1000);
			OpeningScreen.getPrimaryStage().setScene(scene3);

		});

		root.getChildren().addAll(labelTitle, labelTitle2, easy, normal, hard, suicidal);
		return root;
	}

}
