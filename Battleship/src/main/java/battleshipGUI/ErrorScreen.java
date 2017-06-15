package battleshipGUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Error Screen
 * <p>
 * This is the GUI, if a scene is not available or an error occures.
 * <p>
 * 
 * The only option the user has over here is to go back.
 * 
 * <p>
 * @author Lea Baumgärtner
 * @version 0.1 
 */
public class ErrorScreen {
	

	public VBox getScreen() {
		VBox root = new VBox();

		Label labelTitle = new Label("ERROR");
		Label labelTitle2 = new Label("Hahahahaha...");
		Label labelTitle3 = new Label("You have to buy the DLC for 99 $!");
		Label labelTitle4 = new Label("(We've learned from EA :D)");
		
		Button goBack = new Button("Back");
		
		// EventHandler for ending the complete Application
		goBack.setOnAction(
				event -> {
					// logger.info("The goBack Button has been pushed!");
					OpeningScreen ngs = new OpeningScreen();
					VBox opening = ngs.getScreen();
					Scene scene = new Scene(opening, 300, 400);
					OpeningScreen.getPrimaryStage().setScene(scene);
							
				});
		
		root.getChildren().addAll(labelTitle, labelTitle2, labelTitle3, labelTitle4, goBack);

		return root;
		
}
}