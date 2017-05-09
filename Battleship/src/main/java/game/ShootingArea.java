package game;

//Autor Celine Wichmann

// Question: 
// Why does this class demand a constructor?

/*
 * TJ
 * I don't think that inheritance is required for this class.
 * When you remove the inheritance, implementation of the constructor is not
 * required anymore.
 */

public class ShootingArea  {
	
  boolean isDestroyed (int countHits, int shipSize) { 
	 
	 if (countHits == shipSize) {
		  
		 return true;
		 
	 } else {
		 
	 return false;
	 
	 } 
  }
	
}
