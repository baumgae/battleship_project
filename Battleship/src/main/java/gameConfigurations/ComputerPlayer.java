package gameConfigurations;
/**
 * THIS CLASS ISN'T ACTIVE YET
 * 
* Subclass of Player called ComputerPlayer
* <p>
* This is the subclass for a ComputerPlayer
* <br>
* If a ComputerPlayer will be created, a name has to be given through the <br>
* constructor {@Link ComputerPlayer}
* 
* <p>
* @author Lea Baumgärtner
* @version 0.1 
*/
public class ComputerPlayer extends Player{

	ComputerPlayer(String name) {
		super(name);
		
	}
	
	/*
	Would the constructor be enough or do I need also an extra "ScoreStorage"
	for the Computer Player?
	
	int computerPoints = Player.points;
	int computerHits = Player.hits;
	*/
}
