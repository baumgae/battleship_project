package battleshipGUI;

import java.awt.Point;
import java.lang.management.LockInfo;

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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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

	// Player der spielen darf
	private int currentPlayer = 1;

	private static final Logger logger = LogManager.getLogger(GameAreaScreen.class);

	/**
	 * VBox containing the whole GameAreaScreen
	 * 
	 * @return VBox
	 */
	private static int hitPlayerOne = 0;
	private static int hitPlayerTwo = 0;
	private static int difficulty = SetShipsScreen.getpossibleShips();

	public VBox getScreen() {

		GameManager.getInstance().startThreadPrintItems();

		GameArea gameAreaOne = GameManager.getInstance().getGameAreaPlayerOne();
		Item items[][] = gameAreaOne.getItems();

		GameArea gameAreatwo = GameManager.getInstance().getGameAreaPlayerTwo();
		Item itemstwo[][] = gameAreatwo.getItems();

		logger.info("Loaded GameAreaScreen");
		VBox root = new VBox();
		HBox root2 = new HBox();
		Label title = new Label("Battleship");
		title.setId("label");
		Button Menu = new Button("Menu");

		Point difficultyP = SetShipsScreen.fieldsize();

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

			for (int i = 0; i < buttons.length; i++) {
				for (int j = 0; j < buttons[i].length; j++) {

					Point p = new Point(i, j);
					buttons[i][j] = new CustomButton(p, items[i][j].getID());

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
				scene3.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
				OpeningScreen.getPrimaryStage().setScene(scene3);
			});

			middle.getChildren().addAll(headerM, endGame);

			VBox right = new VBox();
			Label header2 = new Label("Computer's Area");

			CustomButton buttons2[][] = new CustomButton[difficultyP.x][difficultyP.y];

			for (int i = 0; i < buttons2.length; i++) {
				for (int j = 0; j < buttons2[i].length; j++) {

					Point p = new Point(i, j);

					buttons2[i][j] = new CustomButton(p, itemstwo[i][j].getID());

					buttons2[i][j].setOnAction(event -> {
						CustomButton clickedButton = (CustomButton) event.getSource();

						if (gameAreatwo.getIDCoordinate(p) == 5) {
							hitPlayerTwo++;
						}
						if(hitPlayerTwo == difficulty){
							  Alert alert = new Alert(AlertType.INFORMATION);
					            alert.setTitle("YEAH");
					            alert.setHeaderText("OH---NO---YOU-WON!");
					            alert.setContentText("Now you get a reduced price for the DLC, instead of 99 $ - now 50 $ !");
					            alert.show();
						}
						else{
							
						}
						clickedButton.unhide();
						logger.info("hitPlayerTwo: " + hitPlayerTwo);
						
						
						

						//
						// try {
						// if (gameAreatwo.getIDCoordinate(p) == 0) {
						// GameManager.getInstance().getPlayerOne()
						// .countPoints(gameAreatwo.getPointsCoordinate(0, p));
						// clickedButton.unhide();
						// System.out.println("water");
						// } else if (gameAreatwo.getIDCoordinate(p) == 1) {
						// GameManager.getInstance().getPlayerOne()
						// .countPoints(gameAreatwo.getPointsCoordinate(1, p));
						// clickedButton.unhide();
						// System.out.println("del");
						// } else if (gameAreatwo.getIDCoordinate(p) == 2) {
						// GameManager.getInstance().getPlayerOne()
						// .countPoints(gameAreatwo.getPointsCoordinate(2, p));
						// clickedButton.unhide();
						// System.out.println("egal");
						// } else if (gameAreatwo.getIDCoordinate(p) == 3) {
						// GameManager.getInstance().getPlayerOne()
						// .countPoints(gameAreatwo.getPointsCoordinate(3, p));
						// clickedButton.unhide();
						// System.out.println("min");
						// } else if (gameAreatwo.getIDCoordinate(p) == 4) {
						// GameManager.getInstance().getPlayerOne()
						// .countPoints(gameAreatwo.getPointsCoordinate(4, p));
						// clickedButton.unhide();
						// System.out.println("Sarah");
						// } else if (gameAreatwo.getIDCoordinate(p) == 5) {
						// GameManager.getInstance().getPlayerOne()
						// .countPoints(gameAreatwo.getPointsCoordinate(5, p));
						// hitPlayerTwo++;
						// clickedButton.unhide();
						// System.out.println("ship");
						// } else {
						// logger.debug("There aren't any points for you...");
						// clickedButton.unhide();
						// }
						// } catch (Exception NoGameElementException) {
						// NoGameElementException.getMessage();
						// }
						// clickedButton.unhide();
					});

					gameGrid2.add(buttons2[i][j], i, j);

				}
			}

			right.getChildren().addAll(header2, gameGrid2);

			root2.getChildren().addAll(left, middle, right);

			root.getChildren().addAll(title, Menu, root2);
			return root;

			/*
			 * If Multiplayer mode has been chosen
			 */
		} else if (GameManager.playerNumber == 2) {

			VBox left = new VBox();
			Label header1 = new Label(SetNameScreen.nameOne + "'s Area");

			CustomButton buttons[][] = new CustomButton[difficultyP.x][difficultyP.y];

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
				scene3.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
				OpeningScreen.getPrimaryStage().setScene(scene3);
			});
			middle.getChildren().addAll(headerM, endGame);

			VBox right = new VBox();
			Label header2 = new Label(SetNameScreen.nameTwo + "'s Area");

			CustomButton buttons2[][] = new CustomButton[difficultyP.x][difficultyP.y];

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
			root.getChildren().addAll(title, Menu, root2);
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
