import java.util.Scanner;

//This class is a replica of the other ConnectFour, minus the interactive JFrame but with better efficiency in finding if the player wins
public class ConnectFour {
	public static final int ROW_LENGTH = 6;
	public static final int COLUMN_LENGTH = 7;
	public static final int CONNECT_AMOUNT = 4;
	
    public static void main(String[] args) {
    	//Set the counter that records whether or not the amount of turns = 42
    	//Set the win condition to false and make it turn to true whenever a connect 4 happens
    	//Print out intro
    	//Use a method to obtain both names of the players, and have the first used initially with the red piece "r"
    	//Create board and set up the board with a method
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        boolean win = false;
    	intro();
        String[] names = getNames(sc);
        String player = names[0], piece = "r";
        String[][] board = new String[ROW_LENGTH][COLUMN_LENGTH];
        setBoard(board);
        //Print out current board, set the player and piece based on counter even/odd
        //Call method that drops a piece
        //Call method that edits the board and checks for win
        while(win == false){
        	System.out.println("\nCurrent Board\n1 2 3 4 5 6 7  column numbers");
        	printBoard(board);
        	player = names[0];
        	piece = "r";
        	if(counter % 2 == 1){
        		player = names[1];
        		piece = "b";
        	}
        	int drop = stateTurn(player, piece, sc) - 1;
        	win = changeBoard(board, drop, piece, sc, player);
        	counter++;
        	if(counter == 42){
        		System.out.println("\nThe game is a draw.");
        		win = true;
        	}
        }
        //display wins if not a draw
        if(counter != 42){
        	System.out.println("\n" + player + " wins!!");
            System.out.println("\nFinal Board\n1 2 3 4 5 6 7  column numbers");
            printBoard(board);
        }
    }
    
    // show the intro
    public static void intro() {
    	System.out.println("This is a game of Connect Four. Each player takes turns dropping a checker into one of the columns in the board (labeled 1 to 7).");
    	System.out.println("The first player to get four checkers in a row horizontally, vertically, or diagonally wins the game.");
    	System.out.println("The first player's checkers will appear as r's and the second player's checkers will appear as b's.\n");
    }
    
    //Obtain the two player names and return an array of them
    public static String[] getNames(Scanner sc){
    	System.out.print("Player 1 enter your name: ");
    	String first = sc.nextLine();
    	System.out.print("Player 2 enter your name: ");
    	String second = sc.nextLine();
    	return new String[]{first, second};
    }
    
    //Initial board setup
    public static void setBoard(String[][] board){
    	for(int i = 0; i < ROW_LENGTH; i++){
    		for(int j = 0; j < COLUMN_LENGTH; j++){
    			board[i][j] = ".";
    		}
    	}
    }
    
