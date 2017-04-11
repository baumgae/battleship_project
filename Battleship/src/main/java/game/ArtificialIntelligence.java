package game;
import java.util.Random;

public class ArtificialIntelligence {
	
public static byte randomCoordinate(byte x, byte y) {
	
	final byte maximumX = x;
	final byte maximumY = y;
	
	Random rndX = new Random();
	Random rndY = new Random();
	
	final byte randomValueX = (byte) rndX.nextInt(maximumX + 1);
	final byte randomValueY = (byte) rndY.nextInt(maximumY + 1);
	
	// System.out.println(randomValueX + "," + randomValueY);
	
	return (byte) (randomValueX + randomValueY);
	
 }	
}

/*
 *  // Generate a random computer move
    public static int computer_move(int[][] board) {
	int move = (int)(Math.random()*9);

	while(board[move/3][move%3] != EMPTY) 
	    move = (int)(Math.random()*9);

	return move;
 */
