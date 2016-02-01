import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

//This class obtains the edited big data text file, and creates a new text file with the duplicates eliminated and only the coordinates shown
public class BigDataReaderOrganizer{
	public static void main(String[] args) throws IOException{
		Scanner inagain = new Scanner(new File("drop.txt"));
		BufferedWriter outagain = new BufferedWriter(new FileWriter ("dropORGANIZERcoordinates.txt"));
		
		ArrayList<Patient> list = new ArrayList<Patient>();
		
		//adds all of the Patients to an arraylist
		while(inagain.hasNext()){
			String line = inagain.nextLine();
			String[] s = line.split("\\s+");
			list.add(new Patient(Integer.parseInt(s[0]),s[1],s[2],s[3],s[4],s[5]));
		}
		inagain.close();
		//Sorts the id's from least to greatest
		Collections.sort(list);
		
		//Eliminates any duplicates
		for(int i = 0; i < list.size()-1; i++){
	       while (list.get(i).getID() == list.get(i+1).getID()){
	               list.remove(i);
	       }
		}
		
		//Adds only the coordinates to the textfile
		for(int i=0; i<list.size(); i++){
			Patient temp = list.get(i);
			outagain.write(temp.getLongitude());
			outagain.write("     ");
			outagain.write(temp.getLatitude());
			outagain.write("     ");
			outagain.newLine();
		}
		outagain.close();
	}
}