    //Print out the board
    public static void printBoard(String[][] board){
    	for(int i = 0; i < ROW_LENGTH; i++){
    		for(int j = 0; j < COLUMN_LENGTH; j++){
    			System.out.print(board[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
    
    //State the current turn and call the method that obtains the column to drop piece
    public static int stateTurn(String player, String piece, Scanner sc){
    	System.out.println("\n" + player + " it is your turn.");
    	System.out.println("Your pieces are the " + piece + "'s.");
    	return turn(player, sc);
    }
    
    //First, obtain an integer result by calling a different method
    //Then, if the integer is not between 1 and 7 inclusive, repeat till the response is an integer and between 1 and 7 inclusive
    public static int turn(String player, Scanner sc){
    	String prompt = player + ", enter the column to drop your checker: ";
    	System.out.print(prompt);
    	int result = getInt(sc, prompt);
    	while(!(result > 0 && result < 8)){
    		System.out.println("\n" + result + " is not a valid column.");
    		System.out.print(prompt);
    		result = getInt(sc, prompt);
    	}
    	return result;
    }
    
    // prompt the user for an int. The String prompt will
    // be printed out. I expect key is connected to System.in.
    public static int getInt(Scanner key, String prompt) {
    	while(!key.hasNextInt()) {
            String notAnInt = key.nextLine();
            System.out.println("\n" + notAnInt + " is not an integer.");
            System.out.print(prompt);
        }
        int result = key.nextInt();
        key.nextLine();
        return result;
    }
    
    
    //Change the one space in which the piece will be dropped into and check if there is a win
    //If not, check if the column is full
    public static boolean changeBoard(String[][] board, int column, String change, Scanner sc, String name){
    	for(int i = ROW_LENGTH - 1; i >= 0; i--){
    		String current = board[i][column];
    		if(!(current.equals("r") || current.equals("b")) && !current.equals(change)){
    			board[i][column] = change;
    			if(verticalWin(i, board, change, column) || horizontalWin(i, board, change, column) || leftDiagonalWin(i, board, change, column) || rightDiagonalWin(i, board, change, column)){
    				return true;
    			}
    			change = ".";
    		}
    	}
    	checkFilled(board, column, change, sc, name);
    	return false;
    }
    
    //If the column is filled, tell the user to input a different number
    public static void checkFilled(String[][] board, int column, String change, Scanner sc, String name){
    	if(!change.equals(".")){
			column = column + 1;
			System.out.println("\n" + column + " is not a legal column. That column is full");
			column = turn(name, sc) - 1;
			changeBoard(board, column, change, sc, name);
		}
    }
    
    //Checks if there are 4 in a row vertically
    //If the row initially has only 3 columns, then the counter will stay at 1
    //If the row isn't the first row, the row will increment by 1
    public static boolean verticalWin(int row, String[][] board, String change, int column){
    	int counter = 0;
    	int originalRow = row, currentRow = originalRow;
    	String location = board[originalRow][column];    	
    	for(int i = 0; i <= CONNECT_AMOUNT; i++){
    		if(originalRow != currentRow || i != 0){
        		if(originalRow > 2){
        			counter = 1;
        		}
        		else if(location.equals(change)){
        			counter++;
        			if(currentRow != 5){
        				currentRow = originalRow + i;
        				location = board[currentRow][column];
            		}
        		}
    		}
    	}
    	return counter == CONNECT_AMOUNT;
    }
    
    //Checks if there are 4 in a row horizontally
    //Will start from the far left, check 4 in a row, then start from the next column on the right, then repeat
    //Once there are 4 in a row located, return true but otherwise, continue until all have been checked
    public static boolean horizontalWin(int row, String[][] board, String change, int column){	
    	for(int i = 0; i < CONNECT_AMOUNT; i++){
    		int counter = 0, firstColumn = i, previousColumn = -1;
    		String location = board[row][firstColumn];
    		while(location.equals(change) && firstColumn != previousColumn){
    			counter++;
    			if(counter == CONNECT_AMOUNT){
        			return true;
        		}
    			previousColumn = firstColumn;
    			firstColumn++;
    			if(firstColumn < 7){
    				location = board[row][firstColumn];
    			}
    		}
    	}
    	return false;
    }
	
    //Checks if there are 4 in a row from upper left to lower right in the first 4 rows
    //Increments both row and column
    //Only uses the top 3 rows
    //Whenever the piece hits an edge, the while loop stops
    public static boolean leftDiagonalWin(int row, String[][] board, String change, int column){
    	for(int j = 0; j < 3; j++){
    		for(int i = 0; i < CONNECT_AMOUNT; i++){
    			boolean repeat = false;
    			int iCounter = j, currentColumn = i, counter = 0; 
    			int stop = iCounter + CONNECT_AMOUNT;
    			String location = board[iCounter][currentColumn];
    			while(iCounter < stop && repeat == false){
    				if(location.equals(change)){
    					counter++;
    					if(counter == CONNECT_AMOUNT){
    						return true;
    					}
    				}
    				currentColumn++;
    				iCounter++;
    				if(iCounter == 6 || currentColumn == -1 || currentColumn == 7){
    					repeat = true;
    					currentColumn--;
    					iCounter--;
    				}
    				location = board[iCounter][currentColumn];
    			}
    		}
    	}
    	return false;
    }
    
    //Checks if there are 4 in a row from upper right to lower left in the last 4 rows
    //Increments row and decrements column
    //Only uses the top 3 rows
    //Whenever the piece hits an edge, the while loop stops
    public static boolean rightDiagonalWin(int row, String[][] board, String change, int column){
    	for(int j = 0; j < 3; j++){
    		for(int i = 7; i > 3; i--){
    			boolean repeat = false;
    			int iCounter = j, currentColumn = i - 1, counter = 0; 
    			int stop = iCounter + CONNECT_AMOUNT;
    			String location = board[iCounter][currentColumn];
    			while(iCounter < stop && repeat == false){
    				if(location.equals(change)){
    					counter++;
    					if(counter == CONNECT_AMOUNT){
    						return true;
    					}
    				}
    				currentColumn--;
    				iCounter++;
    				if(iCounter == 6 || currentColumn == -1 || currentColumn == 7){
    					repeat = true;
    					currentColumn++;
    					iCounter--;
    				}
    				location = board[iCounter][currentColumn];
    			}
    		}
    	}
    	return false;
    }
}