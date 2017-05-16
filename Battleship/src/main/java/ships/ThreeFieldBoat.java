package ships;
/**
 * 
 * THIS CLASS ISN'T ACTIVE
 * 
 * Subclass of AShip called ThreeFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 7.
 *
 * <p>
 * ThreeFieldBoat uses in his constructor {@link #ThreeFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class ThreeFieldBoat extends AShip {

	ThreeFieldBoat() {
		super(7, 3, 0);
	
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
		return 7;
	}
	
}
