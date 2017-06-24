

package battleshipGUI;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hdm_stuttgart.Battleship.CustomButton;
import com.hdm_stuttgart.Battleship.GameManager;

import game.DifficultyManager;
import game.EDifficulty;
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
 * @author Lea Baumgärtner
 * @version 0.1
 */


public class SetShipScreenP2 {

	private static final Logger logger = LogManager.getLogger(SetShipScreenP2.class);

	VBox root = new VBox();
	private GridPane grid = new GridPane();
	Label labelHeader = new Label("Set your Ships");
	int i = 0;
	

	public VBox getScreen() {

				Button startGame = new Button("Start Game");
				startGame.setOnAction(event -> {

					GameAreaScreen nsc = new GameAreaScreen();
					VBox GameAreaScreen = nsc.getScreen();
					Scene scene = new Scene(GameAreaScreen, 300, 400);
					OpeningScreen.getPrimaryStage().setScene(scene);

				});
				
				Point difficulty = DifficultyManager.getFieldSize(EDifficulty.EASY);
				CustomButton buttons[][] = new CustomButton[difficulty.x][difficulty.y];

					for (int i = 0; i < buttons.length; i++) {
						
						for (int j = 0; j < buttons[i].length; j++) {
							Point p = new Point(i, j);
							buttons[i][j] = new CustomButton(p, 0);

							buttons[i][j].setOnAction(event-> {
								
								CustomButton clickedButton = (CustomButton) event.getSource();
								clickedButton.unhide();
							});

							grid.add(buttons[i][j], i, j);

						}
					}

				root.getChildren().addAll(startGame, grid);

				return root;

			}
}

			

		