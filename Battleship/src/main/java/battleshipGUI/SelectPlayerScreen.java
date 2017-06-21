package battleshipGUI;

import com.hdm_stuttgart.Battleship.GameManager;

import gameConfigurations.CreatePlayerException;
import gameConfigurations.PlayerFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * New Game Scene - Select your Player
 * <p>
 * This is the GUI, if a user starts a new game. Over here the user has to chose
 * whether he want to play alone against the artificial Intelligence or against
 * a human player.
 * <p>
 * 
 * The user has different options. He can start a Game as a <br>
 * single player by pushing the button {@Single Player},<br>
 * or with multiple player by pushing {@Multiplayer}<br>
 * As soon as he chose a mode, the next screen will appear.
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 0.1
 */

// Pushing for pulling 

public class SelectPlayerScreen {

	// playerNumber = 1 --> SinglePlayer, also 1 Human and 1 Computer
	// playerNumber = 2 --> MultiPlayer, so 2 Humans
	
	
	private static final Logger logger = LogManager.getLogger(SelectPlayerScreen.class);

	public VBox getScreen() {
		VBox root = new VBox();

		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Select your Player!");

		Button singlePlayer = new Button("Single Player");
		singlePlayer.setOnAction(event -> {
			logger.info("Single-Player Mode has been choosen!");
			// Führ dann zum Screen, wo der SinglePlayer seine Schiffe
			// setzen kann usw.
			// Nachdem er auf Start drückt, werden im hintergrund
			// die Schiffe vom ComputerPlayer gesezt.
			
			// Das war die einzige Lösung, um meine Player zu behalten...
			GameManager gameMan = new GameManager();
			gameMan.selectPlayer(1);

			SetNameScreen name = new SetNameScreen();
			VBox setName = name.getScreen();
			Scene scene = new Scene(setName, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene);
			
			
			

		});

		Button multiPlayer = new Button("Multi Player");
		multiPlayer.setOnAction(event -> {
			logger.info("Multi-Player Mode has been choosen!");
			// Hier sollte dann zu dem Screen gewesechselt werden,
			// auf dem der "nextPlayer" Button ist.
			// Und dann auf dem zweiten SetShipsScreen befindet sich
			// der eigentliche StartButton.
			GameManager gameMan = new GameManager();
			gameMan.selectPlayer(2);
			
			SetNameScreen name = new SetNameScreen();
			VBox setName = name.getScreen();
			Scene scene = new Scene(setName, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene);
			
			
		});

		root.getChildren().addAll(labelTitle, labelTitle2, singlePlayer, multiPlayer);

		return root;

	}

}