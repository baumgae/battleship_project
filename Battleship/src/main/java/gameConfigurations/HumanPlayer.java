package gameConfigurations;

/**
* Subclass of Player called HumanPlayer
* <p>
* This is the subclass for a HumanPlayer
* <br>
* If a HumanPlayer will be created, a name has to be given through the <br>
* constructor {@Link HumanPlayer}
* 
* <p>
* @author Lea Baumgärtner
* @version 0.2 
*/

public class HumanPlayer extends Player{
	
	int points;
	int hits;
	
	HumanPlayer(String name) {
		super(name);
	}

	@Override
	public void countPoints(int points) {
		points = this.points + points;
		
	}

	@Override
	public int getCountedPoints() {
		return points;
	}

	@Override
	public void countHits(int hits) {
		hits = this.hits + hits;
		
	}

	@Override
	public int getCountedHits() {
		return hits;
	}
	
}
