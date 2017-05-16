package gameElement;
import gameConfigurations.Item;
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
public interface IGameItem extends Item{

	int getSize();

}