package gameConfigurations;

public interface IPlayer {
	
		public void setName(String name);
		
		public String getName();
		
		public void countPoints(int points);
		
		public int getCountedPoints ();
		
		public void countHits(int hits);
		
		public int getCountedHits ();
		
}
