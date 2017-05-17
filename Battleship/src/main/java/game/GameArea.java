package game;

import java.util.Random;

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
 * The method {@link #setRandomCoordinate()} generate random Coordinates for the
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
 * With the method {@link #shoot(int, int)} you can shoot on a Field.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

public class GameArea {
	
	Item items[][];
	EDifficulty difficulty;
	
	public GameArea(EDifficulty difficulty){

	    	java.awt.Point point = DifficultyManager.getFieldSize(difficulty);
		
		    this.items =  new Item[point.x][point.y];
		     // TODO: set Field Size
		
		    this.difficulty = difficulty;
		    this.setRandomGameElement();
	    }
	

	    void setRandomCoordinate() {

		   int CoordinateX = this.items.length;
		   Random rndX = new Random();
		   int randomValueX = rndX.nextInt(CoordinateX + 1);

		   int CoordinateY = this.items[0].length;
		   Random rndY = new Random();
		   int randomValueY = rndY.nextInt(CoordinateY + 1);

	    }
	
	
	    void setRandomGameElement() {
		
//     	  Dolphin.setRandomCoordinates(randomValueX, randomValueY);
//		  Island.setRandomCoordinate(randomValueX, randomValueY);
//		  Mine.setRandomCoordinate(randomValueX, randomValueY);
//		  LuckyDwarf.setRandomCoordinate(randomValueX, randomValueY);

		  this.setRandomCoordinate();
		
	    }
	
	
	    void unhide(int x, int y) {
		
	    }
	
	    void shoot(int x, int y) {
			
     	}
	
  }

