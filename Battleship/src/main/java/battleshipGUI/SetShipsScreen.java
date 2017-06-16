package battleshipGUI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hdm_stuttgart.Battleship.GameManager;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


/**
 * SetShips Screen 
 * <p>
 * This is the GUI, if a user starts a new game.
 * After he has chosen the mode as well as the difficulty, he'll get a 
 * accordingly game area where he is able to set his different ships
 * on special coordinates.
 * <p>
 * 
 * First, the user has to set his name.
 * Below he can see the different ships which are offered to him.
 * Trough clicking on a ship and after that directly
 * on a coordinate, he will be able to set the ships.
 * Through clicking on a ship two times, the user is able to change 
 * the direction of a ship.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.1 
 */


// TJ: While Loop doesn't work.
public class SetShipsScreen {
	
	private static final Logger logger = LogManager.getLogger(SetShipsScreen.class);
	
	VBox root = new VBox();
	Label labelHeader = new Label("Set your Ships");
	boolean loopSetShipsScreen = false;

	VBox getScreen() {
		
		if(GameManager.playerNumber == 1) { 
		
		    Button startGame = new Button("Start Game"); 
		    startGame.setOnAction(event -> {
			
			   GameAreaScreen nsc = new GameAreaScreen();
		       VBox GameAreaScreen = nsc.getScreen();
			   Scene scene = new Scene(GameAreaScreen, 300, 400);
			   OpeningScreen.getPrimaryStage().setScene(scene);
			
		});
		    
		    root.getChildren().addAll(labelHeader, startGame);
			
			return root;
		
		} if(GameManager.playerNumber == 2) { // Geht neeeed :(
			
		  if(loopSetShipsScreen == false) {
			  
			  loopSetShipsScreen = true;
			  Button Next = new Button("Next");
			  Next.setOnAction(event -> {
				  
			    SetShipsScreen nsc = new SetShipsScreen();
			    VBox SetShipsScreen = nsc.getScreen();
			    Scene scene = new Scene(SetShipsScreen, 300, 400);
			    OpeningScreen.getPrimaryStage().setScene(scene);
			   
	  });
			  
			  root.getChildren().addAll(labelHeader, Next);
				
				return root;
			  
		  } if(loopSetShipsScreen == true) { 
				  
			 Button startGame = new Button("Start Game");
			 startGame.setOnAction(event -> {
				 
			    GameAreaScreen nsc = new GameAreaScreen();
			    VBox GameAreaScreen = nsc.getScreen();
			    Scene scene = new Scene(GameAreaScreen, 300, 400);
			    OpeningScreen.getPrimaryStage().setScene(scene);
			 
			  });
			 
			 root.getChildren().addAll(labelHeader, startGame);
				
				return root;
			  
		  } else {
			  
			  logger.info("No Screen has been called.");
			  
		  }
			
			
		}
		
		return root;
		
	}


}
