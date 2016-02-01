//This Patient class obtains the values of the line in the text file and has the Comparable, which organizes the data from smallest to largest
public class Patient implements Comparable<Patient>{
	private int id;
	private String num, longitude, latitude, date, flu;
	
	public Patient(int i){
		this.id = i;
	}
	
	public Patient(int id, String num, String longitude, String latitude, String date, String flu) {
		this.id = id;
		this.num = num;
		this.longitude = longitude;
		this.latitude = latitude;
		this.date = date;
		this.flu = flu;
	}
	
	public int getID(){
		return id;
	}
	public String getNum(){
		return num;
	}
	public String getLongitude(){
		return longitude;
	}
	public String getLatitude(){
		return latitude;
	}
	public String getDate(){
		return date;
	}
	public String getFlu(){
		return flu;
	}
	
	@Override
	//Compares the id's of the patients
	public int compareTo(Patient p2){
		if (this.id > p2.id)
			return 1;
		return -1;
	}
}
