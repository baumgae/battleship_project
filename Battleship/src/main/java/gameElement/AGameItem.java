package gameElement;
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

public abstract class AGameItem implements IGameItem { 
		
	/**
	*
	* Fields for the GameItems
	*
	**/
		private int IDGameElement;
		final static int size = 1;
		
	/**
	*
	* Super Constructor for the subclasses
	* 
	* @param IDGameElement
	*
	**/	
		AGameItem (int IDGameElement) {
			this.IDGameElement = IDGameElement;
		}
	
	/**
	*
	* Methods for getting size and GameElement ID
	* 
	* @return size of the Game Item
	* @return ID of the Game Item
	* 
	**/
		
		/* (non-Javadoc)
		 * @see gameElement.IGameItem#getSize()
		 */
		@Override
		public int getSize() {
			return size;
		}
		
		/* (non-Javadoc)
		 * @see game.IGameElements#getXposition()
		 
		@Override
		public int[] getPosition() {
			return ;
		}
		*/
		/* (non-Javadoc)
		 * @see game.IGameElements#getX()
		 */
		@Override
		public int getID() {
			return this.IDGameElement;
		}
		
		
}
		
		