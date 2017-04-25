package game;
import game.EGameArea;

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
		
	  case ISSHOT:
		 area [x] [y] += 1; 
		 
		
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

