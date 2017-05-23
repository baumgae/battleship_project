package game;

import gameElement.Dolphin;
import gameElement.Island;
import gameElement.LuckyDwarf;
import gameElement.Mine;
import ships.OneFieldBoat;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import game.NoGameElementException;
import gameElement.Water;

/**
 * Shooting Area for setting the Status of the GameArea the Player is shooting at.
 * 
 * <p>
 * This class is managing the Status of the Game Area the Player is shooting at.
 * At Layer 1 you can see whether a Field has been already shot or not.
 * As long as a Field is not shot the ID of this Field stands on 0.
 * If a field is shot the ID changes on 1. Then you are not allowed
 * to shot at this field anymore.
 * 
 * <p> The method {@link #shootOnCoordinate(int, int)} allows the Player to shoot 
 * on Coordinates.
 * 
 * <p> The method {@link #setCoordinateLayer1Status(Point)} set the Status of
 * the Field at Layer 1.
 * 
 * <p> The method {@link #getCoordinateLayer1Status()} shows the Player the Status
 * of the Field at Layer 1.
 * 
 * <p>
 * At Layer 2 you can see which Game Element is hidden behind this field. This 
 * Layer is only enclosed if the field has been shot or if you actively shoot 
 * at it.
 * The method {@link #getStatusCoordinate()} will be called if the Player 
 * shoots on a field. Then it will be checked with the help of an if statement which 
 * Game Element it is and which action will follow. 
 * 
 * <p>
 * @author Celine Wichmann
 * @version 0.2
 */


public class ShootingArea {
	
	private static final Logger logger = LogManager.getLogger(ShootingArea.class);
	
	int Layer1Status = 0; // the field hasn't been shot
	int Layer2Status = 0; // there is water on this field
	Point p;
	

   void shootOnCoordinate (int x, int y) throws Exception {
             
	         logger.info("The method ShootingArea.shootOnCoordinate has been called!"); 
	   
	         if (Layer1Status == 1) {
	        	 
	        	 throw new AlreadyShotException();
	        	 
	         } else {
	        	
	             Layer1Status = 1; 
	         
	         }
	  
      }
   
   void setCoordinateLayer1Status (Point p) {
	   
	   logger.info("The method ShootingArea.setCoordinateLayer1Status has been called!");
	   
	   Layer1Status = 1; // for a special Point or in general?
	   
   }
   
   int getCoordinateLayer1Status() {
	   
	   logger.info("The method ShootingArea.getCoordinateLayer1Status has been called!");
	   
	   return Layer1Status;
	   
   }

   
   void getStatusCoordinate () throws NoGameElementException { 
	  
	   logger.info("The method ShootingArea.getStatusCoordinate has been called!");
	   
	     if (Layer2Status == 0) {
	    	
	    	 Water water = new Water();
	         water.getScore(); 

       } if (Layer2Status == 1) { 
		  
    	     Dolphin dolphin = new Dolphin();
	         dolphin.getScore();
		  
	   } if (Layer2Status == 2) { 
		  
		      Island island = new Island();
		      island.getScore();
		  
	   } if (Layer2Status == 3) { 
		  
		     LuckyDwarf luckydwarf = new LuckyDwarf();
		     luckydwarf.getScore();
		  
	   } if (Layer2Status == 4) {
		     
		     Mine mine = new Mine();
		     mine.getScore();
		  
	   } if (Layer2Status == 5) { // There is an One Field Boat
		   
		   // We just have an One Field Boat at this moment.
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore();
		  
	   } if (Layer2Status == 6) { // There is a Two Field Boat
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore(); 
		  
	   } if (Layer2Status == 7) { // There is a Three Field Boat
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore(); 
		  
	   } if (Layer2Status == 8) { // There is a Four Field Boat
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore(); 
		  
	   } if (Layer2Status == 9) { // There is a Quadruple
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat();
	         onefieldboat.getScore();
		  
	   } else {
		  
		logger.debug("NoGameElementException has been thrown!");
		   
		throw new NoGameElementException();
		  
	   }
		
	
    }

 
  }

/*
 * TJ
 * I think that this is one of the most important attributes of the whole project. Why are you using an 
 * int array? Instead, you could use something like this:
 * IGameItem [] [] area = new IGameItem[x][y];
 * 
 * This allows to access the attributes of each field quite easy as you could something like this:
 * area[3][4].isEmpty();
 * area[3][4].isOccupiedByEnemie();
 * area[3][4].isOccupiedByObstacle();
 * 
 * In order to do so, you have add some methods of the interface IGameItem.
 *  
 */

