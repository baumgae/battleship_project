package game;

abstract class GameArea {
	
	private byte x;
	private byte y;
	byte [] [] area = new byte [x] [y];
	
	final byte isGameElement () {
		
		return 0;
		
	}
	
	final char isShip () {
		
		return 'A';
		
	}
	
	final byte isShot () {
		
		return 0;
		
	}
	
	final byte waterShot () {
		
		return 0;
		
	}
	
	final byte shipShot () {
		
		return 0;
		
	}
	
	void createArea () {
		
		//int levelsize = get.Difficulty;
		
	}
	
	void shootOnCoordinate (int x, int y) {
		
	}
	
	int getStatusCoordinate (int x, int y) {
		
		return 0; //Rückgabetyp byte
		
	}
	
	void setRandomGameElement (int x, int y) {
		
		
	}
	
}
