package battleshipGUI;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hdm_stuttgart.Battleship.PrintItemThread;
import com.hdm_stuttgart.Battleship.CustomButton;
import com.hdm_stuttgart.Battleship.GameManager;

import game.AlreadyShotException;
import game.DifficultyManager;
import game.EDifficulty;
import game.GameArea;
import gameConfigurations.IPlayer;
import gameConfigurations.Item;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * GameArea Screen
 * <p>
 * This is the GUI while a user or two users are playing the game. Each player
 * has got his own game area with two different <br>
 * coordinate fields on them. One's the shooting area while the other one is the
 * ship area.
 * <p>
 * 
 * Over here the user is able to chose a coordinate on which he wants to shoot.
 * If he has shot on a coordinate, the image will change. Whether he has hit a
 * ship, water or a gameItem, the image will change accordingly. He is also able
 * to see how many times he has hit the shooting area in general and how many
 * points he got as well as them from his enemy.
 * 
 * <p>
 * 
 * @author Celine Wichmann
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class GameAreaScreen {

	GridPane gameGrid1 = new GridPane();
	GridPane gameGrid2 = new GridPane();

	private static final Logger logger = LogManager.getLogger(GameAreaScreen.class);

	/**
	 * VBox containing the whole GameAreaScreen
	 * 
	 * @return VBox
	 */
	public VBox getScreen() {

		GameManager.getInstance().startThreadPrintItems();

		logger.info("Loaded GameAreaScreen");
		VBox root = new VBox();
		HBox root2 = new HBox();
		Label Title = new Label("Battleship");
		Button Menu = new Button("Menu");

		int difficulty = SelectDifficultyScreen.difficultyNumber;
		Point difficultyP;

		if (difficulty == 1) {
			difficultyP = DifficultyManager.getFieldSize(EDifficulty.EASY);

		} else if (difficulty == 2) {
			difficultyP = DifficultyManager.getFieldSize(EDifficulty.NORMAL);

		} else if (difficulty == 3) {
			difficultyP = DifficultyManager.getFieldSize(EDifficulty.HARD);

		} else {
			difficultyP = DifficultyManager.getFieldSize(EDifficulty.SUICIDAL);
		}

		Menu.setOnAction(event -> {

			MenuScreen nsc = new MenuScreen();
			VBox MenuScreen = nsc.getScreen();
			Scene scene = new Scene(MenuScreen, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene);

		});

		/**
		 * If singleplayer mode has been chosen
		 */
		if (GameManager.playerNumber == 1) {

			VBox left = new VBox();
			Label header1 = new Label(SetNameScreen.name + "'s Area");

			CustomButton buttons[][] = new CustomButton[difficultyP.x][difficultyP.y];

			GameArea gameAreaOne = GameManager.getInstance().getGameAreaPlayerOne();
			Item items[][] = gameAreaOne.getItems();

			for (int i = 0; i < buttons.length; i++) {
				for (int j = 0; j < buttons[i].length; j++) {

					Point p = new Point(i, j);
					buttons[i][j] = new CustomButton(p, items[i][j].getID());
					logger.info("item ID: " + items[i][j].getID());
					buttons[i][j].setOnAction(event -> {

						CustomButton clickedButton2 = (CustomButton) event.getSource();
						try {

							int currentNumberOfShips = 0;
							int possibleShips = SetShipsScreen.getpossibleShips();

							if (currentNumberOfShips < possibleShips) {
								Point r = GameManager.getInstance().generateRandomShoots();
								GameManager.getInstance().shootOnCoordinatePC(r);

								currentNumberOfShips++;
							}

						} catch (Exception e) {
							logger.info("You cannot shoot twice on one field!");

						}
						clickedButton2.unhide();
					});

					gameGrid1.add(buttons[i][j], i, j);

				}
			}

			left.getChildren().addAll(header1, gameGrid1);

			// VBox for creating some space between the Areas
			VBox middle = new VBox();
			Label headerM = new Label(" 		    ");

			Button endGame = new Button("End of the Game");
			endGame.setOnAction(event2 -> {
				ScoreScreen ngs = new ScoreScreen();
				VBox ScoreScreen = ngs.getScreen();
				Scene scene3 = new Scene(ScoreScreen, 300, 400);
				OpeningScreen.getPrimaryStage().setScene(scene3);
			});

			middle.getChildren().addAll(headerM, endGame);

			VBox right = new VBox();
			Label header2 = new Label("Computer's Area");

			CustomButton buttons2[][] = new CustomButton[difficultyP.x][difficultyP.y];

			GameArea gameAreatwo = GameManager.getInstance().getGameAreaPlayerTwo();
			Item itemstwo[][] = gameAreatwo.getItems();

			for (int i = 0; i < buttons2.length; i++) {
				for (int j = 0; j < buttons2[i].length; j++) {

					Point p = new Point(i, j);

					buttons2[i][j] = new CustomButton(p, itemstwo[i][j].getID());

					buttons2[i][j].setOnAction(event -> {

						CustomButton clickedButton = (CustomButton) event.getSource();
						try {

							int currentNumberOfShips = 0;
							int possibleShips = SetShipsScreen.getpossibleShips();

							if (currentNumberOfShips < possibleShips) {
								GameManager.getInstance().shootOnCoordinate(1, p);

								currentNumberOfShips++;
							}

						} catch (Exception e) {
							logger.info("You cannot shoot twice on one field!");

						}
						clickedButton.unhide();

					});

					gameGrid2.add(buttons2[i][j], i, j);

				}
			}

			right.getChildren().addAll(header2, gameGrid2);

			root2.getChildren().addAll(left, middle, right);

			root.getChildren().addAll(Title, Menu, root2);
			return root;

			/*
			 * If Multiplayer mode has been chosen
			 */
		} else if (GameManager.playerNumber == 2) {

			VBox left = new VBox();
			Label header1 = new Label(SetNameScreen.nameOne + "'s Area");

			CustomButton buttons[][] = new CustomButton[difficultyP.x][difficultyP.y];

			GameArea gameAreaOne = GameManager.getInstance().getGameAreaPlayerOne();
			Item items[][] = gameAreaOne.getItems();

			for (int i = 0; i < buttons.length; i++) {
				for (int j = 0; j < buttons[i].length; j++) {

					Point p = new Point(i, j);
					buttons[i][j] = new CustomButton(p, items[i][j].getID());
					buttons[i][j].setOnAction(event -> {

						CustomButton clickedButton = (CustomButton) event.getSource();

						try {

							int currentNumberOfShips = 0;
							int possibleShips = SetShipsScreen.getpossibleShips();

							if (currentNumberOfShips < possibleShips) {
								GameManager.getInstance().shootOnCoordinate(1, p);

								currentNumberOfShips++;
							}

						} catch (Exception e) {
							logger.info("You cannot shoot twice on one field!");

						}

						clickedButton.unhide();

					});
					gameGrid1.add(buttons[i][j], i, j);
				}
			}

			left.getChildren().addAll(header1, gameGrid1);

			// VBox for creating some space between the Areas
			VBox middle = new VBox();
			Label headerM = new Label(" 		    ");
			Button endGame = new Button("End of the Game");
			endGame.setOnAction(event2 -> {
				ScoreScreen ngs = new ScoreScreen();
				VBox ScoreScreen = ngs.getScreen();
				Scene scene3 = new Scene(ScoreScreen, 300, 400);
				OpeningScreen.getPrimaryStage().setScene(scene3);
			});
			middle.getChildren().addAll(headerM, endGame);

			VBox right = new VBox();
			Label header2 = new Label(SetNameScreen.nameTwo + "'s Area");

			CustomButton buttons2[][] = new CustomButton[difficultyP.x][difficultyP.y];

			GameArea gameAreatwo = GameManager.getInstance().getGameAreaPlayerTwo();
			Item itemstwo[][] = gameAreatwo.getItems();

			for (int i = 0; i < buttons2.length; i++) {
				for (int j = 0; j < buttons2[i].length; j++) {

					Point p = new Point(i, j);

					buttons2[i][j] = new CustomButton(p, itemstwo[i][j].getID());

					buttons2[i][j].setOnAction(event -> {

						CustomButton clickedButton = (CustomButton) event.getSource();
						try {

							int currentNumberOfShips = 0;
							int possibleShips = SetShipsScreen.getpossibleShips();

							if (currentNumberOfShips < possibleShips) {
								GameManager.getInstance().shootOnCoordinate(1, p);
								currentNumberOfShips++;
							}

						} catch (Exception e) {
							logger.info("You cannot shoot twice on one field!");

						}
						clickedButton.unhide();

					});

					gameGrid2.add(buttons2[i][j], i, j);
				}
			}

			right.getChildren().addAll(header2, gameGrid2);

			root2.getChildren().addAll(left, middle, right);
			root.getChildren().addAll(Title, Menu, root2);
			return root;

		} else {
			Label headerError = new Label("Something went wrong...");

			root.getChildren().addAll(headerError);

			return root;
		}
	}
}

// Saved aus sicherheitsgründen.

// if (player.equals(GameManager.getInstance().getPlayerOne())) {
// GameArea gameArea = GameManager.getInstance().getGameAreaPlayerOne();
// Item items[][] = gameArea.getItems();
//
// for (int x = 0; x < items.length; x++) {
// for (int y = 0; y < items[x].length; y++) {
// CustomButton b = new CustomButton(new Point(x, y), items[x][y].getID());
// grid.add(b, x, y);
// b.setOnAction(event -> {
// CustomButton clickedButton = (CustomButton) event.getSource();
// clickedButton.unhide();
// });
// }
