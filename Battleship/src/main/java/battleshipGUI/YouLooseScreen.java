
package battleshipGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * YouLoose Screen
 * <p>
 * This is the GUI, if the user lost the current game.
 * <p>
 * After the game has ended, the user gets one of the possible screens.
 * If he looses, he will get this "You Loose" Screen. <br>
 * If he wins, he will get the "You win" Screen <br>
 * Over here the user has different options. 
 * He can start a new Game by pushing the button {@New Game}.<br>
 * Or he is also able to quit the current screen by using {@Quit}
 * 
 * <p>
 * @author Lea Baumgärtner
 * @version 0.1 
 */


public class YouLooseScreen extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root = new VBox();
		
		/**
		 * Title for the whole screen
		 */
		Label labelTitle = new Label("---CONGRATULATIONS---");
		Label labelTitle2 = new Label("---YOU---LOOSE---");
		
		// Here we could add an image with a Dead Head on it.
		// Image image = new Image(getClass().getResourceAsStream("ToteknopfDings.jpg"));
		//Label label3 = new Label("Battleship", new ImageView(image));
		
		/**
		 * Button for starting a new Game
		 */
		Button newGame = new Button("New Game");

		// This should be the EventHandling for opening the NewGameScreen.java
		
		newGame.setOnAction(
				event -> newGame.setText("Clicked!"));
		
	
		/**
		 * Button for ending the whole the screen and going back to menu
		 */
		Button backToMenu = new Button("Back to menu");
		
		// EventHandler for ending the complete Application
		backToMenu.setOnAction(
				event -> backToMenu.setText("You may not leave!"));
		
		
		root.getChildren().addAll(labelTitle, labelTitle2, newGame, backToMenu);
		
		
		Scene scene = new Scene(root, 300, 400);
		// scene.getStylesheets().add("OpeningSceneCss.css");
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("EndScene - You Loose");
		primaryStage.show();
		
		
	}
	
}
