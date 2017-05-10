package ships;
import game.IGameElement;
/**
 * Interface for Ships
 * <p>
 * Every Subclass of Game Items has the methods
 * {@Link #getID()} from the Interface IGameItem and {@Link #getShipSizeX()}
 * as well as {@Link #getShipSizeY()}.
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public interface IShip extends IGameElement{
	
	int getShipSizeX();

	int getShipSizeY();

}