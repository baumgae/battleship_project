package game;
import gameElement.Dolphin;
import gameElement.Island;
import gameElement.LuckyDwarf;
import gameElement.Mine;
import ships.AShip;
import game.ShootingArea;
import game.NoGameElementException;

// autor Celine Wichmann 

/*
 * Question:
 * I know how the gameArea should actually work,
 * but I'm not quite sure about how to realize this.
 * 
 * Espacially in combination with a two dimensional array 
 * and  an enum - it new for me.
 * 
 */

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
	
	int Layer1Status = 0; 
	int Layer2Status = 0;

	

  void shootOnCoordinate (int x, int y) {
	
	  Layer1Status = 1; 
	  // Status of every Coordinate is 0 until you shoot on it
	  //then it switch to 1
}

  void getStatusCoordinate () throws NoGameElementException { 
	  
	     if (Layer2Status == 0) {
	    	 
	    //Water.waterImpact();

      }  if (Layer2Status == 1) { 
		  
	    Dolphin.dolphinImpact();
		  
	  } if (Layer2Status == 2) { 
		  
		Island.islandImpact();
		  
	  } if (Layer2Status == 3) { 
		  
		LuckyDwarf.luckyDwarfImpact();
		  
	  } if (Layer2Status == 4) {
		  
		Mine.mineImpact();
		  
	  } if (Layer2Status == 5) { // There is an One Field Boat
		  
	   AShip.getShipImpact();
	   // ShootingArea.isDestroyed(); 
		  
		  // How can I use the method, it doesn't work?!
		  
	  } if (Layer2Status == 6) { // There is a Two Field Boat
		  
	   AShip.getShipImpact();
	   // ShootingArea.isDestroyed(); 
		  
	  } if (Layer2Status == 7) { // There is a Three Field Boat
		  
	    AShip.getShipImpact();
	   // ShootingArea.isDestroyed(); 
		  
	  } if (Layer2Status == 8) { // There is a Four Field Boat
		  
	    AShip.getShipImpact();
		// ShootingArea.isDestroyed(); 
		  
	  } if (Layer2Status == 9) { // There is a Quadruple
		  
	    AShip.getShipImpact();
	   // ShootingArea.isDestroyed(); 
		  
	  } else {
		  
		throw new NoGameElementException();
		  
	 }
		
	  // The Question is, what will I do with this? 
	  //   How does the player get this Points?
	  // How can we add the different Points to the specific Player Score
	
   }

 
 }

