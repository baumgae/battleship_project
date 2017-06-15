package com.hdm_stuttgart.Battleship;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
			// Here we could add an image with a battleship on it.
			
			// Image image = new Image(getClass().getResourceAsStream("Battleship_Opening.jpg"));
			//Label label3 = new Label("Battleship", new ImageView(image));
			
			/**
			 * Button for starting a new Game
			 */
			CustomButton button = new CustomButton(1, false);
			
			
			
			root.getChildren().addAll(labelTitle, button);
			this.root = root;
			
			Scene scene = new Scene(root, 300, 400);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Opening Scene - Battleship");
			primaryStage.show();
			
			
		}
	
	}

