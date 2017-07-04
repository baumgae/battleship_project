package battleshipGUI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hdm_stuttgart.Battleship.GameManager;
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
 * This is the GUI, if a user starts the game / application. Then am opening
 * Screen with choices will appear.
 * <p>
 * 
 * The user has different options. He can start a new Game by pushing the button
 * {@New Game}.<br>
 * DOESN'T WORK: He can continue an "old" game by pushing {@Continue}<br>
 * He can take a look into the highest scores by pushing {@Highscore} <br>
 * DOESN'T WORK: And he is also able to quit the complete application by using
 * {@Quit}
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class OpeningScreen extends Application {

	private static final Logger logger = LogManager.getLogger(OpeningScreen.class);

	private static Stage primaryStage;

	VBox root;

	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		try {
			launch(args);
		} catch (Exception e) {
			logger.error("Something went wrong...", e);
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		OpeningScreen.primaryStage = primaryStage;

		primaryStage.setOnCloseRequest(event -> {

			PrintItemThread thread = GameManager.getInstance().getThreadPrintItems();
			if (thread != null) {
				thread.shutdown();
			}

		});
		this.primaryStage = primaryStage;
		VBox root = new VBox();

		Label labelTitle = new Label("Battleship");
		labelTitle.setId("label");
		Button newGame = new Button("New Game");

		newGame.setOnAction(event -> {
			logger.info("The newGame Button has been pushed!");
			SelectPlayerScreen ngs = new SelectPlayerScreen();
			VBox NewGame = ngs.getScreen();
			Scene scene2 = new Scene(NewGame, 300, 400);
			scene2.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
			primaryStage.setScene(scene2);

		});

		Button continueGame = new Button("Continue");

		continueGame.setOnAction(event -> {
			logger.info("The continue Button has been pushed!");
			ErrorScreen ngs = new ErrorScreen();
			VBox errorScreen = ngs.getScreen();
			Scene scene3 = new Scene(errorScreen, 300, 400);
			scene3.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
			primaryStage.setScene(scene3);

		});

		Button highscore = new Button("Highscore");

		highscore.setOnAction(event -> {
			logger.info("The highscore Button has been pushed!");
			ErrorScreen ngs = new ErrorScreen();
			VBox errorScreen = ngs.getScreen();
			Scene scene4 = new Scene(errorScreen, 300, 400);
			scene4.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
			primaryStage.setScene(scene4);

		});

		Button quit = new Button("Quit");

		quit.setOnAction(event -> {
			logger.info("The quit Button has been pushed!");
			ErrorScreen ngs = new ErrorScreen();
			VBox errorScreen = ngs.getScreen();
			Scene scene5 = new Scene(errorScreen, 300, 400);
			scene5.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
			primaryStage.setScene(scene5);

		});

		root.getChildren().addAll(labelTitle, newGame, continueGame, highscore, quit);
		root.setId("pane");
		Scene scene = new Scene(root, 550, 450);
		scene.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.setTitle("Opening Scene - Battleship");
		primaryStage.show();

	}

	public VBox getScreen() {
		return root;
	}

}
