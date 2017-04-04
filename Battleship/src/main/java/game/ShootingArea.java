package game;

public class ShootingArea extends GameArea {
	
 boolean isDestroyed (int countHits) {
	 
	 if (countHits == 0) { // Change 0 to shipSize
		  
		 return true;
		 
	 } else {
		 
	 return false;
	 
	 } 
  }
	
}
