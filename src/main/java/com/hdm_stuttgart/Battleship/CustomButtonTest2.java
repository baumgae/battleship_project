package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * Hier habe ich mal versucht ein GridPane zu eröffnen und die Buttons zu setzen.
 * 
 * Folgende Vorgehensweise für das Spiel ist im Kopf:
 * 
 * 1. Create GameArea and fill with water
 * 
 * 2. Set Ships on Coordinates, where water and nothing else
 * 
 * 3. Eventually player two too"
 * 
 * 4. Start game, but every Player is only allowed to shot once!
 * 
 * 5. Game should be ended, if one of the player's ships are all destroyed!
 * 
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import game.DifficultyManager;
import game.EDifficulty;
import javafx.scene.control.Label;

import javafx.scene.layout.VBox;

/**
 * CustomButtonTest2
 * <p>
 * This was a class for testing the functions and possibilities of the
 * CustomButton.
 * <p>
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class CustomButtonTest2 extends Application {

	private static final Logger logger = LogManager.getLogger(CustomButtonTest2.class);

	private static Stage primaryStage;

	VBox root;
	VBox root3;
	VBox root2;

	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	private GridPane grid = new GridPane();

	@Override
	public void start(Stage primaryStage) throws Exception {

		this.primaryStage = primaryStage;

		/**
		 * Title for the whole screen
		 */

		Point difficulty = DifficultyManager.getFieldSize(EDifficulty.EASY);

		CustomButton buttons[][] = new CustomButton[difficulty.x][difficulty.y];

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons[i].length; j++) {
				Point p = new Point(i, j);
				buttons[i][j] = new CustomButton(p, 0);

				buttons[i][j].setOnAction(event -> {
					CustomButton clickedButton = (CustomButton) event.getSource();
					clickedButton.unhide();
				});

				grid.add(buttons[i][j], i, j);

			}
		}

		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
