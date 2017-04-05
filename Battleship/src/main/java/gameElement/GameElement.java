package gameElement;


public abstract class GameElement { 
	
		int IDGameElement;
		
		
		//Constructor
		GameElement (int IDGameElement) {
			this.IDGameElement = IDGameElement;
		}
		
		public static final int getSize() {
			final int size = 1;
			return size;
		}
		
		public int getGameElementID() {
			return IDGameElement;
		}
		
		
}
		
		