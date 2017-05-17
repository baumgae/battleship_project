package gameElement;
/**
 * 
 * Game Element Mine
 * <p>
 * This class is a subclass of Game Items.
 * It has the ID 4 as well as a special impact.
 * If the player hits a Mine on the shootingArea,
 * he or she will "die" and the game 
 * will be quit immediately. The other player will have won 
 * the game. 
 * But before we can implement this, the impact of the GameElement will
 * be MinusPoints.
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

	public Mine() {
		super(4);
		getSize();
	}
	
	@Override
	public boolean isHidden(boolean hide) {
		return hide;
	}

	@Override
	public int getScore() {
		int minusPoints = -400;	
		return minusPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		return destroy;
	}
	
	@Override
	public int getID() {
		return 4;
	}
	
}
