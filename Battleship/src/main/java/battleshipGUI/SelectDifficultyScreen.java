package battleshipGUI;



import com.hdm_stuttgart.Battleship.GameManager;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Select Difficulty Screen
 * <p>
 * This is the GUI, after the user choose the mode.
 * Here it is possible for him to decide, which
 * Difficulty he wants to play.
 * <p>
 * 
 * The user has different options. He can start the game in EASY mode by pushing the button {@easy}.<br>
 * He can start the game in NORMAL mode by pushing the button {@normal}.<br>
 * He can start the game in HARD mode by pushing the button {@hard}.<br>
 * He can start the game in SUICIDAL mode by pushing the button {@suicidal}.<br>
 * <p>
 * @author Lea Baumgärtner
 * @version 0.1 
 */


public class SelectDifficultyScreen{
	
	public static int difficultyNumber;
	
	public VBox getScreen() {
		VBox root = new VBox();
		
		
		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Set your difficulty!");
		
		
		Button easy = new Button("Easy");
		Button normal = new Button("Normal");
		Button hard = new Button("Hard");
		Button suicidal = new Button("Suicidal");
		
		easy.setOnAction(
				event -> {
					// Übergebem der Feldgröße und 
					// Übergebem der Anzahl an Items für das nächste Screen!
					int difficultyNumber = 1;
					this.difficultyNumber = difficultyNumber;
					
					// TJ: Die GameArea muss jetzt initalisiert werden
					// GameManager.getInstance().createGameArea(difficultyNumber);
					// Ich hätte das nun in der SetShip Area Initialisiert
					
					SetShipsScreen nsc = new SetShipsScreen();
					VBox setShips = nsc.getScreen();
					Scene scene3 = new Scene(setShips, 300, 400);
					OpeningScreen.getPrimaryStage().setScene(scene3);
					
				});
		
		normal.setOnAction(
				event -> {
					// Übergebem der Feldgröße und 
					// Übergebem der Anzahl an Items für das nächste Screen!
					
					int difficultyNumber = 2;
					this.difficultyNumber = difficultyNumber;
					
					// TJ: Die GameArea muss jetzt initalisiert werden
					//GameManager.getInstance().createGameArea(difficultyNumber);
					// Ich initialisiere es im SetShipsScreen
					
					SetShipsScreen nsc = new SetShipsScreen();
					VBox setShips = nsc.getScreen();
					Scene scene3 = new Scene(setShips, 300, 400);
					OpeningScreen.getPrimaryStage().setScene(scene3);
					
				});
		
		hard.setOnAction(
				event -> {
					// Übergebem der Feldgröße und 
					// Übergebem der Anzahl an Items für das nächste Screen!
					
					int difficultyNumber = 3;
					this.difficultyNumber = difficultyNumber;
					
					// TJ: Die GameArea muss jetzt initalisiert werden
					// GameManager.getInstance().createGameArea(difficultyNumber);
					// Initialisierung im SetShipScreen
					
					SetShipsScreen nsc = new SetShipsScreen();
					VBox setShips = nsc.getScreen();
					Scene scene3 = new Scene(setShips, 300, 400);
					OpeningScreen.getPrimaryStage().setScene(scene3);
					
					
					
				});
		
		suicidal.setOnAction(
				event -> {
					
					int difficultyNumber = 4;
					this.difficultyNumber = difficultyNumber;
					// Übergebem der Feldgröße und 
					// Übergebem der Anzahl an Items für das nächste Screen!
					
					// TJ: Die GameArea muss jetzt initalisiert werden
					// GameManager.getInstance().createGameArea(difficultyNumber);
					// Im SetShipScreen initilaisiert.
					
					SetShipsScreen nsc = new SetShipsScreen();
					VBox setShips = nsc.getScreen();
					Scene scene3 = new Scene(setShips, 300, 400);
					OpeningScreen.getPrimaryStage().setScene(scene3);
					
				});
		
		
		
		root.getChildren().addAll(labelTitle, labelTitle2, 
					easy, normal, hard, suicidal);
		return root;
	}
		
	}
