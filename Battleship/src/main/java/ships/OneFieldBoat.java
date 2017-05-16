package ships;
/**
 * Subclass of AShip called OneFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID '5'.
 *
 * <p>
 * OneFieldBoat uses in his constructor {@link #OneFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class OneFieldBoat extends AShip {

	public OneFieldBoat() {
		super(5, 1, 0);
		
	}
	
	@Override
	public boolean isHidden(boolean hide) {
		return hide;
	}

	@Override
	public int getScore() {
		int plusPoints = 100;	
		return plusPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		return destroy;
	}
	
	@Override
	public int getID() {
		return 5;
	}

}
