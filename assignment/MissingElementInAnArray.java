package week1.day2.assignment;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				int sum1 = 0;
				for(int i=0;i<arr.length;i++) {		
					
					sum1 = sum1 +arr[i];
					
				}
				System.out.println("Sum of Elements in an Array is "+sum1);
				
				int sum2=0;
				for(int i=1;i<=arr.length+1;i++) {		
					
					sum2 = sum2 +i;
					
				}
				System.out.println("Sum of Elements in an Array is "+sum2);
				
				System.out.println("Missing Element in an Array is "+(sum2-sum1));
				
		// Sort the array	
		

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration

	}

}
