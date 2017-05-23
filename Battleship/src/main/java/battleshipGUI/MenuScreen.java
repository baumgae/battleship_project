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

public class MenuScreen {
	
	public VBox getScreen() {
		VBox root = new VBox();

		Label labelTitle = new Label("Menu");
		Label labelTitle2 = new Label("Stopped Game!");

		Button newGame = new Button("New Game");
		newGame.setOnAction(
				event -> {
					NewGameScreen ngs = new NewGameScreen();
					VBox NewGame = ngs.getScreen();
					Scene scene2 = new Scene(NewGame, 300, 400);
					
					// OpeningScreen.launch(); = primaryStage.setScene(scene2);
							
				});
				
		Button quit = new Button("Quit");
		
		Button continueGame = new Button("Continue Game");
		

		root.getChildren().addAll(labelTitle, labelTitle2, newGame, quit, continueGame);

		return root;

	}
	
}
