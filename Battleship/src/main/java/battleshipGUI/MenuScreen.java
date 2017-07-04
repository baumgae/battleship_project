package battleshipGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Menu
 * <p>
 * This is the GUI, if the user lost the current game.
 * <p>
 * After the game has ended, the user gets one of the possible screens. If he
 * looses, he will get this "You Loose" Screen. <br>
 * If he wins, he will get the "You win" Screen <br>
 * Over here the user has different options. He can start a new Game by pushing
 * the button {@New Game}.<br>
 * Or he is also able to quit the current screen by using {@Quit}
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class MenuScreen {

	public VBox getScreen() {
		VBox root = new VBox();

		Label labelTitle = new Label("Menu");
		Label labelTitle2 = new Label("Stopped Game!");

		Button newGame = new Button("New Game");
		newGame.setOnAction(event -> {
			SelectPlayerScreen ngs = new SelectPlayerScreen();
			VBox NewGame = ngs.getScreen();
			Scene scene2 = new Scene(NewGame, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene2);

		});

		Button quit = new Button("Quit");
		quit.setOnAction(event -> {
			ErrorScreen ngs = new ErrorScreen();
			VBox errorScreen = ngs.getScreen();
			Scene scene3 = new Scene(errorScreen, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene3);
		});

		Button continueGame = new Button("Continue Game");
		continueGame.setOnAction(event -> {
			ErrorScreen ngs = new ErrorScreen();
			VBox errorScreen = ngs.getScreen();
			Scene scene3 = new Scene(errorScreen, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene3);
		});

		root.getChildren().addAll(labelTitle, labelTitle2, newGame, quit, continueGame);

		return root;

	}

}
