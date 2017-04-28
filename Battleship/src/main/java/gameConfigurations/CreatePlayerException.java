package gameConfigurations;

public class CreatePlayerException extends Exception {
		
	      //Parameterless Constructor
		// Constructor der Basisklasse
	      public CreatePlayerException() {
	    	  super();
	    	  
	      }

	      //Constructor that accepts a message
	      public CreatePlayerException(String message)
	      {
	         super(message);
	      }
	 }


