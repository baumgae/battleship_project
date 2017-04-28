package gameConfigurations;
/**
 * Factory for creating a new Player
 * <p>
 * This is a Factory for creating new Players.
 * 
 * HumanPlayer - Player, which is making input through the GUI
 * ArtificialPlayer - Player, Input through the class AI
 * 
 * <p>
 * @author Lea Baumgärtner
 * @version 0.1 
 */
public class PlayerFactory {
	
	// Over here I want to have a factory for creating new
	// Players - but how does it work?
	// Should I create the Factory over here or in the player?
	
	// Da sich der AI und der HumanPlayer nicht in den enthaltenen Informationen unterscheiden
	// einfach Player erstellen.
	
	public static Player getNewPlayer (String name, String type){
		return new Player (name, 0, 0);
	}
	
}
