package gameElement;

public class LuckyDwarf extends AGameItems{

	public LuckyDwarf() {
		super(3);					// LuckyDwarf has ID 3
		getSize();		// get his size
	}
	
	public int LuckyDwarfImpact() {
		int plusPoints = 300;	// Punkte sind noch variable festzulegen
		return plusPoints;
		
	}
	
}
