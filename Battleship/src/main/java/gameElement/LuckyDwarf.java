package gameElement;

import java.awt.Point;

/**
 * Game Element Island
 * <p>
 * This class is a subclass of Game Items.
 * It has the ID 3 as well as a special impact.
 * If the player hits a Lucky Dwarf on the shootingArea,
 * he or she will get plus 300 points. 
 * <p>
 * THIS IS AN EXTRA
 * In the game the lucky dwarf is available for about 
 * five rounds. He randomly appears and disappears after these five rounds.
 *
 * <p>
 * LuckyDwarf uses in his constructor {@link #LuckyDwarf}
 * the constructor {@link #AGameItems} to set the ID.
 * Use {@link #luckyDwarfImpact} to get the impact of the lucky dwarf.
 * 
 * <p> 
 *
 * @author Lea Baumgärtner
 * @version 0.2 
 */
public class LuckyDwarf extends AGameItem{

	@Override
	public boolean isHidden(boolean hide) {
		return hide;
	}

	@Override
	public int getScore() {
		int plusPoints = 500;	
		return plusPoints;
	}

	@Override
	public boolean isDestroyed(boolean destroy) {
		return destroy;
	}
	
	@Override
	public int getID() {
		return 3;
	}
	
	@Override
	public Point setPosition(Point p) {
		this.p = p;
		return p;
	}
	
	@Override
	public Point getPosition() {
		return p;
	}

	@Override
	public int getXPosition() {
		return p.x;
	}

	@Override
	public int getYPosition() {
		return p.y;
	}
	
	@Override
	public int getSize() {
		return 1;
	}
	
}
