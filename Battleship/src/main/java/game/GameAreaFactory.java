package game;
import java.util.Random;

import com.sun.javafx.scene.paint.GradientUtils.Point;

import game.DifficultyManager;
import gameConfigurations.Item;

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
	
	  int x;
	  int y;
      Item items [] [] = new Item [x] [y]; 
      
      GameAreaFactory(int x, int y) {
    	  
    	  this.x = x;
    	  this.y = y;
      }
      
      public static GameAreaFactory getInstance(DifficultyManager difficulty) 
      throws CreateGameAreaException{
    	  
    	  if (difficulty == null) {
    		  
    		  throw new CreateGameAreaException();
    		  
       } else if (difficulty.equals(EDifficulty.EASY)) {
    	   
    	    //return new GameAreaFactory(DifficultyManager.getFieldSize);
    	      return new GameAreaFactory(0,0); 
    	    
       } else if (difficulty.equals(EDifficulty.NORMAL)) {
    	    	   
    	    //return new GameAreaFactory(DifficultyManager.getFieldSize);
    	      return new GameAreaFactory(0,0); 
    	    	    
       } else if (difficulty.equals(EDifficulty.HARD)) {
    	   
     	  //return new GameAreaFactory(DifficultyManager.getFieldSize);
     	    return new GameAreaFactory(0,0); 
     	    
       }  else if (difficulty.equals(EDifficulty.SUICIDAL)) {
//     	   int x = Point.x;
//     	   int y = Point.y;
//     	   
//     	   DifficultyManager.getFieldSize();
//			Hier sollen die WErte von Point je nach Difficulty geholt und 
//			in x und y Werte aufgesplittet werden. 
//			Diese werte werden dann der Factory übergeben, anstatt 0,0.
// 			Dies muss für alle Fälle übernommen werden, also Easy, normal, hard und suicidial
    	   
      	    // return new GameAreaFactory(DifficultyManager.getFieldSize());
      	       return new GameAreaFactory(0,0); 
      	      
    	  
        } else {
    	   
    	    throw new CreateGameAreaException();
    	   
       }
    	  
      }
	 
      
      // if statements --> wenn Wassser da, dann setzt GI
      // wenn schiff, generiere neue Kooordinaten
	
	 void setRandomGameElement (DifficultyManager difficulty, int x, int y) {
			
	 	  final int CoordinateX = x;
		  Random rndX = new Random();
		  final int randomValueX = rndX.nextInt(CoordinateX + 1);
		
		  final int CoordinateY = y;
		  Random rndY = new Random();
		  final int randomValueY = rndY.nextInt(CoordinateY + 1);
		 
  		
					
	  }

 }

