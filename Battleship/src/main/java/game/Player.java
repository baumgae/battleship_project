package game;

public abstract class Player {
		
		
	String name;
	int counthits;
	int points;
	int howOftenWon;
	GameArea gameArea;
	
	
	
	
	public Player(String name) {
		this.name = name;
	}

	public void checkInput() {
		
		
	}
	
	public void countPoints() {
	
	}
	
	public int getCountedPoints (int points) {
		this.points = points;
		return points;
	}
	
	public void countWins(int howOftenWon) {
		
	}
		
}
