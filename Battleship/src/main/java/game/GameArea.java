package game;
import java.awt.Point;
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
 * Actions on the Field. Also it managing the Status of the Field, so the
 * Player can see where he has shoot at and which Item is behind the
 * Field.
 * 
 *<p> First the Game Area will be created with the Constructor 
 * {@link #GameArea(EDifficulty)}. Depending on which Difficulty the Player has chosen,
 * the Field has a different Size.
 * 
 * <p>
 * The method {@link #generateRandomCoordinate()} generate random Coordinates for the
 * Game Elements which the Player is not allowed to set.
 * 
 * <p>
 * The method {@link #setNumberOfItems(int, int)} gets the random Coordinates from 
 * {@link #setRandomCoordinate()} and creates the Game Elements. Depending on which
 * Difficulty the Player has chosen, there is different Number of Game Elements.
 * The ID is used to decide which Game Element will be created. For example in 
 * Difficulty Easy there are three Objects of ID = 1 available, so the method knows 
 * there will be three Dolphins created.
 * 
 * <p> 
 * In the method {@link #setShipPosition(Item, int, int)} the Player is allowed to 
 * set his Number of Ships.
 * 
 * <p> 
 * The method {@link #getShipPosition()} shows the Player on which Coordinate his 
 * Ships are.
 * 
 * <p> 
 * With the method {@link #shootOnCoordinate(Point)} the Player is allowed to
 * shoot on Coordinates. The Status of each Coordinate stands on 0 until the Player
 * shoot at a Coordinate, then it changes to 1.
 * If the Player has already shot on this Coordinate, this method
 * will throw an Exception, because you are only allowed to shot at a Coordinate
 * for one Time. 
 * 
 * <p>  
 * If a Player shoots at a Coordinate the method {@link #getCoordinateLayerstatus(Point)} 
 * will check the ID of the Object which is behind the Coordinate. After the method 
 * finds out which Element is on the Coordinate, it return the Number of Points 
 * the Player will get. 
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

public class GameArea {
	
 	private static final Logger logger = LogManager.getLogger(GameArea.class);
	
	Item[][] items;
	EDifficulty difficulty;
	Point p;
	int randomValueX;
	int randomValueY;
	int Layerstatus = 0; // the field hasn't been shot
	int FieldStatus;
	int x;
	int y;
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
	  
	    public void setNumberOfItems(int ID, int NumberOfItems) {
	    	
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
	    	}
	    	
	    	if (ID == 1) {
	    	 while (currentNumberOfItems <= NumberOfItems) {
		    	   this.generateRandomCoordinate();
		    	 if (items[randomValueX][randomValueY] == null) {
		    		 items[randomValueX][randomValueY] = new Dolphin("Dolphin" + currentNumberOfItems);
		    			currentNumberOfItems++;
		    			
		    	} else {
		    		logger.info("The method generateDolphin didn't work!");
		    		
		    	}
	    	  }
	        }
	    		
	    	if (ID == 2) { 
	    	 while (currentNumberOfItems <= NumberOfItems) {
		    	   this.generateRandomCoordinate();
		    	 if (items[randomValueX][randomValueY] == null) {
		    		 items[randomValueX][randomValueY] = new Island("Island" + currentNumberOfItems);
		    			currentNumberOfItems++;
		    		
		    	} else {
		    		logger.info("The method generateIsland didn't work!");
		    			
		    	 }
	    	   }	
	    	 }
	    	
	    	 if (ID == 3) {
	    	  while (currentNumberOfItems <= NumberOfItems) {
		    	    this.generateRandomCoordinate();
		    	  if (items[randomValueX][randomValueY] == null) {
		    		  items[randomValueX][randomValueY] = new LuckyDwarf("LuckyDwarf" + currentNumberOfItems);
		    			currentNumberOfItems++;
		    			
		       } else {
		    		logger.info("The method generateLuckyDwarf didn't work!");
		    		
		       }
	    	  }	
	    	}
	    	 
	    	 if (ID == 4) {
	    	  while (currentNumberOfItems <= NumberOfItems) {
		    		this.generateRandomCoordinate();
		    	  if (items[randomValueX][randomValueY] == null) {
		    		  items[randomValueX][randomValueY] = new Mine("Mine" + currentNumberOfItems);
		    			currentNumberOfItems++;
		    			
		      } else {
		    		logger.info("The method generateMine didn't work!");
		    		
		    	 }	
	    		}
	           }
	    	  }
	 
		// Damit werden die Schiffe gesetzt;
		public void setShipPosition (Item items, int x, int y) {
		    
			logger.info("The method ShipArea.setShipPosition has been called!"); 
			x = this.x;
			y = this.y;
		    items = this.items[x][y];
		
		}
		
		public Item getShipPosition () {
			
			logger.info("The method ShipArea.getShipPosition has been called!"); 
			return items[x][y];
		
		}
			
	    
        void shootOnCoordinate (Point p) throws Exception {
	   		
	   		 this.p = p;
	         logger.info("The method ShootingArea.shootOnCoordinate has been called!"); 
	   
	         if (Layerstatus == 1) {
	        	 throw new AlreadyShotException();
	        	 
	       } else {
	        	 logger.info("You are not allowed to shoot again over here!");
	             Layerstatus = 1; 
	         
	       }
        }
 
         int getCoordinateLayerstatus(Point p) {
	       
        	 p = this.p;
	         logger.info("The method ShootingArea.getCoordinateLayer1Status has been called!");
	         return Layerstatus;
	   
        }
         
       // Wenn ein Kästchen abgeschossen wird, dann soll diese Methode aufgerufen werden.
  	   // d.H. wird das versteckte Item aufgedeckt, wird die ID des darunterliegenden 
  	   // Elementes dieser Methode übergeben und je nachdem welche Art von Element 
  	   // es ist, werden die Unterschiedliche Anzahl an Punkten wieder zurückgegeben 
  	   // oder auch nicht.
  	   // Diese Punkte wiederum holt sich der Game Manager und übergibt sie dem
  	   // jeweiligen Player
  	   // Das ist soweit der Plan!

         public int getStatusCoordinate (int ID, Point p) throws NoGameElementException { 
	  
	         logger.info("The method ShootingArea.getStatusCoordinate has been called!");  
	         Item currentItem = items[p.x][p.y];
	   
	         if (currentItem.getID() == 0) { //There is Water.
	    	     int points = currentItem.getScore();
	             return points;

           } if (currentItem.getID() == 1) { //There is a Dolphin.
  	             int points = currentItem.getScore();
	             return points;
		  
	       } if (currentItem.getID() == 2) { //There is an Island.
		         int points = currentItem.getScore();
		         return points;
		  
	       } if (currentItem.getID() == 3) { //There is a Mine.
		         int points = currentItem.getScore();
		         return points;
		  
	       } if (currentItem.getID() == 4) { //There is a LuckyDwarf.
		         int points = currentItem.getScore();
		         return points;
		  
	       } if (currentItem.getID() == 5) { // There is an One Field Boat
		    // We just have an One Field Boat at this moment.
	             int points = currentItem.getScore();
	             return points;
		  
	      /* } if (currentItem.getID() == 6) { // There is a Two Field Boat
	             int points = currentItem.getScore(); 
	             return points;
		  
	         } if (currentItem.getID() == 7) { // There is a Three Field Boat
	             int points = currentItem.getScore(); 
	             return points;
		  
	         } if (currentItem.getID() == 8) { // There is a Four Field Boat
	             int points = currentItem.getScore(); 
	             return points;
		  
	         } if (currentItem.getID() == 9) { // There is a Quadruple
	             int points = currentItem.getScore();
	             return points; */
		  
	         } else {
		  
		         logger.debug("NoGameElementException has been thrown!");
		         throw new NoGameElementException();
		  
	         }
           } 
         }