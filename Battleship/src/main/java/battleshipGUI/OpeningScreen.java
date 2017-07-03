package battleshipGUI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hdm_stuttgart.Battleship.PrintItemThread;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
	
	private static final Logger logger = LogManager.getLogger(OpeningScreen.class);
	
	private static Stage primaryStage;
	
	VBox root;
	
	 public static Stage getPrimaryStage() {
		 return primaryStage;
	 }
	 
	 
	@Override
	public void start(Stage primaryStage) throws Exception {
		OpeningScreen.primaryStage = primaryStage;
		
		// Beim Schließen des kompletten Fensters soll auch der Thread gekillt werden.
		primaryStage.setOnCloseRequest(event -> {
			
			
			PrintItemThread thread = GameAreaScreen.getInstance().thread;
			// thread.interrupt();
			
			
			
		});
		//this.primaryStage = primaryStage;
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
					logger.info("The newGame Button has been pushed!");
					SelectPlayerScreen ngs = new SelectPlayerScreen();
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
						event -> {
							logger.info("The continue Button has been pushed!");
							ErrorScreen ngs = new ErrorScreen();
							VBox errorScreen = ngs.getScreen();
							Scene scene3 = new Scene(errorScreen, 300, 400);
							primaryStage.setScene(scene3);
									
						});
		
		/**
		* Button for opening the highscores
		*/				
		Button highscore = new Button("Highscore");
		// EventHandler for opening the highscore Document
		// But this won't be important for now!
		highscore.setOnAction(
				event -> {
					logger.info("The highscore Button has been pushed!");
					ErrorScreen ngs = new ErrorScreen();
					VBox errorScreen = ngs.getScreen();
					Scene scene4 = new Scene(errorScreen, 300, 400);
					primaryStage.setScene(scene4);
							
				});
								
		
		/**
		 * Button for ending the whole application
		 */
		Button quit = new Button("Quit");
		
		// EventHandler for ending the complete Application
		quit.setOnAction(
				event -> {
					logger.info("The quit Button has been pushed!");
					ErrorScreen ngs = new ErrorScreen();
					VBox errorScreen = ngs.getScreen();
					Scene scene5 = new Scene(errorScreen, 300, 400);
					primaryStage.setScene(scene5);
							
				});
		
		// CustomButton button = new CustomButton(1, false);
		
		
		
		root.getChildren().addAll(labelTitle, newGame, continueGame, highscore, quit);
		this.root = root;
		
		Scene scene = new Scene(root, 300, 400);
		// scene.getStylesheets().add("OpeningSceneCSS.css");
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Opening Scene - Battleship");
		primaryStage.show();
		
		
	}
	
	public VBox getScreen() {
		// Wenn ich diese Methode aufrufe, dann gehts nicht.
		
		return root;
	}
	
	
	public static void main(String[] args) {
		try{
		 launch(args);
		} catch (Exception e) {
			logger.error("Something went wrong...", e);
		}
	}
	
}
