package gameElement;


public class Dolphine extends AGameItems{
//  Impact on the Game: If a Player shots a Dolphine, he / she will get minus points.
	
	Dolphine() {
		super(1);					// Dolphine has ID 1
		getSize();		// get his size
	}
	
	public int dolphinImpact() {
		int minusPoints = -100;	// Punkte sind noch variable festzulegen
		return minusPoints;
		
	}
	
}

