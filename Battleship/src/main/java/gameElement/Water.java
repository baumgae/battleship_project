package gameElement;
/**
 * Game Element Water
 * 
 * <p>
 * This class is a subclass of Game Items.
 * It has the ID 0 and it has no impact at all,
 * if the player hits water on the shootingArea.
 *
 * <p>
 * Water uses in his constructor {@link #Water}
 * the constructor {@link #AGameItems} to set the ID.
 * Use {@link #waterImpact} to get the impact of the water.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */

public class Water extends AGameItem{

	
	public Water() {
		super(0);					// Water has ID 0
		getSize();					// get his size
	}
	
	public static int waterImpact() {
		int noPoints = 0;;	
		return noPoints;
	}
	
	
}

