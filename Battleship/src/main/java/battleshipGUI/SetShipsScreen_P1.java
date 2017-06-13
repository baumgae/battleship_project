package battleshipGUI;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * SetShips Screen 
 * <p>
 * This is the GUI, if you start a new Game as Player 1.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.1 
 */

public class SetShipsScreen_P1 extends Application {
	
	// Für das Koordinatensystem ein ButtonArray zweidimensional bauen. 
	// Einen eigenen Button erstellen, der von JavaFX Button erbt.
	// Dieser Button hat immer Zwei bilder für aufgedeckt und nicht aufgedeckt
	// Und das haben dann alle Buttons in diesem Array.
	
//	public VBox getScreen() {
//		VBox root = new VBox();
//		
//		
//		
//		return root;
//	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root = new VBox();
		
		Label labelHeader = new Label("Set your Ships");
		
		Button startGame = new Button("GameAreaScreen");
		
		startGame.setOnAction(event -> startGame.setText("GameAreaScreen"));
		
	}

	
}
