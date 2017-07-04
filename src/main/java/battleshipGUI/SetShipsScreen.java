package battleshipGUI;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hdm_stuttgart.Battleship.CustomButton;
import com.hdm_stuttgart.Battleship.GameManager;

import game.DifficultyManager;
import game.EDifficulty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * SetShips Screen
 * <p>
 * This is the GUI, if a user starts a new game. After he has chosen the mode as
 * well as the difficulty, he'll get a accordingly game area where he is able to
 * set his different ships on special coordinates.
 * <p>
 * 
 * The user is allowed to set as many ships as possible depending on the chosen
 * difficulty. Depending on the chosen mode, the SetShipsScreenP2 or the
 * GameAreaScreen will be next screen .
 * 
 * <p>
 * 
 * @author Celine Wichmann
 * @autor Lea Baumgärtner
 * @version 1.0
 */

public class SetShipsScreen {

	private static final Logger logger = LogManager.getLogger(SetShipsScreen.class);

	VBox root = new VBox();
	private GridPane grid = new GridPane();
	Label labelHeader = new Label("Set your Ships");
	int i = 0;
	private int currentNumberOfShips;
	private static int possibleShips;
	private static Point difficultyP;

	public static int getpossibleShips() {
		return possibleShips;
	}
	public static Point fieldsize(){
		return difficultyP;
	}

	/**
	 * Method containing the whole screen of SetShipsScreen
	 * 
	 * @return VBox
	 */
	VBox getScreen() {

		
		Button startGame = new Button("Start Game");
		startGame.setDisable(true);
		startGame.setOnAction(event -> {

			GameAreaScreen nsc = new GameAreaScreen();
			VBox GameAreaScreen = nsc.getScreen();
			

			Scene scene = new Scene(GameAreaScreen, 800, 500);
			scene.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
			OpeningScreen.getPrimaryStage().setScene(scene);
			
		});
		
		/*
		 * If the SinglePlayer mode has been chosen
		 */
		if (GameManager.playerNumber == 1) {

			int difficulty = SelectDifficultyScreen.difficultyNumber;

			int possibleShips;

			/**
			 * Getting FieldSize and ships depending on difficulty
			 */
			if (difficulty == 1) {
				difficultyP = DifficultyManager.getFieldSize(EDifficulty.EASY);
				possibleShips = DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.EASY);
				this.possibleShips = possibleShips;

			} else if (difficulty == 2) {
				difficultyP = DifficultyManager.getFieldSize(EDifficulty.NORMAL);
				possibleShips = DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.NORMAL);
				this.possibleShips = possibleShips;

			} else if (difficulty == 3) {
				difficultyP = DifficultyManager.getFieldSize(EDifficulty.HARD);
				possibleShips = DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.HARD);
				this.possibleShips = possibleShips;

			} else {
				difficultyP = DifficultyManager.getFieldSize(EDifficulty.SUICIDAL);
				possibleShips = DifficultyManager.getNumberOfOneFieldBoats(EDifficulty.SUICIDAL);
				this.possibleShips = possibleShips;
			}

			/**
			 * Field for setting ships of the first player
			 * 
			 * Items for the field of the computer player will be generated
			 * randomly
			 */
			Label header1 = new Label(SetNameScreen.name + "'s Area");
			Label header2 = new Label("Please set your ships!");
			Label header3 = new Label("You are allowed to set " + possibleShips + " ships!");
			

			GameManager.getInstance().createGameArea(difficulty, 1);
			GameManager.getInstance().setItemsOnArea(difficulty, 1);

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
							GameManager.getInstance().setShipsOnArea(1, p);
							clickedButton.unhide();

							if(currentNumberOfShips == possibleShips){
								startGame.setDisable(false);
							}
							
						} else {
							logger.info("adding additional ships on the same position is not allowed");
						}
					});

					grid.add(buttons[i][j], i, j);

				}
			}

			GameManager.getInstance().createGameArea(difficulty, 2);
			GameManager.getInstance().setItemsOnAreaPC(difficulty, 2);

			root.getChildren().addAll(labelHeader, header1, header2, header3, startGame, grid);

			return root;

		}
		/*
		 * If Multiplayer mode has been chosen
		 */
		if (GameManager.playerNumber == 2) {

			int difficulty = SelectDifficultyScreen.difficultyNumber;
			Point difficultyP;
			int possibleShips;

			/**
			 * Getting FieldSize and ships depending on difficulty
			 */
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

			Label header1 = new Label(SetNameScreen.nameOne + "'s Area");
			Label header2 = new Label("Please set your ships!");
			Label header3 = new Label("You are allowed to set " + possibleShips + " ships");
			Button next = new Button("Next");
			next.setOnAction(event -> {

				SetShipScreenP2 nsc = new SetShipScreenP2();
				VBox SetShipScreenP2 = nsc.getScreen();
				Scene scene = new Scene(SetShipScreenP2, 800, 1000);
				OpeningScreen.getPrimaryStage().setScene(scene);

			});

			GameManager.getInstance().createGameArea(difficulty, 1);
			GameManager.getInstance().setItemsOnArea(difficulty, 1);

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
						currentNumberOfShips++;
						CustomButton clickedButton = (CustomButton) event.getSource();

						GameManager.getInstance().setShipsOnArea(1, p);
						clickedButton.unhide();
					});

					grid.add(buttons[i][j], i, j);

				}
			}

			root.getChildren().addAll(labelHeader, header1, header2, header3, next, grid);

			return root;
		} else {

			logger.info("No Screen has been called.");

		}

		return root;

	}

}
