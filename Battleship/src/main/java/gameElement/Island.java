package gameElement;
/**
 * THIS CLASS ISN'T ACTIVE 
 * 
 * Game Element Island
 * <p>
 * This class is a subclass of Game Items.
 * It has the ID 2 as well as a special impact.
 * If the player hits a island on the shootingArea,
 * he or she will be able to shoot on four fields three time, 
 * one time every round.
 *
 * <p>
 * Island uses in his constructor {@link #Island}
 * the constructor {@link #AGameItems} to set the ID.
 * Use {@link #islandImpact} to get the impact of the island.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.1 
 */
public class Island extends AGameItems{

	Island() {
		super(2);					// Island has ID 2
		getSize();					// get his size
	}
	
	public int islandImpact() {
		// We want to change the way the player is able to shoot - instead of shooting on one field
		// Shooting on four fields for 3 Rounds
		
		
		// Over here, I have to work with a map or somethings
		int shootingX = 2;
		// int shootingY = 2;
		
								// Punkte sind noch variable festzulegen
		return shootingX;
		
	}

}
