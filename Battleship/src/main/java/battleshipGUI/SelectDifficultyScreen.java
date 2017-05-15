package battleshipGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SelectDifficultyScreen extends Application{
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
VBox root = new VBox();
		
		
		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Set your difficulty!");
		
		
		Button easy = new Button("Easy");
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
