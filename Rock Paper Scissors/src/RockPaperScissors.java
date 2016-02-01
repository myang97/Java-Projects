import java.util.Scanner;
import java.util.Random;

//This class simulates the game of rock paper scissors with a computer player
public class RockPaperScissors {
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;

    public static void main(String[] args) {
    	Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        //Ask and store the name and rounds input
        String name = askName(keyboard);
        int rounds = askRounds(keyboard, name);
        
        //Call the method that will process the game itself and report the results
        gameTime(rand, keyboard, name, rounds);

        keyboard.close();
    }

    //method that returns the name
    public static String askName(Scanner keyboard){
    	System.out.print("Welcome. I, Computer, will be your opponent.\n"
        		+ "Please type in your name and hit enter: ");
        String name = keyboard.next();
        return name;
    }
    
    //method that returns the amount of rounds 
    public static int askRounds(Scanner keyboard, String name){
    	System.out.print("\nWelcome " + name + ".\n\n"
        		+ "All right " + name + ". How many rounds would you like to play?\n"
        		+ "Enter the number of rounds you want to play and press return: ");
        int rounds = keyboard.nextInt();
        return rounds;
    }
    
    //method that processes the game and calls the methods that help display the results
    //the for loop processes how many rounds will be played
    public static void gameTime(Random rand, Scanner keyboard, String name, int rounds){
    	int drawCounter = 0, playerCounter = 0, computerCounter = 0;
    	for(int i = 1; i <= rounds; i++){
    		System.out.println("\nRound " + i + ".");
    		System.out.print(name + ", please enter your choice for this round.\n"
    				+ "1 for ROCK, 2 for PAPER, and 3 for SCISSORS: ");
    		
    		//these four lines take in the player input and the RandomPlayer's random number and converts them into strings
    		int playerChoice = keyboard.nextInt();
    		String playerResult = numberToString(playerChoice);
    		int computerChoice = rand.nextInt(3) + 1;
    		String computerResult = numberToString(computerChoice);
    		
    		System.out.print("Computer picked " + computerResult + ", "
    				+ name + " picked " + playerResult + ".\n");
    		
    		//calls the method that processes who won the mini game and returns a value based on who won
    		int number = combat(playerChoice, computerChoice);
    		
    		//adds a win counter onto either the player, computer or neither
    		//compares the returned value in the calculator to 1/2/3
    		if(number == 1){
    			drawCounter++;
    		}
    		else if(number == 2){
    			playerCounter++;
    		}
    		else{
    			computerCounter++;
    		}		
    	}
    	//prints out the results of the game
    	printResults(name, rounds, drawCounter, playerCounter, computerCounter);
    }
    
    //method that converts the two player's inputs into strings 
    public static String numberToString(int choice){
    	String result = "ROCK";
    	if(choice == 2){
    		result = "PAPER";
    	}
    	else if(choice == 3){
    		result = "SCISSORS";
    	}
    	return result;
    }
    
    //method that uses the conditional statements to determine which player won the set
    //this method utilizes the final variables and compares them with one another
    //returns the value that corresponds with who won
    //1 returned represents a draw
  	//2 returned represents a player win
  	//3 returned represents a computer win
    public static int combat(int playerChoice, int computerChoice){
    	if(playerChoice == ROCK && computerChoice == ROCK){
    		System.out.println("\nWe picked the same thing! This round is a draw.");
    		return 1;
    	}
    	else if(playerChoice == ROCK && computerChoice == PAPER){
    		System.out.println("\nPAPER covers ROCK. I win.");
    		return 3;
    	}
    	else if(playerChoice == ROCK && computerChoice == SCISSORS){
    		System.out.println("\nROCK breaks SCISSORS. You win.");
    		return 2;
    	}
    	else if(playerChoice == PAPER && computerChoice == ROCK){
    		System.out.println("\nPAPER covers ROCK. You win.");
    		return 2;
    	}
    	else if(playerChoice == PAPER && computerChoice == PAPER){
    		System.out.println("\nWe picked the same thing! This round is a draw.");
    		return 1;
    	}
    	else if(playerChoice == PAPER && computerChoice == SCISSORS){
    		System.out.println("\nSCISSORS cut PAPER. I win.");
    		return 3;  		
    	}
    	else if(playerChoice == SCISSORS && computerChoice == ROCK){
    		System.out.println("\nROCK breaks SCISSORS. I win.");
    		return 3;   		
    	}
    	else if(playerChoice == SCISSORS && computerChoice == PAPER){
    		System.out.println("\nSCISSORS cut PAPER. You win.");
    		return 2;   		
    	}
    	else{
    		System.out.println("\nWe picked the same thing! This round is a draw.");
    		return 1;
    	}	
    }
    
    //prints out the amount of times each player won a set
    //uses conditionals to determine who won the match
    public static void printResults(String name, int rounds, int drawCounter, int playerCounter, int computerCounter){
    	System.out.println("\n\nNumber of games of ROCK PAPER SCISSORS: " + rounds);
    	System.out.println("Number of times Computer won: " + computerCounter);
    	System.out.println("Number of times " + name + " won: " + playerCounter);
    	System.out.println("Number of draws: " + drawCounter);
    	
    	if(playerCounter == computerCounter){
    		System.out.print("We are evenly matched.");
    	}
    	else if(playerCounter > computerCounter){
    		System.out.print("You, " + name + ", are a winner.");
    	}
    	else{
    		System.out.print("I, Computer, am a master.");
    	}
    }
}