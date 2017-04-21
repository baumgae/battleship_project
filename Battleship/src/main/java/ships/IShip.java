package ships;
import game.IGameElements;

public interface IShip extends IGameElements{

	char getShipID();

	int getShipSizeX();

	int getShipSizeY();

}