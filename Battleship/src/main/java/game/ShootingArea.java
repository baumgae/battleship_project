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
	
	//VERSCHOBEN IN GAME AREA
	
	private static final Logger logger = LogManager.getLogger(ShootingArea.class);
	
	int Layer1Status = 0; // the field hasn't been shot
	int Layer2Status = 0; // there is water on this field
	Point p;
	
/*
 * Doku für uns: Schießt auf die obere Schicht, wo noch alles auf 0 steht.
 * 
 * Heißt: Layer1 ist Scnuss oder nicht Scnuss.
 * Wenn du auf eine Koordinate schießt ändert sich der status von 0 auf 2
 * 
 * Wenn man versucht nochmal darauf zu schießen, kannst dus nicht nochmal tun.
 */
   void shootOnCoordinate (Point p) throws Exception {
	   		
	   		this.p = p;
	   
	         logger.info("The method ShootingArea.shootOnCoordinate has been called!"); 
	   
	         if (Layer1Status == 1) {
	        	 
	        	 throw new AlreadyShotException();
	        	 
	         } else {
	        	
	        	 logger.info("You are not allowed to shoot again over here!");
	             Layer1Status = 1; 
	         
	         }
	  
      }
   
   /*
    * Bekommt den Punkt und gibt den Status 0 oder 1 zurück.
    */
   
   int getCoordinateLayer1Status(Point p) {
	   p = this.p;
	   logger.info("The method ShootingArea.getCoordinateLayer1Status has been called!");
	   
	   return Layer1Status;
	   
   }

   // Dieser Layer sagt, ob da ein Item liegt oder nicht.
   public int getStatusCoordinate (int ID) throws NoGameElementException { 
	  
	   logger.info("The method ShootingArea.getStatusCoordinate has been called!");
	   
	   /* Frage an TJ: Wie könnten wir diese Methode gestalten? 
	    * Problem: Methoden können nicht static gemacht werden, aufrung der 
	    * abstrakten Klasse, und wir wollen hier ja keine neuen Objekte erzeugen
	    * 
	    */
	   
	   // Wenn ein Kästchen abgeschossen wird, dann soll diese Methode aufgerufen werden.
	   // d.H. wird das versteckte Item aufgedeckt, wird die ID des darunterliegenden 
	   // Elementes dieser Methode übergeben und je nachdem welche Art von Element 
	   // es ist, werden die Unterschiedliche Anzahl an Punkten wieder zurückgegeben 
	   // oder auch nicht.
	   
	   // Diese Punkte wiederum holt sich der Game Manager und übergibt sie dem
	   // jeweiligen Player
	   
	   // Das ist soweit der Plan!
	   
	   
	     if (ID == 0) {
	    	 Water water = new Water("Toni");
	    	 int points = water.getScore();
	         return points;

       } if (Layer2Status == 1) { 
		  
    	     Dolphin dolphin = new Dolphin("Günther");
    	     dolphin.getScore();
	         return 0;
		  
	   } if (Layer2Status == 2) { 
		  
		      Island island = new Island("Günther2");
		      island.getScore();
		      return 0;
		  
	   } if (Layer2Status == 3) { 
		  
		     LuckyDwarf luckydwarf = new LuckyDwarf("SexyBatman");
		     luckydwarf.getScore();
		     return 0;
		  
	   } if (Layer2Status == 4) {
		     
		     Mine mine = new Mine("Olaf");
		     mine.getScore();
		     return 0;
		  
	   } if (Layer2Status == 5) { // There is an One Field Boat
		   
		   // We just have an One Field Boat at this moment.
		  
		     OneFieldBoat onefieldboat = new OneFieldBoat("Tobi");
	         onefieldboat.getScore();
	         return 0;
		  
//	   } if (Layer2Status == 6) { // There is a Two Field Boat
//		  
//		     //OneFieldBoat onefieldboat = new OneFieldBoat();
//	         //onefieldboat.getScore(); 
//	         return 0;
//		  
//	   } if (Layer2Status == 7) { // There is a Three Field Boat
//		  
//		    // OneFieldBoat onefieldboat = new OneFieldBoat();
//	         //onefieldboat.getScore(); 
//	         return 0;
//		  
//	   } if (Layer2Status == 8) { // There is a Four Field Boat
//		  
//		     OneFieldBoat onefieldboat = new OneFieldBoat();
//	         onefieldboat.getScore(); 
//	         return 0;
//		  
//	   } if (Layer2Status == 9) { // There is a Quadruple
//		  
//		     OneFieldBoat onefieldboat = new OneFieldBoat();
//	         onefieldboat.getScore();
//	         return 0;
		  
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

