package gameElement;
/**
 * Game Element Island
 * <p>
 * This class is a subclass of Game Items.
 * It has the ID 3 as well as a special impact.
 * If the player hits a Lucky Dwarf on the shootingArea,
 * he or she will get plus 300 points. 
 * In the game the lucky dwarf is available for about 
 * five rounds. He randomly appears and disappears after these five rounds.
 *
 * <p>
 * LuckyDwarf uses in his constructor {@link #LuckyDwarf}
 * the constructor {@link #AGameItems} to set the ID.
 * Use {@link #luckyDwarfImpact} to get the impact of the lucky dwarf.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class LuckyDwarf extends AGameItems{

	public LuckyDwarf() {
		super(3);					// LuckyDwarf has ID 3
		getSize();		// get his size
	}
	
	public int luckyDwarfImpact() {
		int plusPoints = 300;	// Punkte sind noch variable festzulegen
		return plusPoints;
		
	}
	
}
