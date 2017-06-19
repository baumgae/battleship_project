package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import game.DifficultyManager;
import game.EDifficulty;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CustomButtonTest extends Application{

private static final Logger logger = LogManager.getLogger(CustomButtonTest.class);
	
	private static Stage primaryStage;
	
	VBox root;
	VBox root3;
	VBox root2;
	
	 public static Stage getPrimaryStage() {
		 return primaryStage;
	 }
	 
	 @Override
		public void start(Stage primaryStage) throws Exception {
			
			this.primaryStage = primaryStage;
			VBox root = new VBox();
			HBox root2 = new HBox();
			VBox root3 = new VBox();
			
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
			// TJ: Erstmal ein Button-Array machen...

			
			Point difficulty = DifficultyManager.getFieldSize(EDifficulty.EASY);
			CustomButton buttons [] = new CustomButton[difficulty.x];
			
			for (int i = 0; i < buttons.length; i++) {
				Point p = new Point(3,2);
				// TJ: ... dann instanzieren
				buttons[i]= new CustomButton(1, p);
				// TJ: ... dann sagen, was passieren soll, wenn geklickt wurde
				buttons[i].setOnAction(event ->{
					CustomButton clickedButton = (CustomButton) event.getSource();
					clickedButton.unhide();
				});
				// TJ: ... abschließend der VBox hinzufügen.
				root2.getChildren().add(buttons[i]);
				}
			
	 		Point difficulty2 = DifficultyManager.getFieldSize(EDifficulty.EASY);
	 		CustomButton buttons2 [] = new CustomButton[difficulty2.y];
		
		for (int i = 0; i < buttons2.length; i++) {
			Point p = new Point(3,2);
			// TJ: ... dann instanzieren
			buttons2[i]= new CustomButton(1, p);
			// TJ: ... dann sagen, was passieren soll, wenn geklickt wurde
			buttons2[i].setOnAction(event ->{
				CustomButton clickedButton = (CustomButton) event.getSource();
				clickedButton.unhide();
			});
			// TJ: ... abschließend der VBox hinzufügen.
			root3.getChildren().add(buttons2[i]);

		}
		
		root.getChildren().addAll(labelTitle, root2, root3);
		
	 	
			
			
			Scene scene = new Scene(root, 300, 400);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Opening Scene - Battleship");
			primaryStage.show();

	 }
		

	 
	 public static void main(String[] args) {
		launch(args);
	}
	
	}

