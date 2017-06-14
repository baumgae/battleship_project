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
* @version 0.1
*/
public class SetNameScreen {
	
	private static final Logger logger = LogManager.getLogger(NewGameScreen.class);
	
	VBox root = new VBox();
	
	// Problem in the if-cases: He proobably doesen't get
	// the numner of playerNumber, because of call by value or something.
	

		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Set your Name!");
		Label labelTitle3 = new Label("Push the enter key to confirm!");
		
		public VBox getScreen() {
			
		if (GameManager.playerNumber == 1) {
			
		TextField tf = new TextField("Enter your Name"); 
		// Ich möchte, das was der User hier eingibt, in einer
		// Variable speichern können - passt das so?
		
		
		tf.setPromptText("Please enter your Name!");
		tf.setOnAction(event -> {
			String name = tf.getText();
			logger.info("Name of the player has been entered!");
			
			SelectDifficultyScreen nsc = new SelectDifficultyScreen();
			VBox setDifficulty = nsc.getScreen();
			Scene scene3 = new Scene(setDifficulty, 300, 400);
			OpeningScreen.getPrimaryStage().setScene(scene3);
		});
		
		root.getChildren().addAll(labelTitle, labelTitle2, labelTitle3, tf);
		return root;
		
		}
		else if (GameManager.playerNumber == 2) {
			TextField tf1 = new TextField("Player One - Enter your Name"); 
			// Ich möchte, das was der User hier eingibt, in einer
			// Variable speichern können - passt das so?
			
			
			tf1.setPromptText("Name - PlayerOne");
			tf1.setOnAction(event -> {
				logger.info("Name of the playerOne has been entered!");
				String nameOne = tf1.getText();
				SelectDifficultyScreen nsc = new SelectDifficultyScreen();
				VBox setDifficulty = nsc.getScreen();
				Scene scene3 = new Scene(setDifficulty, 300, 400);
				OpeningScreen.getPrimaryStage().setScene(scene3);
			});
			
			TextField tf2 = new TextField("Player Two - Enter your Name!"); 
			// Ich möchte, das was der User hier eingibt, in einer
			// Variable speichern können - passt das so?
			
			
			tf2.setPromptText("Name - PlayerTwo");
			tf2.setOnAction(event -> {
				logger.info("Name of the playerTwo has been entered!");
				String nameTwo = tf2.getText();
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
