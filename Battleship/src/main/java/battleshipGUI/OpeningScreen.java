package battleshipGUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * Opening Screen
 * <p>
 * This is the GUI, if a user starts the game / application.
 * Then am opening Screen with choices will appear.
 * <p>
 * 
 * The user has different options. He can start a new Game by pushing the button {@New Game}.<br>
 * He can continue an "old" game by pushing {@Continue}<br>
 * He can take a look into the highest scores by pushing {@Highscore} <br>
 * And he is also able to quit the complete application by using {@Quit}
 * 
 * <p>
 * @author Lea Baumgärtner
 * @version 0.1 
 */


public class OpeningScreen extends Application{
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root = new VBox();
		
		/**
		 * Title for the whole screen
		 */
		Label labelTitle = new Label("Battleship");
		// Here we could add an image with a battleship on it.
		
		// Image image = new Image(getClass().getResourceAsStream("Battleship_Opening.jpg"));
		//Label label3 = new Label("Battleship", new ImageView(image));
		
		/**
		 * Button for starting a new Game
		 */
		Button newGame = new Button("New Game");

		// This should be the EventHandling for opening the NewGameScreen.java
		
		newGame.setOnAction(
				event -> {
					NewGameScreen ngs = new NewGameScreen();
					VBox NewGame = ngs.getScreen();
					Scene scene2 = new Scene(NewGame, 300, 400);
					primaryStage.setScene(scene2);
							
				});
		
		// Same shit for the others.
		
		/**
		 * Button for continue an old game
		 */
		Button continueGame = new Button("Continue");
			
		// This should be the EventHandling for opening the old game
		// But this won't be important for now!
		
				continueGame.setOnAction(
						event -> continueGame.setText("You Mongo!"));
		
		/**
		* Button for opening the highscores
		*/				
		Button highscore = new Button("Highscore");
		// EventHandler for opening the highscore Document
		// But this won't be important for now!
		highscore.setOnAction(
				event -> highscore.setText("Nononono"));
								
		
		/**
		 * Button for ending the whole application
		 */
		Button quit = new Button("Quit");
		
		// EventHandler for ending the complete Application
		quit.setOnAction(
				event -> quit.setText("You may not leave!"));
		
		
		root.getChildren().addAll(labelTitle, newGame, continueGame, highscore, quit);
		
		
		Scene scene = new Scene(root, 300, 400);
		scene.getStylesheets().add("OpeningSceneCSS.css");
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Opening Scene - Battleship");
		primaryStage.show();
		
		
	}
	
	
}
