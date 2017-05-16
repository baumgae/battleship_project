package gameElement;
/**
 * THIS CLASS ISN'T ACTIVE 
 * <p>
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
 * @version 0.2 
 */
public class Island extends AGameItem{

	Island() {
		super(2);					// Island has ID 2
		getSize();					// get his size
	}
	
	@Override
	public boolean isHidden() {
		return true;
	}

	@Override
	public int getScore() {
		int minusPoints = -200;	
		return minusPoints;
	}

	@Override
	public boolean isDestroyed() {
		return false;
	}
	
	@Override
	public int getID() {
		return 2;
	}

}
