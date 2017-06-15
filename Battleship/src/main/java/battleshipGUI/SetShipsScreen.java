package battleshipGUI;

import com.hdm_stuttgart.Battleship.GameManager;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


/**
 * SetShips Screen 
 * <p>
 * This is the GUI, if a user starts a new game.
 * After he has chosen the mode as well as the difficulty, he'll get a 
 * accordingly game area where he is able to set his different ships
 * on special coordinates.
 * <p>
 * 
 * First, the user has to set his name.
 * Below he can see the different ships which are offered to him.
 * Trough clicking on a ship and after that directly
 * on a coordinate, he will be able to set the ships.
 * Through clicking on a ship two times, the user is able to change 
 * the direction of a ship.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.1 
 */

public class SetShipsScreen {
	
	VBox root = new VBox();
	Label labelHeader = new Label("Set your Ships");
	Button Next = new Button("Next");

	VBox getScreen() {
		
		if(GameManager.playerNumber == 1) { 
		
		Button startGame = new Button("Start Game"); 
		startGame.setOnAction(event -> {
			
			GameAreaScreen nsc = new GameAreaScreen();
			VBox GameAreaScreen = nsc.getScreen();
			Scene scene3 = new Scene(GameAreaScreen, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene3);
			
		});
		
		}
		root.getChildren().addAll(labelHeader, startGame);
		
		Scene scene = new Scene(root, 300, 400);
		
		return root;
		
		
	}


}

// Für das Koordinatensystem ein ButtonArray zweidimensional bauen. 
// Einen eigenen Button erstellen, der von JavaFX Button erbt.
// Dieser Button hat immer Zwei bilder für aufgedeckt und nicht aufgedeckt
// Und das haben dann alle Buttons in diesem Array.

//public VBox getScreen() {
//	VBox root = new VBox();
//	
//	
//	
//	return root;
//}

