package gameElement;
/**
 * Game Element Mine
 * <p>
 * This class is a subclass of Game Items.
 * It has the ID 4 as well as a special impact.
 * If the player hits a Mine on the shootingArea,
 * he or she will "die" and the game 
 * will be quit immediately. The other player will have won 
 * the game.
 *
 * <p>
 * Island uses in his constructor {@link #Mine}
 * the constructor {@link #AGameItems} to set the ID.
 * Use {@link #mineImpact} to get the impact of the island.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.1 
 */
public class Mine extends AGameItem {

	Mine() {
		super(4);
		getSize();
	}
	
	/*
	 * TJ
	 * Why does this method return a string instead of an integer?
	 */
	public static int mineImpact() {
		
		// Methode, welche zur Methode führt, welche 
		// in der Logik ist und das aktuelle Spiel beendet.
		
		int minusPoints = -500;	// Punkte sind noch variable festzulegen
		return minusPoints;

		
	}
	
}
