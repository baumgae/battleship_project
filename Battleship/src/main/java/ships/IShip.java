package ships;
import game.IGameElements;
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
public interface IShip extends IGameElements{

	char getShipID();

	int getShipSizeX();

	int getShipSizeY();

}