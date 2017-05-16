package battleshipGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * SetShips Screen 
 * <p>
 * This is the GUI, if a user starts a new game.
 * After he has chosen the mode as well as the difficulty, he'll get a 
 * accordingly game area where he is able to set his different ships
 * on special coordinates.
 * <p>
 * 
 * First, the user has to set his name.
 * Below he can see the different ships which are offered to him.
 * Trough clicking on a ship and after that directly
 * on a coordinate, he will be able to set the ships.
 * Through clicking on a ship two times, the user is able to change 
 * the direction of a ship.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.1 
 */

public class SetShipsScreen extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root1 = new VBox();
		
		Label labelUeberschrift = new Label("Set your Ships");
		
		Button startGame = new Button("Start Game");
		
		startGame.setOnAction(event -> startGame.setText("Problems?"));
		
		TextField Name = new TextField("Please enter your Name here.");
		
		root1.getChildren().addAll(labelUeberschrift, startGame, Name);
		
		Scene scene1 = new Scene(root1, 300, 400);
		
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Set Ships Scene");
		primaryStage.show();
		
		
		
	}



}
