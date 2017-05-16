package ships;

import gameConfigurations.Item;

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
public interface IShip extends Item{
	
	int getShipSizeX();

	int getShipSizeY();

}