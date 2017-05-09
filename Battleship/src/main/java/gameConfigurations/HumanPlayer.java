package gameConfigurations;

public class HumanPlayer extends Player{

	HumanPlayer(String name, int hits, int points) {
		super(name, 0, 0);
	}
	
	/*
	Would the constructor be enough or do I need also an extra "ScoreStorage"
	for the human Player?
	
	int humanPoints = Player.points;
	int humanHits = Player.hits;
	*/
}
