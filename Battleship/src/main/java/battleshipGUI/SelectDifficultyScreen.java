package battleshipGUI;



import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class SelectDifficultyScreen{
	
	public static int difficultyNumber;
	
	public VBox getScreen() {
		VBox root = new VBox();
		
		
		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Set your difficulty!");
		
		
		Button easy = new Button("Easy");
		Button normal = new Button("Normal");
		Button hard = new Button("Hard");
		Button suicidal = new Button("Suicidal");
		
		easy.setOnAction(
				event -> {
					// Übergebem der Feldgröße und 
					// Übergebem der Anzahl an Items für das nächste Screen!
					int difficultyNumber = 1;
					this.difficultyNumber = difficultyNumber;
					
					SetShipsScreen_P1 nsc = new SetShipsScreen_P1();
					//VBox setShips = nsc.getScreen();
					//Scene scene3 = new Scene(setShips, 300, 400);
					//OpeningScreen.getPrimaryStage().setScene(scene3);
					
				});
		
		normal.setOnAction(
				event -> {
					// Übergebem der Feldgröße und 
					// Übergebem der Anzahl an Items für das nächste Screen!
					
					int difficultyNumber = 2;
					this.difficultyNumber = difficultyNumber;
					
					SetShipsScreen_P1 nsc = new SetShipsScreen_P1();
					//VBox setShips = nsc.getScreen();
					//Scene scene3 = new Scene(setShips, 300, 400);
					//OpeningScreen.getPrimaryStage().setScene(scene3);
					
				});
		
		hard.setOnAction(
				event -> {
					// Übergebem der Feldgröße und 
					// Übergebem der Anzahl an Items für das nächste Screen!
					
					int difficultyNumber = 3;
					this.difficultyNumber = difficultyNumber;
					
					SetShipsScreen_P1 nsc = new SetShipsScreen_P1();
					//VBox setShips = nsc.getScreen();
					//Scene scene3 = new Scene(setShips, 300, 400);
					//OpeningScreen.getPrimaryStage().setScene(scene3);
					
					
					
				});
		
		suicidal.setOnAction(
				event -> {
					
					int difficultyNumber = 4;
					this.difficultyNumber = difficultyNumber;
					// Übergebem der Feldgröße und 
					// Übergebem der Anzahl an Items für das nächste Screen!
					
					SetShipsScreen_P1 nsc = new SetShipsScreen_P1();
					//VBox setShips = nsc.getScreen();
					//Scene scene3 = new Scene(setShips, 300, 400);
					//OpeningScreen.getPrimaryStage().setScene(scene3);
					
				});
		
		
		
		root.getChildren().addAll(labelTitle, labelTitle2, 
					easy, normal, hard, suicidal);
		return root;
	}
		
	}
