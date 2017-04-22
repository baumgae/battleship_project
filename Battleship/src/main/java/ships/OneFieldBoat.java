package ships;
/**
 * Subclass of AShip called OneFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 'A'.
 *
 * <p>
 * FourFieldBoat uses in his constructor {@link #OneFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * Use {@link #getY} and {@link #getX} to receive the position.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class OneFieldBoat extends AShip {

	OneFieldBoat() {
		super('A', 1, 0);
		
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
