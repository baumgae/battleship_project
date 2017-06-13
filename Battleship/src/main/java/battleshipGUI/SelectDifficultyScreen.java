package battleshipGUI;

import com.hdm_stuttgart.Battleship.GameManager;

import gameConfigurations.CreatePlayerException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SelectDifficultyScreen extends Application{
	
	// Ich bin mir jetzt nicht mehr sicher, ob ich das hier 
	// überhaupt noch brauche, aber ich gaube nicht.
	public static void main(String[] args) {
		launch(args);

	}
	
	public VBox getScreen() {
		VBox root = new VBox();
		return root;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		
		
		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Set your difficulty!");
		
		
		Button easy = new Button("Easy");
		easy.setOnAction(
				event -> {
					// Übergebem der Feldgröße und 
					// Übergebem der Anzahl an Items für das nächste Screen!
					
					SetShipsScreen_P1 nsc = new SetShipsScreen_P1();
					VBox setShips = nsc.getScreen();
					Scene scene3 = new Scene(setShips, 300, 400);
					OpeningScreen.getPrimaryStage().setScene(scene3);
					
					try {
						GameManager.selectPlayer(2);
						} catch (CreatePlayerException e) {
							// Logger.ERROR("No Player has been created!");
						}
				});
		
		
		Button normal = new Button("Normal");
		Button hard = new Button("Hard");
		Button suicidal = new Button("Suicidal");
		
		
		root.getChildren().addAll(labelTitle, labelTitle2, 
					easy, normal, hard, suicidal);
		
		
		Scene scene = new Scene(root, 300, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("New Game - Battleship");
		primaryStage.show();
		
	
	

		
	}

}
