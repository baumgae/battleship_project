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

/**
 * CustomButtonTest
 * <p>
 * This was a class for testing the functions and possibilities of the CustomButton. <p>
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */

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
			
			
			Point difficulty = DifficultyManager.getFieldSize(EDifficulty.EASY);
			CustomButton buttons [] = new CustomButton[difficulty.x];
			
			for (int i = 0; i < buttons.length; i++) {
				Point p = new Point(0,0);
				
				buttons[i]= new CustomButton(p, 0);
				
				buttons[i].setOnAction(event ->{
					CustomButton clickedButton = (CustomButton) event.getSource();
					clickedButton.unhide();
				});
				
				root2.getChildren().add(buttons[i]);
				}
			
	 		Point difficulty2 = DifficultyManager.getFieldSize(EDifficulty.EASY);
	 		CustomButton buttons2 [] = new CustomButton[difficulty2.y];
		
		for (int i = 0; i < buttons2.length; i++) {
			Point p = new Point(0,0);
			
			buttons2[i]= new CustomButton(p, 0);
			
			buttons2[i].setOnAction(event ->{
				CustomButton clickedButton = (CustomButton) event.getSource();
				clickedButton.unhide();
			});
			
			root3.getChildren().add(buttons2[i]);

		}
		
		root.getChildren().addAll(labelTitle, root2, root3);
		
			
			Scene scene = new Scene(root, 300, 400);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Opening Scene - Battleship");
			primaryStage.show();

	 }
		
	 public static void main(String[] args) {
		try{
		 launch(args);
		} catch (Exception e) {
			logger.error("Blablub", e);
		}
	}
	
	}

