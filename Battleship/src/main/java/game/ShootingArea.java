package game;

/**
 * Class for Testing the Status of the Ships
 * 
 * <p>
 * After every shoot the method {@link #isDestroyed(int, int)} will be call to check
 * if the count of Hits reach the size of the ship. When the ship size has been
 * reached then it will be set on true.
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */

public class ShootingArea  { //Testversuch
	
   static boolean isDestroyed (int countHits, int shipSize) { 
	 
	    if (countHits == shipSize) {
		  
		   return true;
		 
      } else {
		 
	       return false;
	 
	  }
	    
   }
 	
}
