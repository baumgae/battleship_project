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

