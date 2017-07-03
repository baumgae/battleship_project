package battleshipGUI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hdm_stuttgart.Battleship.GameManager;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
/**
* SetNameScreen - Set the names of your player
* <p>
* This is the GUI, if a user choose a special game mode, whether <br>
* SinglePlayer or MultiPlayer, he or they have to enter or set their names.
* <p>
* 
* 
* @author Lea Baumgärtner
* @version 1.0
*/
public class SetNameScreen {
	
	private static final Logger logger = LogManager.getLogger(SelectPlayerScreen.class);
	
	public static String name;
	public static String nameOne;
	public static String nameTwo;
	
	
	VBox root = new VBox();
	

		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Set your Name!");
		Label labelTitle3 = new Label("Push the enter key to confirm!");
		
		/**
		 * 
		 * @return VBox containing the whole SetNameScreen
		 */
		public VBox getScreen() {
			
		// If sinleplayer mode has been chosen
		if (GameManager.playerNumber == 1) {
			
			TextField tf = new TextField("Enter your Name");
		
			tf.setPromptText("Please enter your Name!");
		
			tf.setOnAction(event -> {
				logger.info("Name of the player has been entered!");
			
				String name = tf.getText();
				this.name = name;
			
			
				SelectDifficultyScreen nsc = new SelectDifficultyScreen();
				VBox setDifficulty = nsc.getScreen();
				Scene scene3 = new Scene(setDifficulty, 300, 400);
				OpeningScreen.getPrimaryStage().setScene(scene3);
			
		});
		
		root.getChildren().addAll(labelTitle, labelTitle2, labelTitle3, tf);
		return root;
		
		}
		// if multiplayer mode has been chosen
		else if (GameManager.playerNumber == 2) {
			TextField tf1 = new TextField("Player One - Enter your Name"); 
			tf1.setPromptText("Name - PlayerOne");
			
			tf1.setOnAction(event -> {
				logger.info("Name of the playerOne has been entered!");
				
			});
			
			TextField tf2 = new TextField("Player Two - Enter your Name!");
			
			tf2.setPromptText("Name - PlayerTwo");
			
			tf2.setOnAction(event -> {
				logger.info("Name of the playerTwo has been entered!");
				String nameOne = tf1.getText();
				String nameTwo = tf2.getText();
				this.nameOne = nameOne;
				this.nameTwo = nameTwo;
				
				SelectDifficultyScreen nsc = new SelectDifficultyScreen();
				VBox setDifficulty = nsc.getScreen();
				Scene scene3 = new Scene(setDifficulty, 300, 400);
				OpeningScreen.getPrimaryStage().setScene(scene3);
			});
			
			root.getChildren().addAll(labelTitle, labelTitle2, labelTitle3, tf1, tf2);

			return root;
		}
		else {
			Label labelTitle = new Label("Something went wront!");
			root.getChildren().addAll(labelTitle);
			
			return root;
		}

	}

}
