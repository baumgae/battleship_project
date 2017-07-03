
package battleshipGUI;

import java.util.Set;

import com.hdm_stuttgart.Battleship.GameManager;
import com.hdm_stuttgart.Battleship.Highscore;
import com.hdm_stuttgart.Battleship.HighscoreItem;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * EndScreen
 * <p>
 * This is the GUI, when the game ended.
 * <p>
 * After the game has ended, the users recieve this screen,
 * The one who looses, will get the "You Loose" part of the screen. <br>
 * The one who wins, will get the "You win" part of the screen <br>
 * 
 * Over here the user has different options. 
 * He can start a new Game by pushing the button {@Link #newGame}.<br>
 * Or he is also able to quit the current screen by using {@Link #quit}
 * 
 * <p>
 * @author Lea Baumgärtner
 * @version 1.0
 */


public class EndingScreen {
	
	int playerOneScore;
	int playerTwoScore;
	
	int playerOneHits;
	int playerTwoHits;
	
	HBox scores;
	
	
	public VBox getScreen() {
		
		
		VBox root = new VBox();
		
		Highscore highscore = new Highscore();
		highscore.addScore(SetNameScreen.nameOne, GameManager.getInstance().getPlayerOne().getCountedHits());
		highscore.addScore(SetNameScreen.nameTwo, GameManager.getInstance().getPlayerTwo().getCountedHits());
		highscore.sortedScores();
		
		playerOneScore = GameManager.getInstance().getPlayerOne().getCountedPoints();
		playerTwoScore = GameManager.getInstance().getPlayerTwo().getCountedPoints();
		
		playerOneHits = GameManager.getInstance().getPlayerOne().getCountedHits();
		playerTwoHits = GameManager.getInstance().getPlayerTwo().getCountedHits();
		
		
		if (playerOneScore < playerTwoScore) {
			HBox scores = new HBox();
			
			// PlayerOne won & PlayerTwo lost
			VBox leftBox = new VBox();
			Label labelTitle = new Label("---OH-NOOOO---");
			Label labelTitle2 = new Label("---YOU---WIN---");
			
			// Name des Spielers der gewonnen hat. ?
			Label labelTitle3 = new Label (GameManager.getInstance().getPlayerOne().getName());
			//Punkte des Spielers der gewonnen hat. ?
			
			// Cast or convert from int to String?
			Label labelTitle4 = new Label ("Your Score:" + playerOneScore);
			
			// Cast or convert from int to String?
			Label labelTitle5 = new Label ("Your Hits:" + playerOneHits);
			
			leftBox.getChildren().addAll(labelTitle, labelTitle2, labelTitle3, labelTitle4,
											labelTitle5);
			
			VBox rightBox = new VBox();
			Label labelTitle6 = new Label("---CONGRATULATIONS!---");
			Label labelTitle7 = new Label("---YOU---LOSE---");
			
			// Name des Spielers verloren hat. ?
			Label labelTitle8 = new Label (GameManager.getInstance().getPlayerTwo().getName());
			//Punkte des Spielers der gewonnen hat. ?
						
			// Passt des?
			Label labelTitle9 = new Label ("Your Score:" + playerTwoScore);
						
			// Passt des?
			Label labelTitle10 = new Label ("Your Hits:" + playerTwoHits);
						
			rightBox.getChildren().addAll(labelTitle6, labelTitle7, labelTitle8, labelTitle9,
														labelTitle10);
			
			//VBox for Stream
			VBox conclusion = new VBox();
			Label labelTitleStream = new Label("Conclusion: ");
			
			Label labelStream = new Label(highscore.getScore().toString());
			
			conclusion.getChildren().addAll(labelTitleStream, labelStream);
			
			scores.getChildren().addAll(leftBox, rightBox, conclusion);
			
		}
		else if (playerTwoScore > playerOneScore) {
			
			HBox scores = new HBox();
			
			// PlayerTwo won & PlayerOne lost
			VBox leftBox = new VBox();
			Label labelTitle = new Label("---OH-NOOOO---");
			Label labelTitle2 = new Label("---YOU---WIN---");
			
			// Name des Spielers der gewonnen hat. ?
			Label labelTitle3 = new Label (GameManager.getInstance().getPlayerTwo().getName());
			//Punkte des Spielers der gewonnen hat. ?
			
			// Cast or convert from int to String?
			Label labelTitle4 = new Label ("Your Score:" + playerTwoScore);
			
			// Cast or convert from int to String?
			Label labelTitle5 = new Label ("Your Hits:" + playerTwoHits);
			
			leftBox.getChildren().addAll(labelTitle, labelTitle2, labelTitle3, labelTitle4,
											labelTitle5);
			
			VBox rightBox = new VBox();
			Label labelTitle6 = new Label("---CONGRATULATIONS!---");
			Label labelTitle7 = new Label("---YOU---LOSE---");
			
			// Name des Spielers verloren hat. ?
			Label labelTitle8 = new Label (GameManager.getInstance().getPlayerOne().getName());
			//Punkte des Spielers der gewonnen hat. ?
						
			Label labelTitle9 = new Label ("Your Score:" + playerOneScore);
						
			
			Label labelTitle10 = new Label ("Your Hits:" + playerOneHits);
						
			rightBox.getChildren().addAll(labelTitle6, labelTitle7, labelTitle8, labelTitle9,
														labelTitle10);
			
			//VBox for Stream
			VBox conclusion = new VBox();
			Label labelTitleStream = new Label("Conclusion: ");
			
			Label labelStream = new Label(highscore.getScore().toString());
			
			conclusion.getChildren().addAll(labelTitleStream, labelStream);
			
			scores.getChildren().addAll(leftBox, rightBox, conclusion);

			
			this.scores = scores;
			
		}
		else {
			HBox scores = new HBox();
			
			VBox leftBox = new VBox();
			Label labelTitle = new Label("---CONGRATULATIONS!---");
			Label labelTitle1 = new Label("---YOU---LOSE---");
			
			// Name des Spielers verloren hat. ?
			Label labelTitle2 = new Label (GameManager.getInstance().getPlayerOne().getName());
			//Punkte des Spielers der gewonnen hat. ?
						
			// Passt des?
			Label labelTitle3 = new Label ("Your Score:" + playerOneScore);
						
			// Passt des?
			Label labelTitle4 = new Label ("Your Hits:" + playerOneHits);
						
			leftBox.getChildren().addAll(labelTitle, labelTitle1, labelTitle2, labelTitle3,
														labelTitle4);
			
			
			VBox rightBox = new VBox();
			Label labelTitle6 = new Label("---CONGRATULATIONS!---");
			Label labelTitle7 = new Label("---YOU---LOSE---");
			
			// Name des Spielers verloren hat. ?
			Label labelTitle8 = new Label (GameManager.getInstance().getPlayerTwo().getName());
			//Punkte des Spielers der gewonnen hat. ?
						
			// Passt des?
			Label labelTitle9 = new Label ("Your Score:" + playerTwoScore);
						
			// Passt des?
			Label labelTitle10 = new Label ("Your Hits:" + playerTwoHits);
						
			rightBox.getChildren().addAll(labelTitle6, labelTitle7, labelTitle8, labelTitle9,
														labelTitle10);
			
			//VBox for Stream
			VBox conclusion = new VBox();
			Label labelTitleStream = new Label("Conclusion: ");
			
			Label labelStream = new Label(highscore.getScore().toString());
			
			conclusion.getChildren().addAll(labelTitleStream, labelStream);
			
			scores.getChildren().addAll(leftBox, rightBox, conclusion);
			
			this.scores = scores;
			
		}
		
		
		/**
		 * Button for starting a new Game
		 */
		
		Button newGame = new Button("New Game");

		// This should be the EventHandling for opening the NewGameScreen.java
		
		newGame.setOnAction(
				event -> newGame.setText("Clicked!"));
	
		/**
		 * Button for ending the whole the screen and going back to menu
		 */
		Button backToMenu = new Button("Back to menu");
		
		// EventHandler for ending the complete Application
		backToMenu.setOnAction(
				event -> backToMenu.setText("You may not leave!"));
		
		
		root.getChildren().addAll(scores, newGame, backToMenu);
		return root;
	
	}	
	}
	

