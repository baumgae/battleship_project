package gameConfigurations;
/**
 * Factory for creating a new Player
 * <p>
 * This is a Factory for creating new Players.
 * 
 * <p>
 * @author Lea Baumgärtner
 * @version 0.1 
 */
public class PlayerFactory {
	
	// Over here I want to have a factory for creating new
	// Players - but how does it work?
	// Should I create the Factory over here or in the player?
	/* 
	public static Player getInstance(String name, int points, int countHits){
		points = 0;
		countHits = 0;
		return new Player (name, points, countHits);
	}
	*/
	
	public static IPlayer getInstance(String type, String name, int points, int countHits){
		if(type == null){
			return null; // TJ: better to throw an exception
		}else if(type.equals("human")){
			return new HumanPlayer(name, points, countHits); // TJ: HumanPlayer class is not implemented yet.
		}else if(type.equals("ai")){
			return new ComputerPlayer(name, points, countHits); // TJ: ComputerPlayer class is not implemented yet.
		}else{
			// TJ: throw an exception when player type is unknown.
		}
	}
}
