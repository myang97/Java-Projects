import java.util.Scanner;
import java.io.*;

//This class obtains the original big data, and creates a new text file with the information that contains only the cases that are flu-positive
public class BigDataReader{
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("bigtweetdata.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter ("drop.txt"));
		String line;
		String time, tweetid;
		double latitude, longitude;
		int userid, flucounter = 0, totalcounter = 0, flu;
		
		//obtains the data, and finds all of the ones with a 1 (confirmation of the flu), then adds them to a different text file
		while(in.hasNext()){
			line = in.nextLine();
			String[] s = line.split("\\s+");
			tweetid = s[0];
			userid = Integer.parseInt(s[1]);
			longitude = Double.parseDouble(s[2]);
			latitude = Double.parseDouble(s[3]);
			flu = Integer.parseInt(s[4]);
			time = s[5];
	
			if(flu == 1){
				String temp = Integer.toString(userid);
				out.write(temp);
				out.write("     ");
				out.write("%11s".format(tweetid, System.getProperty("line.separator")));
				out.write("     ");
				out.write(String.format("%2.7f",longitude));
				out.write("     ");			
				out.write(String.format("%2.7f",latitude));
				out.write("     ");
				out.write("%30s".format(time, System.getProperty("line.separator")));
				out.write("     ");
				out.write(String.format("%1d",flu));
				out.newLine();
				flucounter++;
			}
			totalcounter++;
		}
		System.out.printf("Total Count of Data:                 %8s\n", totalcounter);
		System.out.printf("Total Count of Infected:             %8s\n", flucounter);
		in.close();
		out.close();
	}
}	
	
