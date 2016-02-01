import java.util.Scanner;

//This class simulates a game of hangman with a fixed set of movie titles from the given text file
public class Hangman {
	//WRONG_NUMBER represents the max number of times a user can incorrectly guess a letter
	public static final int WRONG_NUMBER = 5;
    public static void main(String[] args) {
        intro();
        MovieList phrases = buildMovieList(args);
        Scanner keyboard = new Scanner(System.in);
        
        //Initialize the variable response outside of the first while loop (the loop will stop once the response value changes)
        String response = "Y";
        outerWhileLoop(response, phrases, keyboard);
        keyboard.close();
    }
    
    //This method represents the outer while loop of the program, checking if the user inputs Y or not
    //Initializes the counter for # of incorrect tries, the alphabet that can be used, the initial guess to create the alphabet
	//Obtains the first phrase by calling the MovieList Object
    //Obtains the string that contains all of the asterisks
    //Calls the inner method that processes the user input of the guess and response
    public static void outerWhileLoop(String response, MovieList phrases, Scanner keyboard){
    	while(response.equals("Y")){
	        int wrongCounter = 0;
	        String alphabet = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z ";
	        String guess = "filler";
	        String phrase = phrases.getNextPhrase();
	        
	        String asterisksPhrase = getMovie(alphabet, phrases, phrase);
	        
	        response = innerWhileLoop(wrongCounter, phrase, alphabet, guess, asterisksPhrase, response, keyboard);
    	}
    }
    
    //Inner while loop runs until the counter for # of incorrect letters reaches the limit (5)
    //Prints out the letters user can choose
    //Obtains user guess through the getGuess method
    //Increments counter if the guess is not in the string of letters user can choose
    //If statement checks if the string with asterisks matches the initial phrase and if the counter is at the limit
    public static String innerWhileLoop(int wrongCounter, String phrase, String alphabet, 
    		String guess, String asterisksPhrase, String response, Scanner keyboard){
        while(wrongCounter < WRONG_NUMBER){
        	alphabet = getAlphabet(alphabet, guess);
	        guess = getGuess(alphabet, guess, keyboard);
	        wrongCounter = getCounter(wrongCounter, phrase, guess);
		    asterisksPhrase = getPhrase(wrongCounter, phrase, guess, asterisksPhrase);
		    
		    if(asterisksPhrase.equals(phrase) || wrongCounter == WRONG_NUMBER){	
		    	response = winConditions(wrongCounter, phrase, keyboard);
		    	wrongCounter = WRONG_NUMBER + 1;
		    }
	    }
        return response;
    }
    
    //Adds asterisks and underscores for the letters and spaces from the phrase to "asktersksPhrase"
    //Returns asterisk phrase to use in inner loop method
    public static String getMovie(String alphabet, MovieList phrases, String phrase){
    	String asterisksPhrase = "";
    	
    	System.out.println("\nI am thinking of a movie ...\n");
    	for(int i = 0; i < phrase.length(); i++){
    		if(phrase.charAt(i) == '_'){
    			asterisksPhrase += "_";
    		}
    		else{
    			asterisksPhrase += "*";
    		}
    	}
    	System.out.println("The current phrase is " + asterisksPhrase + "\n");
    	
    	return asterisksPhrase;
    }
    
    //Obtains user input and switches value into an uppercase value
    //While loop inside checks if the guess is in the string of letters user can use and if the input has at least one letter
    //If not, user must input a new guess
    //Return guess to use in inner loop method
    public static String getGuess(String alphabet, String guess, Scanner keyboard){
    	System.out.print("Enter your next guess: ");
    	guess = keyboard.nextLine().toUpperCase();
    	while(!(alphabet.contains(guess)) || guess.length() != 1){
    		System.out.println("\n" + guess + " is not a valid guess.");
	    	System.out.println("The letters you have not guessed yet are: \n" + alphabet);
	        System.out.print("Enter your next guess: ");
	        guess = keyboard.nextLine().toUpperCase();
    	}
    	System.out.println("\nYou guessed " + guess + ".");
    	return guess;
    }
    
    //If statement checks to see if the guess user made is in the initial phrase
    //If not, increment counter
    //Return counter value to use in inner loop method
    public static int getCounter(int wrongCounter, String phrase, String guess){
    	if(phrase.contains(guess)){
    		System.out.println("\nThat is present in the secret phrase.");
    	}
    	else{
    		System.out.println("\nThat is not present in the secret phrase.");
    		wrongCounter++;
    	}
    	System.out.println("\nNumber of wrong guesses so far: " + wrongCounter);
    	return wrongCounter;
    }
    
    //Obtains the first letter of the user guess and casts to a char
    //Creates variable "finalPhrase" that will replace the "asterisksPhrase" in the main method
    //Checks every index of the finalPhrase and sees if any part equals to the user guess
    //If so, replace the asterisk with the guess letter
    //If the finalPhrase after the replacing of the asterisks isn't the initial phrase, output the statement with changes
    //Return new asteriskPhrase to use in inner loop method
    public static String getPhrase(int wrongCounter, String phrase, String guess, String asterisksPhrase){
       	char charGuess = guess.charAt(0);
    	String finalPhrase = asterisksPhrase;
       	for(int i = 0; i < finalPhrase.length(); i++){
       		if(phrase.charAt(i) == charGuess){
       			finalPhrase = finalPhrase.substring(0, i) + charGuess + finalPhrase.substring(i + 1, finalPhrase.length());
       		}
       	}
       	if(!finalPhrase.equals(phrase) && wrongCounter < 5){
       		System.out.println("The current phrase is " + finalPhrase + "\n");
       	}
       	return finalPhrase;
    }
    
    //Gets the user input, and removes the input if it is present in the string of letters that can be used
    //On the first call for this, the guess is "filler", so the string of letters won't change
    public static String getAlphabet(String alphabet, String guess){
    	String finalAlphabet = alphabet.replaceAll(guess + " ", "");
    	System.out.println("The letters you have not guessed yet are: \n" + finalAlphabet + "\n");
    	return finalAlphabet;
    }
    
    //If counter is at 5, states user loses
    //If not, states user wins
    //Asks user if they want to play another game, and get user input
    //Return the response to use in inner loop method
    public static String winConditions(int wrongCounter, String phrase, Scanner keyboard){
    	String result = "";
    	if(wrongCounter == 5){
    		System.out.println("You lose. The secret phrase was " + phrase);
    	}	
    	else{
    		System.out.println("The phrase is " + phrase + ".");
    		System.out.println("You win!!");
    	}
    	System.out.println("Do you want to play again?");
		System.out.print("Enter 'Y' or 'y' to play again: ");
		result = keyboard.nextLine().toUpperCase();
    	return result;
    }

    
    //build the MovieList
    public static MovieList buildMovieList(String[] args) {
        MovieList result;
        if(args == null || args.length == 0 
                || args[0] == null || args[0].length() == 0)
            result =  new MovieList();
        else
            result = new MovieList(args[0]);
        return result;
    }

    //show the intro to the program
    public static void intro() {
        System.out.println("This program plays the game of hangman.");
        System.out.println();
        System.out.println("The computer will pick a random phrase.");
        System.out.println("Enter letters for your guess.");
        System.out.println("After 5 wrong guesses you lose.");  
    }
}