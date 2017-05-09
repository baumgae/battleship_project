package game;

public class GameAreaFactory {
	
	void createArea (int x, int y) {
		
		int [] [] area = new int [x] [y]; // i need this in the methode below
		
	}
	
	void setRandomGameElement (EDifficulty difficulty) {
			
		// I get the Number of the Game Elements and set them to a random Coordinate
		// they should be set after Player has set his ships
		// für jedes Game Element Random Index + überprüfen sitzt
		// hier ein Schiff, sonst neu generieren
		// Random Number nicht größer als die Größe des Feldes durch die 
		// Difficulty festgelegt
			
	}

}

// The Factory of the GameArea gets the position and return an Object
