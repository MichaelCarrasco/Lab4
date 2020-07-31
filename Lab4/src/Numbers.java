import java.util.Arrays;
import java.util.Scanner;
public class Numbers {
		static int Larger(int array [], int number) {
		int nextLargestElement=0;
		for (int i=0;i<array.length;i++) {  //checks for the next largest element
			if(array[i]>number) { 
				nextLargestElement= array[i];
				break;
			}
			
		}
		return nextLargestElement;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = 0;
		int array[];
		System.out.print("Enter length of array: ");
		length = input.nextInt();
		array = new int[length]; //creates empty array of length(x)
		System.out.println("Enter numbers in array");
		for (int i=0;i<length;i++) {
			array[i]=input.nextInt(); //creates array with user inputs
			
		}
		Arrays.sort(array);
		array = Arrays.copyOf(array, array.length + 1); //creates new array with one more element
	    array[array.length - 1] = 2147483647;
	    for (int i=0;i<length;i++) {
	    	int nextLargestElement = Larger(array, array[i]); 
				System.out.println(array[i]+": "+nextLargestElement);
		
			
			
	    	
		
			}
	    input.close();
			
	 
	}
}


