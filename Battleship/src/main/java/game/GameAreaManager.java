package game;
import game.EGameArea;

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
	
	public static int x;
	public static int y;
	int [] [] area = new int [x] [y]; 
 
	int Layer1;
	int Layer2;

public GameAreaManager (EGameArea Layer1) {
	
	switch (Layer1) {
	
	  case ISNOTSHOT:
		area [x] [y] += 0;
		break;
		
	  case ISSHOT:
		 area [x] [y] += 1; 
		 break;
		 
		
		 
		
	 }
	
  }
	
  void createArea () {
	
}

  void shootOnCoordinate (int x, int y) {
	
}

  int getStatusCoordinate (int x, int y) {
	
	return 0; 
	
}

  void setRandomGameElement (int x, int y) {
	
	
   }
 }

