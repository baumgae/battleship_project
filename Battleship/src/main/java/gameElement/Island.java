package gameElement;

public class Island extends GameElement{

	Island() {
		super(2);					// Island has ID 2
		GameElement.getSize();		// get his size
	}
	
	public int IslandImpact() {
		// We want to change the way the player is able to shoot - instead of shooting on one field
		// Shooting on four fields for 3 Rounds
		
		
		// Over here, I have to work with a map or somethings
		int shootingX = 2;
		// int shootingY = 2;
		
								// Punkte sind noch variable festzulegen
		return shootingX;
		
	}

}
