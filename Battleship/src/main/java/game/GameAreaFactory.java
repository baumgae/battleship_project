package game;
import java.util.Random;
import game.DifficultyManager;
import gameElement.Dolphin;
import gameElement.Island;
import gameElement.LuckyDwarf;

public class GameAreaFactory {
	
	/**
	 * Factory for creating a new Game Area
	 * <p>
	 * This is a Factory for creating a new Game Area.
	 * The method {@link #createArea(DifficultyManager, int, int)} gets the field size 
	 * from the Class DifficultyManager and creates a new field with the given size.
	 * With every degree of Difficulty this Class gets another size.
	 * 
	 * <p>
	 * The method {@link #setRandomGameElement(DifficultyManager, int, int)} is 
	 * called after the first method has been called and set the Game Elements random 
	 * because as a Player you are only allowed to set the ships you have available in the 
	 * different degrees of Difficulty. 
	 * The number of gameElements varies according to degree of difficulty.
	 * 
	 * <p>
	 * @author Celine Wichmann
	 * @version 0.2
	 */
	
	// How can i assign random Coordinates to the Game Elements?
    // Item items [] [] = new Item [x] [y]; // erst Mal auf Wasser
	
     void createArea (DifficultyManager difficulty, int x, int y) {
		
		  
	    }
	
	 void setRandomGameElement (DifficultyManager difficulty, int x, int y) {
			
	 	  final int CoordinateX = x;
		  Random rndX = new Random();
		  final int randomValueX = rndX.nextInt(CoordinateX + 1);
		
		  final int CoordinateY = y;
		  Random rndY = new Random();
		  final int randomValueY = rndY.nextInt(CoordinateY + 1);
  		
//        Dolphin.item [randomValueX] [randomValueY];
//        Island.item [randomValueX] [randomValueY];
//        LuckyDwarf.item [randomValueX] [randomValueY]; //--> Does this work?
//        Mine.item [randomValueX] [randomValueY];
					
	  }

 }

