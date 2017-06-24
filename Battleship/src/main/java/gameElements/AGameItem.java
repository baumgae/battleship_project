package gameElements;

import java.awt.Point;

import gameConfigurations.Item;

/**
 * Abstract Class for Game Items
 * <p>
 * This is the super class for the Game Items.
 * It sets the size of every Element on 1, which means
 * that every Game Item is one field big.
 * Due to the constructor the Children have to set an ID.
 * And there are methods for getting the size and the ID.
 
 * <p>
 * Subclasses use constructor {@link #AGameItems} to set the ID
 * Use {@link #getSize} to get the size of a game item
 * Use {@link #getGameElementID} to get the ID of a game item
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */

public abstract class AGameItem implements Item { 
		
	/**
	*
	* Fields for the GameItems
	*
	**/

		Point p;
		
	
	
		
}
		
		