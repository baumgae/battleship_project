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

	OneFieldBoat() {
		super(5, 1, 0);
		
	}


}
