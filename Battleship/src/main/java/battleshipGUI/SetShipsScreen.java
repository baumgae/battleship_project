package battleshipGUI;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hdm_stuttgart.Battleship.CustomButton;
import com.hdm_stuttgart.Battleship.GameManager;

import game.GameArea;
import gameConfigurations.Item;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * SetShips Screen
 * <p>
 * This is the GUI, if a user starts a new game. After he has chosen the mode as
 * well as the difficulty, he'll get a accordingly game area where he is able to
 * set his different ships on special coordinates.
 * <p>
 * 
 * First, the user has to set his name. Below he can see the different ships
 * which are offered to him. Trough clicking on a ship and after that directly
 * on a coordinate, he will be able to set the ships. Through clicking on a ship
 * two times, the user is able to change the direction of a ship.
 * 
 * <p>
 * 
 * @author Celine Wichmann
 * @version 0.1
 */

// TJ: While Loop doesn't work.
public class SetShipsScreen {

	private static final Logger logger = LogManager.getLogger(SetShipsScreen.class);

	VBox root = new VBox();
	Label labelHeader = new Label("Set your Ships");
	int i = 0;

	VBox getScreen() {

		if (GameManager.playerNumber == 1) {

			Button startGame = new Button("Start Game");
			startGame.setOnAction(event -> {

				GameAreaScreen nsc = new GameAreaScreen();
				VBox GameAreaScreen = nsc.getScreen();
				Scene scene = new Scene(GameAreaScreen, 300, 400);
				OpeningScreen.getPrimaryStage().setScene(scene);

			});

			root.getChildren().addAll(labelHeader, startGame);

			return root;

		}
		if (GameManager.playerNumber == 2) {

			while (i < 2) {

				Button Next = new Button("Next");
				Next.setOnAction(event -> {

					SetShipsScreen nsc = new SetShipsScreen();
					VBox SetShipsScreen = nsc.getScreen();
					Scene scene = new Scene(SetShipsScreen, 300, 400);
					OpeningScreen.getPrimaryStage().setScene(scene);

				});

				root.getChildren().addAll(Next);
				i++;
				
				//return root;

			}

			Button startGame = new Button("Start Game");
			startGame.setOnAction(event -> {

				GameAreaScreen nsc = new GameAreaScreen();
				VBox GameAreaScreen = nsc.getScreen();
				Scene scene = new Scene(GameAreaScreen, 300, 400);
				OpeningScreen.getPrimaryStage().setScene(scene);

			});

			root.getChildren().addAll(startGame);

			return root;

		} else {

			logger.info("No Screen has been called.");

		}

		return root;

	}
	
	public GridPane renderGameArea(){
		GridPane grid = new GridPane();
		GameArea gameArea = GameManager.getInstance().getGameAreaPlayerOne();
		Item items[][] = gameArea.getItems();
		
		for(int x = 0; x < items.length; x++){
			for(int y = 0; y < items[x].length; y++){
				CustomButton b = new CustomButton(new Point(x, y), items[x][y].getID());
				grid.add(b , x, y);
				b.setOnAction(event ->{
					CustomButton clickedButton = (CustomButton) event.getSource();
					clickedButton.unhide();
				});				
			}
		}
		
		return grid;
		
	}

}
