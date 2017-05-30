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
 * {@link #setRandomCoordinate()} and ???????
 * 
 * <p> 
 * The method {@link #setRandomDolphin()} creates the Game Element Dolphin and put it
 * random on the Field.
 * 
 * <p> 
 * The method {@link #setRandomIsland()} creates the Game Element Island and put it
 * random on the Field.
 * 
 * <p> 
 * The method {@link #setRandomMine()} creates the Game Element Mine and put it
 * random on the Field.
 * 
 * <p> 
 * The method {@link #setRandomLuckyDwarf()} creates the Game Element LuckyDwarf and put it
 * random on the Field.
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
	
	
	    static void setRandomGameElement() {
		
	      logger.info("The method GameArea.setRandomGameElement has been called!");
	     
		  //this.generateRandomCoordinate();
		
	    }
	
	    void setRandomDolphin() {
	    	
	    	logger.info("The method GameArea.setRandomDolphin has been called!");
	    	
	    	if(randomValueX == 0) { //Platzhalter
	    		
	    		// isShip();
	    		GameArea.setRandomGameElement();
	    		
	    	} else if(randomValueX == 1) {
	    		
	    		//isGameElement();
	    		GameArea.setRandomGameElement();
	    		
	    	} else {
	    		
	    		Dolphin dolphin = new Dolphin();
	    		GameArea.setRandomGameElement();
	    	}
	    }
	    
	    
	    void setRandomIsland() {
	    	
	    	logger.info("The method GameArea.setRandomIsland has been called!");
	    	
	    	if(randomValueX == 0) {
	    		
	    		//isShip();
	    		GameArea.setRandomGameElement();
	    		
	    	} else if(randomValueX == 1) {
	    		
	    		//isGameElement();
	    		GameArea.setRandomGameElement();
	    		
	    	} else {
	    		
	    		Island island = new Island();
	    		GameArea.setRandomGameElement();
	    		
	    	}
	    	
	    }
	    
	    void setRandomMine() {
	    
	    	logger.info("The method GameArea.setMine has been called!");
	    	
	    	if(randomValueX == 0) {
	    		
	    		//isShip();
	    	    GameArea.setRandomGameElement();
	    		
	    	} else if(randomValueX == 1) {
	    		
	    		//isGameElement();
	    		GameArea.setRandomGameElement();
	    		
	    	} else {
	    		
	    		Mine mine = new Mine();
	    		GameArea.setRandomGameElement();
	    		
	    	}
	    	
	    }
	    
	    void setRandomLuckyDwarf() {
	    	
	    	logger.info("The method GameArea.setRandomLuckyDwarf has been called!");
	    	
	    	if(randomValueX == 0) {
	    		
	    		//isShip();
	    		GameArea.setRandomGameElement();
	    		
	    	} else if(randomValueX == 1) {
	    		
	    		//isGameElement();
	    		GameArea.setRandomGameElement();
	    		
	    	} else {
	    		
	    		LuckyDwarf luckydwarf = new LuckyDwarf();
	    		GameArea.setRandomGameElement();
	    		
	    	}
	    	
	    }
	
	    
	    void unhide(int x, int y) {
	    	
	    logger.info("The method GameArea.unhide has been called!");
		
	    }
	
	
  }

