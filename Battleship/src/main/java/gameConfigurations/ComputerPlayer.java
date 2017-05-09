package gameConfigurations;

public class ComputerPlayer extends Player{

	ComputerPlayer(String name, int hits, int points) {
		super(name, 0, 0);
		
	}
	
	/*
	Would the constructor be enough or do I need also an extra "ScoreStorage"
	for the Computer Player?
	
	int computerPoints = Player.points;
	int computerHits = Player.hits;
	*/
}
