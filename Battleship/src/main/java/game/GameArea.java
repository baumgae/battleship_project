package game;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gameConfigurations.HumanPlayer;
import gameConfigurations.Item;
import gameElement.Dolphin;
import gameElement.Island;
import gameElement.LuckyDwarf;
import gameElement.Mine;

/**
 * The Class GameArea is managing the Creation of the Game Area and handle the
 * Actions on the Field.
 * 
 * <p>
 * This class is managing the Creation of the Game Area and handle the Actions on
 * the Field. First the Game Area will be created with the Constructor 
 * {@link #GameArea(EDifficulty)}.
 * 
 * <p>
 * The method {@link #generateRandomCoordinate()} generate random Coordinates for the
 * Game Elements which the Player is not allowed to set.
 * 
 * <p>
 * The method {@link #setRandomGameElement()} gets the random Coordinates from 
 * {@link #setRandomCoordinate()} and set the Elements on the Field.
 * 
 * <p>  
 * The method {@link #unhide(int, int)} discover the Field to see which Game Element 
 * is behind this.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

public class GameArea {
	
	private static final Logger logger = LogManager.getLogger(GameArea.class);
	
	Item items[][];
	EDifficulty difficulty;
	int randomValueX;
	int randomValueY;
	
	
	public GameArea(EDifficulty difficulty){
			
		    logger.info("The constructor GameArea has been called!");
		    
	    	java.awt.Point point = DifficultyManager.getFieldSize(difficulty);
		
		    this.items =  new Item[point.x][point.y];
		
		    this.difficulty = difficulty;
		    this.setRandomGameElement();
	    }
	

	    void generateRandomCoordinate() {
	    	
	       logger.info("The method GameArea.generateRandomCoordinate has been called!");

		   int CoordinateX = this.items.length;
		   Random rndX = new Random();
		   int randomValueX = rndX.nextInt(CoordinateX + 1);
		   randomValueX = this.randomValueX;

		   int CoordinateY = this.items[0].length;
		   Random rndY = new Random();
		   int randomValueY = rndY.nextInt(CoordinateY + 1);
		   randomValueY = this.randomValueY;
		   
	    }
	
	
	    void setRandomGameElement() {
		
	      logger.info("The method GameArea.setRandomGameElement has been called!");
	      
//     	  Dolphin.generateRandomCoordinates(randomValueX, randomValueY);
//		  Island.generateRandomCoordinate(randomValueX, randomValueY);
//	      Mine.generateRandomCoordinate(randomValueX, randomValueY);
//		  LuckyDwarf.generateRandomCoordinate(randomValueX, randomValueY);
	      
	      //How could this work?

		  this.generateRandomCoordinate();
		
	    }
	
	
	    void unhide(int x, int y) {
	    	
	    logger.info("The method GameArea.unhide has been called!");
		
	    }
	
	
  }

