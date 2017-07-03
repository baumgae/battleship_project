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
 * @version 0.1
 */

public class GameAreaScreen {

	GridPane gameGrid1 = new GridPane();
	GridPane gameGrid2 = new GridPane();
	
	private static GameAreaScreen instanceGameArea;
	
	
	
	private static final Logger logger = LogManager.getLogger(GameAreaScreen.class);
	
	
	public static GameAreaScreen getInstance(){
		if(instanceGameArea == null){
			instanceGameArea = new GameAreaScreen();
		}
		return instanceGameArea;
	}
	
	
	

	// einen Button mit Connection zum Menü einbauen
	public VBox getScreen() {
		
		GameManager.getInstance().startThreadPrintItems();
		
		logger.info("Loaded GameAreaScreen");
		VBox root = new VBox();
		HBox root2 = new HBox();
		Label Title = new Label("Battleship");
		Button Menu = new Button("Menu");
		

		int difficulty = SelectDifficultyScreen.difficultyNumber;
		Point difficultyP;

		// Durch die zuvor ausgewählte Schwierigkeit die größe des Feldes holen.
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

			ErrorScreen nsc = new ErrorScreen();
			VBox ErrorScreen = nsc.getScreen();
			Scene scene = new Scene(ErrorScreen, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene);

		});

		// Wenn single Player
		if (GameManager.playerNumber == 1) {

			// Linke Seite vom ersten Player
			VBox left = new VBox();
			Label header1 = new Label(SetNameScreen.name + "'s Area");

			// Erschaffen der GameArea und übergeben der Items und irgenwie
			// Schiffe (schön wärs)
			CustomButton buttons[][] = new CustomButton[difficultyP.x][difficultyP.y];

			GameArea gameAreaOne = GameManager.getInstance().getGameAreaPlayerOne();
			Item items[][] = gameAreaOne.getItems();

			for (int i = 0; i < buttons.length; i++) {
				for (int j = 0; j < buttons[i].length; j++) {

					Point p = new Point(i, j);
					buttons[i][j] = new CustomButton(p, items[i][j].getID());
					logger.info("item ID: " + items[i][j].getID());
					buttons[i][j].setOnAction(event -> {

						// Hier drauf müsste der Computer Schießen

						// Jetzt müsste man noch regel, dass abwechselnd
						// geschossen wird!
						// Und die übergebenen Koordinaten der AI als klick
						// betrachtet werdem
						CustomButton clickedButton2 = (CustomButton) event.getSource();
						try {
							
							// Aber nur so viele Shiffe, wie es gibt :D
							int currentNumberOfShips = 0;
							int possibleShips = SetShipsScreen.possibleShips;
							
							if(currentNumberOfShips >= possibleShips){
								Point r = GameManager.getInstance().generateRandomShoots();
								GameManager.getInstance().shootOnCoordinatePC(r);
								// Wenn sich unter dem Button ein Ship befindet und es.
								// also if bedingung, wenn die ID darunter == 0 ist, dann
								currentNumberOfShips++;
								return;
							}
							else {
								// End the game
							}

						} catch (Exception e) {
							logger.info("You cannot shoot twice on one field!");

						}
						clickedButton2.unhide();
					});
					
					gameGrid1.add(buttons[i][j], i, j);
					
					// Könnte das Funktionieren? - Übergabe der Items und Schiffe
					// gameGrid1 = renderGameArea(GameManager.getInstance().getPlayerOne());
					
				}
			}

			left.getChildren().addAll(header1, gameGrid1);

			// VBox for creating some space between the Areas
			VBox middle = new VBox();
			Label headerM = new Label(" 		    ");
			middle.getChildren().addAll(headerM);

			// Rechte Seite vom zweiten Player
			VBox right = new VBox();
			Label header2 = new Label("Computer's Area");

			// Erschaffen der GameArea und Items und Schiffe (schön wäres)
			CustomButton buttons2[][] = new CustomButton[difficultyP.x][difficultyP.y];

			GameArea gameAreatwo = GameManager.getInstance().getGameAreaPlayerTwo();
			Item itemstwo[][] = gameAreatwo.getItems();

			for (int i = 0; i < buttons2.length; i++) {
				for (int j = 0; j < buttons2[i].length; j++) {

					Point p = new Point(i, j);

					buttons2[i][j] = new CustomButton(p, itemstwo[i][j].getID());

					buttons2[i][j].setOnAction(event -> {

						// Hier drauf müsste der echte Spieler schießen
						CustomButton clickedButton = (CustomButton) event.getSource();
						try {
							// Aber nur so viele Shiffe, wie es gibt :D
							int currentNumberOfShips = 0;
							int possibleShips = SetShipsScreen.possibleShips;
							
							if(currentNumberOfShips >= possibleShips){
								GameManager.getInstance().shootOnCoordinate(1, p);
								// Wenn sich unter dem Button ein Ship befindet und es.
								// also if bedingung, wenn die ID darunter == 0 ist, dann
								currentNumberOfShips++;
								return;
							}
							else {
								// End the game
							}
						} catch (Exception e) {
							logger.info("You cannot shoot twice on one field!");

						}
						clickedButton.unhide();

					});
					
					gameGrid2.add(buttons2[i][j], i, j);
					
					// Könnte das Funktionieren? - Übergabe der Items und Schiffe
					// gameGrid2 = renderGameArea(GameManager.getInstance().getPlayerTwo());
					
				}
			}

			right.getChildren().addAll(header2, gameGrid2);

			// Adden der linken und rechten Seite zu einer HBox, damit
			// nebeneinander
			root2.getChildren().addAll(left, middle, right);

			// Adden des Titles und des Menus sowie die komplette HBox in eine
			// VBox
			root.getChildren().addAll(Title, Menu, root2);
			return root;

			// Multiplayer Modus
		} else if (GameManager.playerNumber == 2) {

			// Erster Player linke Seite
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
						// Spieler2 darf drauf schießen
						try {
							// Aber nur so viele Shiffe, wie es gibt :D
							int currentNumberOfShips = 0;
							int possibleShips = SetShipsScreen.possibleShips;
							
							if(currentNumberOfShips >= possibleShips){
								GameManager.getInstance().shootOnCoordinate(1, p);
								// Wenn sich unter dem Button ein Ship befindet und es.
								// also if bedingung, wenn die ID darunter == 0 ist, dann
								currentNumberOfShips++;
								return;
							}
							else {
								// End the game
							}
						} catch (Exception e) {
							logger.info("You cannot shoot twice on one field!");

						}
					// Füge Methode renderGameArea hinzu, damit die Items geholt werden!
						
						
						clickedButton.unhide();

					});
					gameGrid1.add(buttons[i][j], i, j);
				}
			}
			

			left.getChildren().addAll(header1, gameGrid1);


			// VBox for creating some space between the Areas
			VBox middle = new VBox();
			Label headerM = new Label(" 		    ");
			middle.getChildren().addAll(headerM);
			
			// Zweiter Player rechte Seite
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

						// Hier drauf müsste der echte Spieler schießen
						CustomButton clickedButton = (CustomButton) event.getSource();
						try {
							// Aber nur so viele Shiffe, wie es gibt :D
							int currentNumberOfShips = 0;
							int possibleShips = SetShipsScreen.possibleShips;
							
							if(currentNumberOfShips >= possibleShips){
								GameManager.getInstance().shootOnCoordinate(1, p);
								// Wenn sich unter dem Button ein Ship befindet und es.
								// also if bedingung, wenn die ID darunter == 0 ist, dann
								currentNumberOfShips++;
								return;
							}
							else {
								// End the game
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

	// Modifizierte Methode renderGameArea - Original ist zu finden in der
	// SetShipArea
	
	// Diese Methode funktioniert nicht._.

	public GridPane renderGameArea(IPlayer player) {
		GridPane grid = new GridPane();

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

		if (player.equals(GameManager.getInstance().getPlayerOne())) {
			GameArea gameArea = GameManager.getInstance().getGameAreaPlayerOne();
			Item items[][] = gameArea.getItems();

			for (int x = 0; x < items.length; x++) {
				for (int y = 0; y < items[x].length; y++) {

					Point p = new Point(x, y);
					CustomButton b = new CustomButton(p, items[x][y].getID());
					grid.add(b, x, y);
					b.setOnAction(event -> {
						CustomButton clickedButton = (CustomButton) event.getSource();
						clickedButton.unhide();

					});
				}
			}

			return grid;
		} else {
			GameArea gameArea = GameManager.getInstance().getGameAreaPlayerTwo();
			Item items[][] = gameArea.getItems();

			for (int x = 0; x < items.length; x++) {
				for (int y = 0; y < items[x].length; y++) {

					Point p = new Point(x, y);
					CustomButton b = new CustomButton(p, items[x][y].getID());

					grid.add(b, x, y);
					b.setOnAction(event -> {
						CustomButton clickedButton = (CustomButton) event.getSource();
						clickedButton.unhide();
					});
				}
			}
			return grid;
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
