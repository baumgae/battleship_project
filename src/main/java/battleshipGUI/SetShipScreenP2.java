
package battleshipGUI;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hdm_stuttgart.Battleship.CustomButton;
import com.hdm_stuttgart.Battleship.GameManager;
import game.GameArea;
import gameConfigurations.Item;

import game.DifficultyManager;
import game.EDifficulty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * SetShipsScreenP2
 * <p>
 * This is the GUI, if a user starts a new game in multiplayer mode.
 * <p>
 * 
 * This is the second Screen where player two is allowed to set his ships by
 * clicking on the buttons.
 * 
 * <p>
 * 
 * @author Celine Wichmann
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class SetShipScreenP2 {

	private static final Logger logger = LogManager.getLogger(SetShipScreenP2.class);

	VBox root = new VBox();
	private GridPane grid = new GridPane();
	Label labelHeader = new Label("Set your Ships");
	int i = 0;
	private int currentNumberOfShips;

	/**
	 * Method containing the whole SetShipsScreenP2
	 * 
	 * @return VBox
	 */
	public VBox getScreen() {

		int difficulty = SelectDifficultyScreen.difficultyNumber;
		Point difficultyP;
		int possibleShips;

		if (difficulty == 1) {
			difficultyP = DifficultyManager.getFieldSize(EDifficulty.EASY);
			possibleShips = DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.EASY);

		} else if (difficulty == 2) {
			difficultyP = DifficultyManager.getFieldSize(EDifficulty.NORMAL);
			possibleShips = DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.NORMAL);

		} else if (difficulty == 3) {
			difficultyP = DifficultyManager.getFieldSize(EDifficulty.HARD);
			possibleShips = DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.HARD);

		} else {
			difficultyP = DifficultyManager.getFieldSize(EDifficulty.SUICIDAL);
			possibleShips = DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.SUICIDAL);
		}

		Label header1 = new Label(SetNameScreen.name + "'s Area");
		Label header2 = new Label("Please set your ships!");
		Label header3 = new Label("You are allowed to set " + possibleShips + " ships!");
		Button startGame = new Button("Start Game");
		startGame.setOnAction(event -> {

			GameAreaScreen nsc = new GameAreaScreen();
			VBox GameAreaScreen = nsc.getScreen();
			Scene scene = new Scene(GameAreaScreen, 800, 1000);
			scene.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
			OpeningScreen.getPrimaryStage().setScene(scene);
		});

		GameManager.getInstance().createGameArea(difficulty, 2);
		GameManager.getInstance().setItemsOnArea(difficulty, 2);
		CustomButton buttons[][] = new CustomButton[difficultyP.x][difficultyP.y];

		for (int i = 0; i < buttons.length; i++) {

			for (int j = 0; j < buttons[i].length; j++) {
				Point p = new Point(i, j);
				buttons[i][j] = new CustomButton(p, 5);
				buttons[i][j].setOnAction(event -> {
					if (currentNumberOfShips >= possibleShips) {
						logger.info("adding additional ships is not allowed. maximum number of ships is exceeded: "
								+ possibleShips);
						return;
					}
					if (GameManager.getInstance().getGameAreaPlayerOne().getIDCoordinate(p) != 5) {
						currentNumberOfShips++;
						CustomButton clickedButton = (CustomButton) event.getSource();
						GameManager.getInstance().setShipsOnArea(2, p);
						clickedButton.unhide();
					}
					else{
						logger.info("adding additional ships on the same position is not allowed");	
					}
				});

				grid.add(buttons[i][j], i, j);

			}
		}

		root.getChildren().addAll(labelHeader, header1, header2, header3, startGame, grid);

		return root;

	}
}