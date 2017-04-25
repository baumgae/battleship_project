package game;

//Autor Celine Wichmann

// Question: 
// Why does this class demand a constructor?

public class ShootingArea extends GameAreaManager {

public ShootingArea(EGameArea Layer1) { //fordert Constructor sonst Fehlermeldung
		super(Layer1);
	
	}

boolean isDestroyed (int countHits, int shipSize) { 
	 
	 if (countHits == shipSize) {
		  
		 return true;
		 
	 } else {
		 
	 return false;
	 
	 } 
  }
	
}
