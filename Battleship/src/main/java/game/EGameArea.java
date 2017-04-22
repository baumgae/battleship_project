package game;
import game.EDifficulty;

class EGameArea {  
	
	private int x;
	private int y;
	int [] [] area = new int [x] [y]; //Array aus Listen, jeder Koordinate ein eigenes Objekt?
	
	public enum GameAreaStatus {
		
		// ISGAMEITEM enthält Dolphine, Island, LuckyDwarf, Mine
		ISGAMEITEM, ISSHIP, ISSHOT, WATERSHOT, SHIPSHOT, GAMEITEMSHOT
		
	}
	
	
	
	/*final byte isGameItem () { // is there a GameElement
		
    return 0;
    
	}
	
	final char isShip () { // is there a Ship
		
		return 'A';
		
	}
	
	final byte isShot () { // you are not allowed to shot here again
		
		return 0;
		
	}
	
	final byte waterShot () { // you shot in the water
		
		return 0;
		
	}
	
	final byte shipShot () { // you shot a ship
		
		return 0;
		
	}
	
	final byte GameItemShot () { // you shot a Game Item
		
		return 0;
		
	} */
	
	void createArea () {
		
		// int levelsize = EDifficulty.HARD.getMaxX();//Enum übergeben
		
	}
	
	void shootOnCoordinate (int x, int y) {
		
	}
	
	int getStatusCoordinate (int x, int y) {
		
		return 0; //Rückgabetyp byte
		
	}
	
	void setRandomGameElement (int x, int y) {
		
		
	}
	
}

//Factory für die GameArea, bekommt die Position und gibt Objekt zurück