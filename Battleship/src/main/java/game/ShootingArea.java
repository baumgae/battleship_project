package game;

//import ships.Ship;

public class ShootingArea extends EGameArea {
	
 boolean isDestroyed (int countHits, int shipSize) { 
	 
	 if (countHits == shipSize) {
		  
		 return true;
		 
	 } else {
		 
	 return false;
	 
	 } 
  }
	
}
