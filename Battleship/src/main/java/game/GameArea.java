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
import gameElement.Water;
import ships.OneFieldBoat;

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
	boolean isItem = true;
	
	
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

		   int CoordinateY = this.items.length;
		   Random rndY = new Random();
		   int randomValueY = rndY.nextInt(CoordinateY + 1);
		   randomValueY = this.randomValueY;
		   
	    }
	
	
	     void setRandomGameElement() {
		
	      logger.info("The method GameArea.setRandomGameElement has been called!");
	     
		  generateRandomCoordinate();
		
	    }
	
	 /*   void setRandomDolphin() {
	    	
	    	logger.info("The method GameArea.setRandomDolphin has been called!");
	    	
	        while(isItem == true) {
	    		
	    	if(items == Dolphin.getPosition()) {
	    		
	    		isItem = true;
	    		generateRandomCoordinate();
	    		
	      } if(items == OneFieldBoat.getPosition()) {
	    		
	    		generateRandomCoordinate();
	    		isItem = true;
	    		
	      } else if(items == Water.getPosition()) {
	    		
	    		Dolphin dolphin = new Dolphin();
	    		setRandomGameElement();
	    		isItem = false;
	    		
	      } else {
	    	  
	    	    logger.error("Function doesn't work!");
	    	    break;
	    	  
	    	}
	      }
	    }
	    
	    
	    void setRandomIsland() {
	    	
	    	logger.info("The method GameArea.setRandomIsland has been called!");
	    	
	    	while(isItem == true) {
	    		
	    	if(items == Island.getPosition()) {
	    	
	    		generateRandomCoordinate();
	    		isItem = true;
	    		
	      } if(items == OneFieldBoat.getPosition()) {
	    	
	    		generateRandomCoordinate();
	    		isItem = true;
	    		
	      } else if(items == Water.getPosition()) {
	    		
	    		Island island = new Island();
	    		setRandomGameElement();
	    		isItem = false;
	    		
	      } else {
	    	   
	    	  logger.error("Function doesn't work!");
	    	  break;
	    		
	    	}
	      }
	    }
	    
	    void setRandomMine() {
	    
	    	logger.info("The method GameArea.setMine has been called!");
	    	
	    	while(isItem == true) {
	    	
	    	if(items == Mine.getPosition()) {
	    		
	    	    generateRandomCoordinate();
	    	    isItem = true;
	    		
	      } if(items == OneFieldBoat.getPosition()) {
	    		
	    		generateRandomCoordinate();
	    		isItem = true;
	    		
	      } else if(items == Water.getPosition()) {
	    		
	    		Mine mine = new Mine();
	    		setRandomGameElement();
	    		isItem = false;
	    		
	      } else { 
	    	  
	    	  logger.error("Function doesn't work!");
	    	  break;
	    	  
	    	}
	      }
	    }
	    
	    void setRandomLuckyDwarf() {
	    	
	    	logger.info("The method GameArea.setRandomLuckyDwarf has been called!");
	    	
	    	while(isItem == true) {
	    		
	    	if(items == LuckyDwarf.getPosition()) {
	    		
	    		generateRandomCoordinate();
	    		isItem = true;
	    		
	     } if(items == OneFieldBoat.getPosition()) {
	    		
	    		generateRandomCoordinate();
	    		isItem = true;
	    		
	     } else if(items == Water.getPosition()) {
	    		
	    		LuckyDwarf luckydwarf = new LuckyDwarf();
	    		setRandomGameElement();
	    		isItem = false;
	    		
	     } else {
	    	 
	    	    logger.error("Function doesn't work!");
	    	    break;
	    	    
	    	}
	      }
	    } */
	
	    
	    void unhide(int x, int y) {
	    	
	    logger.info("The method GameArea.unhide has been called!");
		
	    }
	
	
  }

