package week1.day2.assignment;

public class ConvertNegativeNumberToPositiveNum {
	public static void main(String[] args) {
		//1
		int number = -40;
		//2
		if(number < 0) {
			System.out.println(number+" Number is Negative");
		}
		
		number = number*(-1);
		if(number>0)
		{
			System.out.println(number+" Number is Positive");
		}
		
	
		//using math abs function
		number = Math.abs(number);
		if(number>0)
		{
			System.out.println(number+" Number is Positive");
		}
		//3 convert the number to a positive number
		
	
		//4 after conversion

	
		
	
	}

	
}


/*
*Problem statement: Convert a negative number to positive number
 * Pseudocode: 
 * 
 * 1. Initialize an integer with a negative number like,
 * int number = -40;
 * 
 * 2. Check if the number is a negative number 
 * 
 * 
 * Hint : any number that is lesser than zero is a negative number 
 * 
 * 
 * 3. If so, convert the number to a positive number
 * 
 * 
 * 4. Print the converted positive number
 */