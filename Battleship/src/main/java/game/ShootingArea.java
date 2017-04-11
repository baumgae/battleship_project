package game;

//import ships.Ship;

public class ShootingArea extends GameArea {
	
 boolean isDestroyed (int countHits, int shipSize) { //Hol ich mir wirklich shipSize aus der Klasse Ship?
	 
	 if (countHits == shipSize) {
		  
		 return true;
		 
	 } else {
		 
	 return false;
	 
	 } 
  }
	
}
