package week1.day1.assignment;

public class Mobile {
	//Declare Global Variable and  value
	String mobileBrandName = "Redmi";
	char mobileLogo = 'm';
	short noOfMobilePiece = 1;
	int modelNumber = 11;
	long mobileImeiNumber = 2022010178654121L;
	float mobilePrice = 13650.00f;
	boolean isDamaged = false;

	public static void main(String[] args) {
		//		create object for class Mobile and
		Mobile mob = new Mobile();
		// call all the variables inside main method and 
		//print the values.
		
		
		System.out.println("Mobile Brand Name is "+mob.mobileBrandName);
		System.out.println("Mobile Logo is "+mob.mobileLogo);
		System.out.println("No of Mobile piece is "+mob.noOfMobilePiece);
		System.out.println("Mobile Model Number "+mob.modelNumber);
		System.out.println("Mobile's IMEI No is "+mob.mobileImeiNumber);
		System.out.println("Mobile Pricce is "+mob.mobilePrice);
		System.out.println("Is Mobile Damaged "+mob.isDamaged);
		
		//Storing in a local variable
		String mobBrndName = mob.mobileBrandName;
		System.out.println("Mobile Brand Name is "+mobBrndName);
		

	}

}
