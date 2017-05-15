package battleshipGUI;

import javafx.application.Application;
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

	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root = new VBox();
		
		Label labelTitle = new Label("Battleship");
		// Here we could add an image with a battleship on it.
		
		// Image image = new Image(getClass().getResourceAsStream("Battleship_Opening.jpg"));
		//Label label3 = new Label("Battleship", new ImageView(image));
		
		Button newGame = new Button("New Game");
		Button continueGame = new Button("Continue");
		Button highscore = new Button("Highscore");
		Button quit = new Button("Quit");
		
		
		root.getChildren().addAll(labelTitle, newGame, continueGame, highscore, quit);
		
		
		Scene scene = new Scene(root, 300, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Opening Scene - Battleship");
		primaryStage.show();
		
		
	}
	
	

}
