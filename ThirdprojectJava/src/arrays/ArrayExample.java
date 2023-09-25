package arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int arraySize = 10;
		
		// this creates a new array of type double with 20 elements
		double[] doubleArray = new double[arraySize];
		
		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "Zero";
		
		for (int pos = 0; pos < arraySize; pos ++) {
			System.out.println("The value in position "+ pos + " is " + stringArray[pos]);
			
			
		}
		System.out.println("==========================");
		for (String value : stringArray) {
			System.out.println("The value = " + value);
		}
		System.out.println("==========================");
		
		//write a for loop that counts the number of nulls in the array
		//after the loop completes print that number
		
		int nullCount = 0;
		for (String value : stringArray) {
			if (value == null) {
				nullCount = nullCount + 1;
			}
		}System.out.println("Number of nulls is "+ nullCount);
		//write a for loop that tells me the location of the first null in the array
		
		int firstNull = -1;
		for (int pos = 0; pos <stringArray.length; pos++) {
			if (stringArray[pos] == null) {
				firstNull = pos;
				break;
			}
		}System.out.println("Position of the first null is "+ firstNull);
		
	}

}
