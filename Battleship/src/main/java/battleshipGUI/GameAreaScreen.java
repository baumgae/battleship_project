package battleshipGUI;

import com.hdm_stuttgart.Battleship.GameManager;

import game.GameArea;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * GameArea Screen
 * <p>
 * This is the GUI while a user or two users are playing the game.
 * Each player has got his own game area with two different <br>
 * coordinate fields on them. One's the shooting area while the other one
 * is the ship area.
 * <p>
 * 
 * Over here the user is able to chose a coordinate on which he wants to shoot.
 * If he has shot on a coordinate, the image will change. Whether he has
 * hit a ship, water or a gameItem, the image will change accordingly.
 * He is also able to see how many times he has hit the shooting area in general and
 * how many points he got as well as them from his enemy.  
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.1 
 */

public class GameAreaScreen {

	/*
	 * TJ: Wenn ich später die Methode createGameArea aufrufe, und diese eine GameArea erschafft.
	 * 	   Sollen dann bereits dort ein zweidimensionales Array mit den Buttons erstellt werden.
	 * 
	 *	   Oder sollen die erst hier hinzugefügt werden?
	 *	
	 */
	
	
	// einen Button mit Connection zum Menü einbauen 
	public VBox getScreen() {
		VBox root = new VBox();
		Label Title = new Label("Battleship");
		Button Menu = new Button("Menu");
		
		Menu.setOnAction(event -> {
			
			ErrorScreen nsc = new ErrorScreen();
			VBox ErrorScreen = nsc.getScreen();
			Scene scene = new Scene(ErrorScreen, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene);
			
		});
		
		root.getChildren().addAll(Title, Menu);
		
		if(GameManager.playerNumber == 1) {
			
			HBox left = new HBox();
			Label header1 = new Label(SetNameScreen.name + "'s Area");
			
			HBox right = new HBox();
			Label header2 = new Label("Computer's Area");
			//Felder einfügen, GameArea aufrufen
			
			root.getChildren().addAll(left, header1, right, header2);
			return root;
			
		} if(GameManager.playerNumber == 2) {
			
			HBox left = new HBox();
			Label header1 = new Label(SetNameScreen.nameOne + "'s Area");
			
			HBox right = new HBox();
			Label header2 = new Label(SetNameScreen.nameTwo + "'s Area");
			
			root.getChildren().addAll(left, header1, right, header2);
			
			return root;
			
			
			
			
		}
		
		return root;
	}
	
	
	
}
