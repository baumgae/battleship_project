package gameElement;
import game.IGameElement;
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
public interface IGameItem extends IGameElement{

	int getSize();

}