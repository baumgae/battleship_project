package game;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gameConfigurations.Item;
import gameElement.Dolphin;
import gameElement.Island;
import gameElement.LuckyDwarf;
import gameElement.Mine;
import gameElement.Water;

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
		    
	    }
	

	       void generateRandomCoordinate() {
	    	
	       logger.info("The method GameArea.generateRandomCoordinate has been called!");

		   int CoordinateX = this.items.length;
		   Random rndX = new Random();
		   int randomValueX = rndX.nextInt(CoordinateX + 1);
		   this.randomValueX = randomValueX;

		   int CoordinateY = this.items.length;
		   Random rndY = new Random();
		   int randomValueY = rndY.nextInt(CoordinateY + 1);
		   this.randomValueY = randomValueY;
		   
	    }
	    
	    void unhide(int x, int y) {
	    	
	    logger.info("The method GameArea.unhide has been called!");
		
	    }
	    
	    // Hier wird immer die Anzahl an Elementen eines speziellen Elements übergeben!
	    // Beispielsweise mithife von 
	    // GameArea.getNumberOfItems(Dolphine.getID(), Difficulty.getNumberOfDolphines(NORMAL));
	    // Damit wird dann Beispielsweise die Anzahl an Delphinen erzeugt. 
	    
	    // 
	    public void getNumberOfItems(int ID, int NumberOfItems) {
	    	// Je nachdem welche ID übergeben wird, wird auch das entsprechende Objekt erzeugt
	    	
	       int currentNumberOfItems = 0;
	    	
	    	if (ID == 0) {
	    		while (currentNumberOfItems <= NumberOfItems) {
		    		this.generateRandomCoordinate();
		    		if (items[randomValueX][randomValueY] == null) {
		    			items[randomValueX][randomValueY] = new Water("Water" + currentNumberOfItems);
		    			currentNumberOfItems++;
		    		} else {
		    			logger.info("The method generateWater didn't work!");
		    		}
	    		}
	    	
	    	 if (ID == 1) {
	    		while (currentNumberOfItems <= NumberOfItems) {
		    		this.generateRandomCoordinate();
		    		if (items[randomValueX][randomValueY] == null) {
		    			items[randomValueX][randomValueY] = new Dolphin("Dolphin" + currentNumberOfItems);
		    			currentNumberOfItems++;
		    		}
		    		else {
		    			logger.info("The method generateDolphin didn't work!");
		    		}
	    		}
	    	if (ID == 2)
	    		while (currentNumberOfItems <= NumberOfItems) {
		    		this.generateRandomCoordinate();
		    		if (items[randomValueX][randomValueY] == null) {
		    			items[randomValueX][randomValueY] = new Island("Island" + currentNumberOfItems);
		    			currentNumberOfItems++;
		    		}
		    		else {
		    			logger.info("The method generateIsland didn't work!");
		    		}
	    		}
	    	
	    	if (ID == 3)
	    		while (currentNumberOfItems <= NumberOfItems) {
		    		this.generateRandomCoordinate();
		    		if (items[randomValueX][randomValueY] == null) {
		    			items[randomValueX][randomValueY] = new LuckyDwarf("LuckyDwarf" + currentNumberOfItems);
		    			currentNumberOfItems++;
		    		}
		    		else {
		    			logger.info("The method generateLuckyDwarf didn't work!");
		    		}
	    		}
	    	 
	    	if (ID == 4)
	    		while (currentNumberOfItems <= NumberOfItems) {
		    		this.generateRandomCoordinate();
		    		if (items[randomValueX][randomValueY] == null) {
		    			items[randomValueX][randomValueY] = new Mine("Mine" + currentNumberOfItems);
		    			currentNumberOfItems++;
		    		} else {
		    			logger.info("The method generateMine didn't work!");
		    		}
		    		
//		    if (ID == 5)
//			    while (currentNumberOfItems <= NumberOfItems) {
//				     this.generateRandomCoordinate();
//				    if (items[randomValueX][randomValueY] == null) {
//				    	items[randomValueX][randomValueY] = new OneFieldBoat("OneFieldBoat" + currentNumberOfItems);
//				    	currentNumberOfItems++;
//				    }
//				         else {
//				    			logger.info("The method generateOneFieldBoat didn't work!");
//				    		}
//			    		}
		    		
	    		}
	    	
	          }
	    	}
	     }
	    
     }

	    
//	    Erstmal aufbewahren
//	    		public void generateDolphins(int numberOfDolphines){
//	    	int currentNumberOfDolphines = 0;
//	    	
//	    	while (currentNumberOfDolphines >= numberOfDolphines) {
//	    		this.generateRandomCoordinate();
//	    		if (items[randomValueX][randomValueY] == null) {
//	    			items[randomValueX][randomValueY] = new Dolphin("Dolphin" + currentNumberOfDolphines);
//	    			currentNumberOfDolphines++;
//	    		}
//	    		else {
//	    			logger.info("The method generateDolphine didn`t work!");
//	    		}
//	    		
//	    		
//	    		
//	    	}
//	    	
//	    }
	    	
	    	
	
	
