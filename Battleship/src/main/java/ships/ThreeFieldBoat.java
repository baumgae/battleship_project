package ships;
/**
 * Subclass of AShip called ThreeFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 7.
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
		super(7, 3, 0);
	
	}

	
}
