package ships;
/**
 * Subclass of AShip called ThreeFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 'C'.
 *
 * <p>
 * FourFieldBoat uses in his constructor {@link #ThreeFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * Use {@link #getY} and {@link #getX} to receive the position.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class ThreeFieldBoat extends AShip {

	ThreeFieldBoat() {
		super('C', 3, 0);
	
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
