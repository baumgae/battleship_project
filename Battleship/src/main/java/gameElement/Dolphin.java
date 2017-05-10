package gameElement;
/**
 * Game Element Dolphin
 * <p>
 * This class is a subclass of Game Items.
 * It has the ID 1 as well as a special impact.
 * If the player hits a dolphin on the shootingArea,
 * he or she will get -100 points.
 *
 * <p>
 * Dolphin uses in his constructor {@link #Dolphin}
 * the constructor {@link #AGameItems} to set the ID.
 * Use {@link #dolphinImpact} to get the impact of the dolphin.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */

public class Dolphin extends AGameItem{
	
	public Dolphin() {
		super(1);					// Dolphin has ID 1
		getSize();					// get his size
	}
	
	/*
	 * TJ
	 * I think that this method can be generalized and can be moved to IGameElement:
	 * public int getImpact()
	 * This eases the calculation of players' score.
	 */
	
	public static int dolphinImpact() {
	
		int minusPoints = -100;	
		return minusPoints;
	}
	
	
}

