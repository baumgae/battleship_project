package com.hdm_stuttgart.Battleship;

import java.awt.Point;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
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

public class CustomButtonTest2 extends Application{
	
	private GridPane gpnael = new GridPane();
	private static Stage primaryStage;
	int i;
	
	@Override
    public void start(Stage primarystage) throws Exception {
        Pane root = new Pane();
        i = 0;
        while(i<3){
            addButton();
        }
        root.getChildren().add(gpnael);
        Scene scene = new Scene(root);
        primarystage.setScene(scene);
        primarystage.show();
    }
	
	
    private void addButton() {
        i++;
       // Array aus buttons - doesn't work"
        CustomButton custom[] = new CustomButton[5];
        
       custom[i].setOnAction(event ->{
			CustomButton clickedButton = (CustomButton) event.getSource();
			clickedButton.unhide(3);
		});
        
        // gpnael.add(custom, i, i);
        gpnael.getChildren().add(custom[i]);
        
    }
    public static void main(String[] args) {
        launch(args);
    }
	
}

