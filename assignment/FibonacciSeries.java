package week1.day2.assignment;



public class FibonacciSeries {

	public static void main(String[] args) {
		// the result of third number/ variable is the sum of previous two numbers
		//initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range =8, firstNum = 0, secNum =1, sum=0;
		System.out.print("Fibonacci Series for the given range is ");
		System.out.print(firstNum);
		System.out.print(" "+secNum);
		for (int i = 1; i < range; i++) {
			// add first and second number assign to sum
			sum = firstNum + secNum;
			// Assign second number to the first number
			firstNum = secNum;
			// Assign sum to the second number
			secNum = sum;
			// print sum
			System.out.print(" ");
			System.out.print(sum);
		}

	}
}

//public class FibonacciSeries {

/*
 * Goal: To find Fibonacci Series for a given range
 * 
 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
 * 
 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
 * enter
 * 
 * What are my learnings from this code? 1) 2) 3)
 * 
 */

//public static void main(String[] args) {
//
//	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
//
//	// Print first number
//	
//	// Iterate from 1 to the range
//	
//	// add first and second number assign to sum
//
//	// Assign second number to the first number
//
//	// Assign sum to the second number
//	
//	// print sum
//
//}
//
//}