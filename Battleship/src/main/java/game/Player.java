package game;

public abstract class Player {
		
		
	String name;
	int counthits;
	int points;
	int howOftenWon;
	EGameArea gameArea;
	
	
	
	
	public Player(String name) {
		this.name = name;
	}

	public void checkInput() {
		
		
	}
	
	public static void countPoints() {
		
	}
	
	public static int getCountedPoints (int points) {
		return points;
	}
	
	public void countWins(int howOftenWon) {
		
	}
		
}
