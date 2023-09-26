package pa303_7_1array;

public class Task2 {
	public static void main(String[] args) {
	//Write a program that returns the middle element in an array. Give the following values to the integer array: 
	//{13, 5, 7, 68, 2} and produce the following output: 7
	
	int[] arr = {13, 5, 7, 68, 2};
	
	//calculate the index of the middle element
	int middleIndex = arr.length / 2;
	
	//Access the middle element
	int middleElement = arr[middleIndex];
	
	//print the middle element
	System.out.println("The middle element is : " + middleElement);

	
	}
}
