import java.util.Scanner;

//This class utilizes switch case statemnts to figure out your weight on a planet (NOT PLUTO)
public class Planets{
	public static void main (String[]args){
		Scanner kb = new Scanner (System.in);

		//input
		System.out.print("Enter Weight: ");
		double myWeight = kb.nextDouble();

		System.out.print("Enter Planet: " +
							"\n 1. Mercury" +
							"\n 2. Venus" +
							"\n 3. Earth" +
							"\n 4. Mars" +
							"\n 5. Jupiter" +
							"\n 6. Saturn" +
							"\n 7. Uranus" +
							"\n 8. Neptune \n\n" );
		int myPlanet = kb.nextInt();
		double weight = 0;
		String planet = "Invalid";

		//case and switch statements calculate the weight on the planet chosen
		switch (myPlanet){
			case 1: weight = myWeight * .38;
					planet = "Mercury";
			break;
			case 2: weight = myWeight * .78;
					planet = "Venus";
			break;
			case 3: weight = myWeight * 1.00;
					planet = "Earth";
			break;
			case 4: weight = myWeight * .39;
					planet = "Mars";
			break;
			case 5: weight = myWeight * 2.65;
					planet = "Jupiter";
			break;
			case 6: weight = myWeight * 1.17;
					planet = "Saturn";
			break;
			case 7: weight = myWeight * 1.05;
					planet = "Uranus";
			break;
			case 8: weight = myWeight * 1.23;
					planet = "Neptune";
			break;
			default:   System.out.println ("not a valid planet");
		}

		//output
		System.out.println();
		System.out.printf("Original Weight on Earth: %8.2f\n", myWeight);
		System.out.println();
		System.out.printf("Planet traveled to:         %-20s\n", planet);
		System.out.println();
		System.out.printf("Weight on new Planet:     %8.2f\n", weight);
	}
}