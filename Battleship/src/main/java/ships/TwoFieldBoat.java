package ships;
/**
 * Subclass of AShip called OneFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 'B'.
 *
 * <p>
 * FourFieldBoat uses in his constructor {@link #TwoFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * Use {@link #getY} and {@link #getX} to receive the position.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class TwoFieldBoat extends AShip {

	TwoFieldBoat() {
		super('B', 2, 0);
	
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
}
