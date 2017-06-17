package com.hdm_stuttgart.Battleship;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CustomButtonTest extends Application{

private static final Logger logger = LogManager.getLogger(CustomButtonTest.class);
	
	private static Stage primaryStage;
	
	VBox root;
	
	 public static Stage getPrimaryStage() {
		 return primaryStage;
	 }
	 
	 @Override
		public void start(Stage primaryStage) throws Exception {
			
			this.primaryStage = primaryStage;
			VBox root = new VBox();
			
			/**
			 * Title for the whole screen
			 */
			Label labelTitle = new Label("Battleship");
			root.getChildren().add(labelTitle);
			// Here we could add an image with a battleship on it.
			
			// Image image = new Image(getClass().getResourceAsStream("Battleship_Opening.jpg"));
			//Label label3 = new Label("Battleship", new ImageView(image));
			
			/**
			 * Button for starting a new Game
			 */
			// TJ: Erstmal ein Button-Array machen...
			CustomButton buttons [] = new CustomButton[5];
			
			for (int i = 0; i < buttons.length; i++) {
				// TJ: ... dann instanzieren
				buttons[i] = new CustomButton(1, true);
				// TJ: ... dann sagen, was passieren soll, wenn geklickt wurde
				buttons[i].setOnAction(event ->{
					CustomButton clickedButton = (CustomButton) event.getSource();
					clickedButton.unhide();
				});
				// TJ: ... abschließend der VBox hinzufügen.
				root.getChildren().add(buttons[i]);
			}
			
			
			Scene scene = new Scene(root, 300, 400);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Opening Scene - Battleship");
			primaryStage.show();
			
			
		}
	 
	 public static void main(String[] args) {
		launch(args);
	}
	
	}

