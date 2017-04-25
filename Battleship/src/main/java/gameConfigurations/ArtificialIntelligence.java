package gameConfigurations;
import java.util.Random;

public class ArtificialIntelligence {
	
public static int randomCoordinate(int x, int y) {
	
	final int maximumX = x;
	final int maximumY = y;
	
	Random rndX = new Random();
	Random rndY = new Random();
	
	final int randomValueX = rndX.nextInt(maximumX + 1);
	final int randomValueY = rndY.nextInt(maximumY + 1);
	
	// System.out.println(randomValueX + "," + randomValueY);
	
	return (randomValueX + randomValueY);
	
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
