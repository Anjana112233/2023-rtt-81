package pa303_7_1array;

public class Task1 {
	//Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes.
	//Print out each array element.
	public static void main(String[] args) {
		//create an array of integers with length 3
		int[] myArray = new int[3];
		
		//Assign values to the array elements
		myArray[0] = 1;
		myArray[1] = 2;
		myArray[2] = 3;
		
		//print out each array element
		System.out.println("Element at index 0: "+ myArray[0]);
		System.out.println("Element at index 1: "+ myArray[1]);
		System.out.println("Element at index 2: "+ myArray[2]);
		
	}


}
