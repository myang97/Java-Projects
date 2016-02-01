import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

//How to obtain all of the movie names from a text file to use for hangman
public class MovieList {

    private static final String DEFAULT_FILE_NAME = "HangmanMovies.txt";

    // simple phrase bank if we can't find the right file
    private static final String[] EMERGENCY_PHRASES = {"TITANIC", "THE_LORD_OF_THE_RINGS", "THE_AVENGERS", "EX_MACHINA", "DIARY_OF_A_WIMPY_KID"};

    private ArrayList<String> phrases;
    private int currentIndex;

    public MovieList() {
        this(DEFAULT_FILE_NAME);
    }
    
    //Create an arraylist of the strings of movies in the textfile, and shuffle up the arraylist
    public MovieList(String fileName) {
        phrases = new ArrayList<String>();
        currentIndex = -1;
        loadWords(fileName);
        Collections.shuffle(phrases);
    }

    //return the next phrase in the list
    public String getNextPhrase(){
        currentIndex = (currentIndex + 1) % phrases.size();
        return phrases.get(currentIndex);
    }

    //add all of the movie names into the arraylist
    private void loadWords(String fileName) {
        File f = new File(fileName);
        try{
            Scanner s = new Scanner(f);
            s.nextLine();
            while(s.hasNextLine()){
                String phrase = trim(s.nextLine().trim());
                phrases.add(phrase.toUpperCase());
            }
            s.close();
        }
        //add the strings listed at the top of this class into the arraylist
        catch(IOException e){
        	for(String phrase : EMERGENCY_PHRASES){
                phrases.add(phrase);
        	}
        }
        if(phrases.size() == 0)
        	for(String phrase : EMERGENCY_PHRASES){
                phrases.add(phrase);
        	}
    }

    //return a string that has all of the spaces changed to underscores
    private static String trim(String org) {
        String result = "";
        for(int i = 0; i < org.length(); i++){
            char ch = org.charAt(i);
            if(Character.isLetter(ch))
                result += ch;
            else if(ch == ' ')
                result += '_';
        }
        return result;
    }
}