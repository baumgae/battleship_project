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

	// Nachdem dieser Constructor aufgerufen und der Schwierigkeitsgrad 
	// übergebem wurde, werden die x und y max Koordinaten von der difficulty geholt
	// und dem Feld übergeben, wodurch es sich aufbaut.
	
	public GameArea(EDifficulty difficulty){
			
		    logger.info("The constructor GameArea has been called!");
		    
	    	java.awt.Point point = DifficultyManager.getFieldSize(difficulty);
		
		    this.items =  new Item[point.x][point.y];
		
		    this.difficulty = difficulty;
		    
	    }
	
   // Hier werden die random Koordinaten für die ZufallsItems generiert.
	
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
	  
	    
	    // Hier wird immer die Anzahl an Elementen eines speziellen Elements übergeben!
	    // Beispielsweise mithife von 
	    // GameArea.getNumberOfItems(Dolphine.getID(), Difficulty.getNumberOfDolphines(NORMAL));
	    // Damit wird dann Beispielsweise die Anzahl an Delphinen erzeugt. 
	    
	    public void setNumberOfItems(int ID, int NumberOfItems) {
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

        public int getStatusCoordinate (int ID, Point p) throws NoGameElementException { 
	  
	     logger.info("The method ShootingArea.getStatusCoordinate has been called!");
	   
	   /* Frage an TJ: Wie könnten wir diese Methode gestalten? 
	    * Problem: Methoden können nicht static gemacht werden, aufrung der 
	    * abstrakten Klasse, und wir wollen hier ja keine neuen Objekte erzeugen
	    * 
	    */
	   
	   // Wenn ein Kästchen abgeschossen wird, dann soll diese Methode aufgerufen werden.
	   // d.H. wird das versteckte Item aufgedeckt, wird die ID des darunterliegenden 
	   // Elementes dieser Methode übergeben und je nachdem welche Art von Element 
	   // es ist, werden die Unterschiedliche Anzahl an Punkten wieder zurückgegeben 
	   // oder auch nicht.
	   
	   // Diese Punkte wiederum holt sich der Game Manager und übergibt sie dem
	   // jeweiligen Player
	   
	   // Das ist soweit der Plan!
	   
	   
	     if (ID == 0) {
	         Water water = new Water("Toni");
	    	 int points = water.getScore();
	         return points;

       } if (ID == 1) { 
		  
  	     Dolphin dolphin = new Dolphin("Günther");
  	     dolphin.getScore();
	         return 0;
		  
	   } if (ID == 2) { 
		  
		      Island island = new Island("Günther2");
		      island.getScore();
		      return 0;
		  
	   } if (ID == 3) { 
		  
		     LuckyDwarf luckydwarf = new LuckyDwarf("SexyBatman");
		     luckydwarf.getScore();
		     return 0;
		  
	   } if (ID == 4) {
		     
		     Mine mine = new Mine("Olaf");
		     mine.getScore();
		     return 0;
		  
	   } if (ID == 5) { // There is an One Field Boat
		   
		   // We just have an One Field Boat at this moment.
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat("Tobi");
	         onefieldboat.getScore();
	         return 0;
		  
//	   } if (ID == 6) { // There is a Two Field Boat
//		  
//		     //OneFieldBoat onefieldboat = new OneFieldBoat();
//	         //onefieldboat.getScore(); 
//	         return 0;
//		  
//	   } if (ID == 7) { // There is a Three Field Boat
//		  
//		    // OneFieldBoat onefieldboat = new OneFieldBoat();
//	         //onefieldboat.getScore(); 
//	         return 0;
//		  
//	   } if (ID == 8) { // There is a Four Field Boat
//		  
//		     OneFieldBoat onefieldboat = new OneFieldBoat();
//	         onefieldboat.getScore(); 
//	         return 0;
//		  
//	   } if (ID == 9) { // There is a Quadruple
//		  
//		     OneFieldBoat onefieldboat = new OneFieldBoat();
//	         onefieldboat.getScore();
//	         return 0;
		  
	   } else {
		  
		logger.debug("NoGameElementException has been thrown!");
		   
		throw new NoGameElementException();
		  
	   }
		
	
     }
	    
  }

	    
	    	
	
	
