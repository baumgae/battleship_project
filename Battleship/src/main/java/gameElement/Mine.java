package gameElement;

public class Mine extends GameElement {

	public Mine(int numberGameElement) {
		super(4);
		GameElement.getSize();
	}
	
	public String MineImpact() {
		
		// Methode, welche zur Methode führt, welche 
		// in der Logik ist und das aktuelle Spiel beendet.
		
		String message;
		message = "Funny message - you died";
		
		return message;
		
	}
	
}
