package ships;
import game.IGameElement;
/**
 * Interface for Ships
 * <p>
 * Every Subclass of Game Items has the methods
 * getShipID and getShipSizeX as well as getShipSizeY
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public interface IShip extends IGameElement{

	int getShipSizeX();

	int getShipSizeY();

}