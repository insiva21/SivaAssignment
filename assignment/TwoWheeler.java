package week1.day1.assignment;

public class TwoWheeler {
	//Declare Global Variable and assign value
	int noOfWheels = 2;
	short noOfMirrors =2;
	long chassisNumber = 202200001001L;
	boolean isPunctured = false;
	String bikeName = "Yamaha R15";
	double runningKM = 405555.5d;
	
	public static void main(String[] args) {
		
		//	create object for class TwoWheeler  and
		TwoWheeler tw = new TwoWheeler();
		// call all the variables inside main method and 
		//print the values.
		System.out.println("Two Wheeler has "+tw.noOfWheels+" wheels");
		System.out.println("Two Wheeler has "+tw.noOfMirrors+ " mirros");
		System.out.println("Two Wheeler's chasisNo is "+tw.chassisNumber);
		System.out.println("Is Two Wheeler punctured "+tw.isPunctured);
		System.out.println("Two Wheeler's Name"+tw.bikeName);
		System.out.println("Two Wheeler's running KM is "+tw.runningKM);
		
	}

}
