package gameElement;

import game.Player;

public class Dolphine extends GameElement{
//  Impact on the Game: If a Player shots a Dolphine, he / she will get minus points.
	
	public Dolphine(int numberGameElement) {
		super(numberGameElement);
		numberGameElement = 1;
	}
	
	public int dolphineImpact () {
		return 0;
	}
}

