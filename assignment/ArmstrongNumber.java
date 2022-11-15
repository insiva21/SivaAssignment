package week1.day2.assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  input= 153;
		int original=input;
		int calculated=0,remainder,cube;
		while(original>0) {
			remainder = original%10;
			cube = (remainder*remainder*remainder);
			System.out.println(cube);
			calculated = calculated+cube;
			original = original/10;
		}
		System.out.println(calculated);
	
	if (input==calculated) {
		System.out.println(input+ " is an Armstrong number");

	}
	else {
		System.out.println(input+ " Number is not Armstrong");
	}
}
}
