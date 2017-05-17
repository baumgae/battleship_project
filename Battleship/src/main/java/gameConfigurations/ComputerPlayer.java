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
