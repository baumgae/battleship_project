package battleshipGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * New Game Scene - Select your Player
 * <p>
 * This is the GUI, if a user starts a new game.
 * Over here the user has to chose whether he want to play alone against
 * the artificial Intelligence or against a human player.
 * <p>
 * 
 * The user has different options. He can start a Game as a <br>
 * single player by pushing the button {@Single Player},<br>
 * or with multiple player by pushing {@Multiplayer}<br>
 * As soon as he chose a mode, the next screen will appear.
 * 
 * <p>
 * @author Lea Baumgärtner
 * @version 0.1 
 */


public class NewGameScreen extends Application{
	
	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root = new VBox();
		
		
		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Select your Player!");
		
		
		Button singlePlayer = new Button("Single Player");
		Button multiPlayer = new Button("Multi Player");
		
		
		
		root.getChildren().addAll(labelTitle, labelTitle2, singlePlayer, multiPlayer);
		
		
		Scene scene = new Scene(root, 300, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("New Game - Battleship");
		primaryStage.show();
		
		
	}
	
	

}
