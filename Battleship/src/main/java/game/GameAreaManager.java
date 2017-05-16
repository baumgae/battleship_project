package game;

import gameElement.Dolphin;
import gameElement.Island;
import gameElement.LuckyDwarf;
import gameElement.Mine;
import ships.AShip;
import ships.OneFieldBoat;
import game.ShootingArea;
import game.NoGameElementException;
import gameElement.Water;

/**
 * GameAreaManager for setting the Status of the GameArea at Layer 1 and Layer2
 * 
 * <p>
 * This class is managing the Status of the GameArea at Layer 1 and Layer 2.
 * At Layer 1 you can see whether a Field has been already shot or not.
 * As long as a Field is not shot the ID of this Field stands on 0.
 * If a field is shot the ID changes on 1. Then you are not allowed
 * to shot at this field anymore.
 * 
 * <p>
 * At Layer 2 you can see which Game Element is hidden behind this field. This 
 * Layer is only enclosed if the field has been shot or if you actively shoot 
 * at it.
 * The method {@link #getStatusCoordinate()} will be called if the Player 
 * shoots on a field. Then it will be checked with the help of an if statement which 
 * Game Element it is and which action will follow. At the same time it will be checked,
 * if there is a ship, whether this ship is completely destroyed with the current shot.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

// Question:   
// Where should the points be counted? And how?
// How can we add the different Points to the specific Player Score?
// Why am I not able to call the method from the Shooting Area?

public class GameAreaManager {
	
	/*
	 * TJ
	 * I think that this is one of the most important attributes of the whole project. Why are you using an 
	 * int array? Instead, you could use something like this:
	 * IGameItem [] [] area = new IGameItem[x][y];
	 * 
	 * This allows to access the attributes of each field quite easy as you could something like this:
	 * area[3][4].isEmpty();
	 * area[3][4].isOccupiedByEnemie();
	 * area[3][4].isOccupiedByObstacle();
	 * 
	 * In order to do so, you have add some methods of the interface IGameItem.
	 *  
	 */
	
	int Layer1Status = 0; // the field hasn't been shot
	int Layer2Status = 0; // there is water on this field

	

   void shootOnCoordinate (int x, int y) {
	
	         Layer1Status = 1; 
	  // Status of every Coordinate is 0 until you shoot on it, then it switch to 1
	  
      }

   
    // We create new Game Elements, but destroyed them at the same time.
   void getStatusCoordinate () throws NoGameElementException { 
	  
	     if (Layer2Status == 0) {
	    	
	    	 Water water = new Water();
	         water.getScore(); 

       } if (Layer2Status == 1) { 
		  
    	     Dolphin dolphin = new Dolphin();
	         dolphin.getScore();
		  
	   } if (Layer2Status == 2) { 
		  
		     // Island island = new Island();
		     // island.getScore();
		  
	   } if (Layer2Status == 3) { 
		  
		     LuckyDwarf luckydwarf = new LuckyDwarf();
		     luckydwarf.getScore();
		  
	   } if (Layer2Status == 4) {
		     
		     // Mine mine = new Mine();
		     // mine.getScore();
		  
	   } if (Layer2Status == 5) { // There is an One Field Boat
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore();
	      // ShootingArea.isDestroyed(); 
		  
	   } if (Layer2Status == 6) { // There is a Two Field Boat
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore();
	      // ShootingArea.isDestroyed(); 
		  
	   } if (Layer2Status == 7) { // There is a Three Field Boat
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore();
	      // ShootingArea.isDestroyed(); 
		  
	   } if (Layer2Status == 8) { // There is a Four Field Boat
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore();
		  // ShootingArea.isDestroyed(); 
		  
	   } if (Layer2Status == 9) { // There is a Quadruple
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore();
	      // ShootingArea.isDestroyed();
		  
	   } else {
		  
		throw new NoGameElementException();
		  
	   }
		
	
    }

 
  }

