import java.util.Scanner;

//This class outputs the amount of flu cases in each state
import java.io.*;
public class ResultsOutput{
	public static void main(String[] args) throws IOException{	
		Scanner inorganizer = new Scanner(new File("dropORGANIZERcoordinates.txt"));
		
		String line;
		double latitude, longitude;
		int totalcounter = 0;
		
		int alabama = 0, alaska = 0, arizona = 0, arkansas = 0;
		int california = 0, colorado = 0, connecticut = 0;
		int delaware = 0, florida = 0, georgia = 0, hawaii = 0;
		int idaho = 0, illinois = 0, indiana = 0, iowa = 0;
		int kansas = 0, kentucky = 0, louisiana = 0;
		int maine = 0, maryland = 0, massachusetts = 0, michigan = 0;
		int minnesota = 0, mississippi = 0, missouri = 0, montana = 0;
		int nebraska = 0, nevada = 0, newhampshire = 0, newjersey = 0;
		int newmexico = 0, newyork = 0, northcarolina = 0, northdakota = 0;
		int ohio = 0, oklahoma = 0, oregon = 0;
		int pennsylvania = 0, rhodeisland = 0, southcarolina = 0, southdakota = 0;
		int tennessee = 0, texas = 0, utah = 0;
		int vermont = 0, virginia = 0, washington = 0, westvirginia = 0, wisconsin = 0, wyoming = 0;
	 	
		while(inorganizer.hasNext()){
			line = inorganizer.nextLine();
			String[] s = line.split("\\s+");
			longitude = Double.parseDouble(s[0]);
			latitude = Double.parseDouble(s[1]);
	
			if((longitude < -84.51 && longitude > -88.28) && (latitude < 35.00 && latitude > 30.13)){
				alabama++;
			}
			else if((longitude < -130.00 && longitude > -173.00) && (latitude < 71.50 && latitude > 54.40)){
				alaska++;
			}
			else if((longitude < -109.30 && longitude > -114.50) && (latitude < 37.00 && latitude > 31.20)){
				arizona++;
			}
			else if((longitude < -89.41 && longitude > -94.42) && (latitude < 36.30 && latitude > 33.00)){
				arkansas++;
			}
			else if((longitude < -114.80 && longitude > -124.24) && (latitude < 42.00 && latitude > 32.30)){
				california++;
			}
			else if((longitude < -102.00 && longitude > -109.00) && (latitude < 41.00 && latitude > 37.00)){
				colorado++;
			}
			else if((longitude < -71.47 && longitude > -73.44) && (latitude < 42.30 && latitude > 40.58)){
				connecticut++;
			}
			else if((longitude < -75.20 && longitude > -75.47) && (latitude < 39.50 && latitude > 38.27)){
				delaware++;
			}
			else if((longitude < -79.48 && longitude > -87.38) && (latitude < 31.00 && latitude > 24.30)){
				florida++;
			}
			else if((longitude < -81.00 && longitude > -85.53) && (latitude < 35.00 && latitude > 30.31)){
				georgia++;
			}
			else if((longitude < -154.40 && longitude > -162.00) && (latitude < 23.00 && latitude > 16.55)){
				hawaii++;
			}
			else if((longitude < -111.00 && longitude > -117.00) && (latitude < 49.00 && latitude > 42.00)){
				idaho++;
			}
			else if((longitude < -87.30 && longitude > -91.30) && (latitude < 42.30 && latitude > 36.58)){
				illinois++;
			}
			else if((longitude < -84.49 && longitude > -88.40) && (latitude < 41.46 && latitude > 37.47)){
				indiana++;
			}
			else if((longitude < -89.50 && longitude > -96.31) && (latitude < 43.30 && latitude > 40.36)){
				iowa++;
			}
			else if((longitude < -94.38 && longitude > -102.10) && (latitude < 40.00 && latitude > 37.00)){
				kansas++;
			}
			else if((longitude < -81.58 && longitude > -89.34) && (latitude < 39.90 && latitude > 36.30)){
				kentucky++;
			}
			else if((longitude < -89.00 && longitude > -94.00) && (latitude < 33.00 && latitude > 29.00)){
				louisiana++;
			}
			else if((longitude < -66.57 && longitude > -71.7) && (latitude < 47.28 && latitude > 43.40)){
				maine++;
			}
			else if((longitude < -75.40 && longitude > -79.33) && (latitude < 39.43 && latitude > 37.53)){
				maryland++;
			}
			else if((longitude < -69.57 && longitude > -73.30) && (latitude < 42.53 && latitude > 41.10)){
				massachusetts++;
			}
			else if((longitude < -82.26 && longitude > -90.31) && (latitude < 47.30 && latitude > 41.41)){
				michigan++;
			}
			else if((longitude < -89.34 && longitude > -97.12) && (latitude < 49.23 && latitude > 43.34)){
				minnesota++;
			}
			else if((longitude < -88.70 && longitude > -91.41) && (latitude < 35.00 && latitude > 30.13)){
				mississippi++;
			}
			else if((longitude < -89.60 && longitude > -95.42) && (latitude < 40.35 && latitude > 36.00)){
				missouri++;
			}
			else if((longitude < -104.20 && longitude > -116.20) && (latitude < 49.00 && latitude > 44.26)){
				montana++;
			}
			else if((longitude < -95.25 && longitude > -104.00) && (latitude < 43.00 && latitude > 40.00)){
				nebraska++;
			}
			else if((longitude < -114.00 && longitude > -120.00) && (latitude < 42.00 && latitude > 35.00)){
				nevada++;
			}
			else if((longitude < -70.37 && longitude > -72.37) && (latitude < 45.18 && latitude > 42.40)){
				newhampshire++;
			}
			else if((longitude < -73.53 && longitude > -75.35) && (latitude < 41.21 && latitude > 38.55)){
				newjersey++;
			}
			else if((longitude < -103.00 && longitude > -109.00) && (latitude < 37.00 && latitude > 31.20)){
				newmexico++;
			}
			else if((longitude < -71.47 && longitude > -79.45) && (latitude < 45.00 && latitude > 40.29)){
				newyork++;
			}
			else if((longitude < -75.30 && longitude > -84.15) && (latitude < 36.21 && latitude > 34.00)){
				northcarolina++;
			}
			else if((longitude < -97.00 && longitude > -104.00) && (latitude < 49.00 && latitude > 45.55)){
				northdakota++;
			}
			else if((longitude < -80.32 && longitude > -84.49) && (latitude < 41.58 && latitude > 38.27)){
				ohio++;
			}
			else if((longitude < -94.29 && longitude > -103.00) && (latitude < 37.00 && latitude > 33.35)){
				oklahoma++;
			}
			else if((longitude < -116.45 && longitude > -124.30) && (latitude < 46.15 && latitude > 42.00)){
				oregon++;
			}
			else if((longitude < -74.43 && longitude > -80.31) && (latitude < 42.00 && latitude > 39.43)){
				pennsylvania++;
			}
			else if((longitude < -71.80 && longitude > -71.53) && (latitude < 42.10 && latitude > 41.18)){
				rhodeisland++;
			}
			else if((longitude < -78.30 && longitude > -83.20) && (latitude < 35.12 && latitude > 32.40)){
				southcarolina++;
			}
			else if((longitude < -98.28 && longitude > -104.30) && (latitude < 45.56 && latitude > 42.29)){
				southdakota++;
			}
			else if((longitude < -81.37 && longitude > -90.28) && (latitude < 36.41 && latitude > 35.00)){
				tennessee++;
			}
			else if((longitude < -93.31 && longitude > -106.38) && (latitude < 36.30 && latitude > 25.50)){
				texas++;
			}
			else if((longitude < -109.00 && longitude > -114.00) && (latitude < 42.00 && latitude > 37.00)){
				utah++;
			}	
			else if((longitude < -71.28 && longitude > -73.26) && (latitude < 45.00 && latitude > 42.44)){
				vermont++;
			}
			else if((longitude < -75.13 && longitude > -83.37) && (latitude < 39.37 && latitude > 36.31)){
				virginia++;
			}
			else if((longitude < -116.57 && longitude > -124.48) && (latitude < 49.00 && latitude > 45.32)){
				washington++;
			}
			else if((longitude < -77.40 && longitude > -82.40) && (latitude < 40.40 && latitude > 37.10)){
				westvirginia++;
			}
			else if((longitude < -86.49 && longitude > -92.54) && (latitude < 47.30 && latitude > 42.30)){
				wisconsin++;
			}
			else if((longitude < -104.30 && longitude > -111.30) && (latitude < 45.00 && latitude > 41.00)){
				wyoming++;
			}
			totalcounter++;
		}
		inorganizer.close();
		
		System.out.println();
		
		System.out.printf("Alabama:              %8s\n", alabama);
		System.out.printf("Alaska:               %8s\n", alaska);
		System.out.printf("Arizona:              %8s\n", arizona);
		System.out.printf("Arkansas:             %8s\n", arkansas);
		System.out.printf("California:           %8s\n", california);
		System.out.printf("Colorado:             %8s\n", colorado);
		System.out.printf("Connecticut:          %8s\n", connecticut);
		System.out.printf("Delaware:             %8s\n", delaware);
		System.out.printf("Florida:              %8s\n", florida);
		System.out.printf("Georgia:              %8s\n", georgia);
		System.out.printf("Hawaii:               %8s\n", hawaii);
		System.out.printf("Idaho:                %8s\n", idaho);
		System.out.printf("Illinois:             %8s\n", illinois);
		System.out.printf("Indiana:              %8s\n", indiana);
		System.out.printf("Iowa:                 %8s\n", iowa);
		System.out.printf("Kansas:               %8s\n", kansas);
		System.out.printf("Kentucky:             %8s\n", kentucky);
		System.out.printf("Louisiana:            %8s\n", louisiana);
		System.out.printf("Maine:                %8s\n", maine);
		System.out.printf("Maryland:             %8s\n", maryland);
		System.out.printf("Massachusetts:        %8s\n", massachusetts);
		System.out.printf("Michigan:             %8s\n", michigan);
		System.out.printf("Minnesota:            %8s\n", minnesota);
		System.out.printf("Mississippi:          %8s\n", mississippi);
		System.out.printf("Missouri:             %8s\n", missouri);
		System.out.printf("Montana:              %8s\n", montana);
		System.out.printf("Nebraska:             %8s\n", nebraska);
		System.out.printf("Nevada:               %8s\n", nevada);
		System.out.printf("New Hampshire:        %8s\n", newhampshire);
		System.out.printf("New Jersey:           %8s\n", newjersey);
		System.out.printf("New Mexico:           %8s\n", newmexico);
		System.out.printf("New York:             %8s\n", newyork);
		System.out.printf("North Carolina:       %8s\n", northcarolina);
		System.out.printf("North Dakota:         %8s\n", northdakota);
		System.out.printf("Ohio:                 %8s\n", ohio);
		System.out.printf("Oklahoma:             %8s\n", oklahoma);
		System.out.printf("Oregon:               %8s\n", oregon);
		System.out.printf("Pennsylvania:         %8s\n", pennsylvania);
		System.out.printf("Rhode Island:         %8s\n", rhodeisland);
		System.out.printf("South Carolina:       %8s\n", southcarolina);
		System.out.printf("South Dakota:         %8s\n", southdakota);
		System.out.printf("Tennessee:            %8s\n", tennessee);
		System.out.printf("Texas:                %8s\n", texas);
		System.out.printf("Utah:                 %8s\n", utah);
		System.out.printf("Vermont:              %8s\n", vermont);
		System.out.printf("Virginia:             %8s\n", virginia);
		System.out.printf("Washington:           %8s\n", washington);
		System.out.printf("West Virginia:        %8s\n", westvirginia);
		System.out.printf("Wisconsin:            %8s\n", wisconsin);
		System.out.printf("Wyoming:              %8s\n", wyoming);
		
		System.out.printf("Total Infected:         %6s\n", totalcounter);
	}
}