package battleshipGUI;

import com.hdm_stuttgart.Battleship.GameManager;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import gameConfigurations.CreatePlayerException;
import gameConfigurations.PlayerFactory;
import javafx.application.Application;
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
 * The user has different options. He can start a Game as a single player by
 * pushing the button singlePlayer, or with multiple player by pushing
 * multiplayer <br>
 * As soon as he chose a mode, the next screen will appear.
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class SelectPlayerScreen {

	private static final Logger logger = LogManager.getLogger(SelectPlayerScreen.class);

	public VBox getScreen() {
		VBox root = new VBox();

		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Select your Player!");

		Button singlePlayer = new Button("Single Player");
		singlePlayer.setOnAction(event -> {
			logger.info("Single-Player Mode has been choosen!");

			GameManager gameMan = new GameManager();
			gameMan.selectPlayer(1);

			SetNameScreen name = new SetNameScreen();
			VBox setName = name.getScreen();
			Scene scene = new Scene(setName, 300, 400);
			scene.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
			OpeningScreen.getPrimaryStage().setScene(scene);

		});

		Button multiPlayer = new Button("Multi Player");
		multiPlayer.setOnAction(event -> {
			logger.info("Multi-Player Mode has been choosen!");

			GameManager gameMan = new GameManager();
			gameMan.selectPlayer(2);

			SetNameScreen name = new SetNameScreen();
			VBox setName = name.getScreen();
			Scene scene = new Scene(setName, 300, 400);
			scene.getStylesheets().addAll(this.getClass().getResource("OpeningSceneCSS.css").toExternalForm());
			OpeningScreen.getPrimaryStage().setScene(scene);

		});

		root.getChildren().addAll(labelTitle, labelTitle2, singlePlayer, multiPlayer);

		return root;

	}

}