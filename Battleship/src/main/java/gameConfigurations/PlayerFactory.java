package gameConfigurations;
/**
 * Factory for creating a new Player
 * <p>
 * This is a Factory for creating new Players.
 * 
 * HumanPlayer - Player, which is making input through the GUI.
 * ArtificialPlayer - Player, Input through the class AI.
 * 
 * <p>
 * @author Lea Baumgärtner
 * @version 0.1 
 */
public class PlayerFactory {
	
	/*
	public static Player getNewPlayer (String name, String type){
		return new Player (name, 0, 0);
	}
	*/
	
	// Muss ich hier überhaupt, int points, int countHit übergeben
	// Sie werden doch sowieso von Anfang an auf Null gesetzt.
	
	public static IPlayer getInstance(String type, String name, int points, int countHits) throws CreatePlayerException{
		if(type == null){
			throw new CreatePlayerException(); 
		
		} else if(type.equals("human")){
			return new HumanPlayer(name, 0, 0); 
		
		} else if(type.equals("ai")){
			return new ComputerPlayer(name, 0, 0); 
		
		} else{
			throw new CreatePlayerException();
			
		}
	}
	
	/*
	 * I think about throwing new CreatePlayerExceptions in the if == null
	 * and the else. Should I do it with a try catch Block?
	 * 
	 * 
	 * try {
	 *	Player player = new HumanPlayer();
	 *	LOG
	 *		} catch (CreatePlayerException e) {
	 *		LOG;
	 */

}
