package game;

public class NoGameElementException extends Exception {

	 @Override
     public String toString() {
     return "There has not been shoot one of the existing Game Items!";
}
	
}
