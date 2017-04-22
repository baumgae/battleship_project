package gameElement;
import game.IGameElements;
/**
 * Interface for Game Items
 * <p>
 * Every Subclass of Game Items has the methods
 * getSize and getGameElementID
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public interface IGameItems extends IGameElements{

	int getSize();

	int getGameElementID();

	int getX();
	
	int getY();
}