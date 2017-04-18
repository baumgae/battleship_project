package gameElement;


public abstract class AGameItems implements IGameItem { 
	
		private int IDGameElement;
		final static int size = 1;
		
		
		//Constructor
		AGameItems (int IDGameElement) {
			this.IDGameElement = IDGameElement;
		}
		
		/* (non-Javadoc)
		 * @see gameElement.IGameItem#getSize()
		 */
		@Override
		public int getSize() {
			return size;
		}
		
		/* (non-Javadoc)
		 * @see gameElement.IGameItem#getGameElementID()
		 */
		@Override
		public int getGameElementID() {
			return IDGameElement;
		}
		
		
}
		
		