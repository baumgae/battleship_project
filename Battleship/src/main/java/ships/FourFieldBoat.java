package ships;
/**
 * Subclass of AShip called FourFieldBoat
 * <p>
 * This class is a subclass of AShip.
 * It has the ID 8.
 *
 * <p>
 * FourFieldBoat uses in his constructor {@link #FourFieldBoat}
 * the constructor {@link #AShips} to set the ID as well as it's size.
 * Use {@link #getY} and {@link #getX} to receive the position.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class FourFieldBoat extends AShip {
	
	FourFieldBoat() {
		super(8, 4, 0);
	
	}


}
