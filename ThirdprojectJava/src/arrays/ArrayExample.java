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
		
		//write a for loop that tells me how many values are not null
		//this is using an old style for loop with an array location
		int notNullCount = 0;
		for (int pos = 0; pos < stringArray.length; pos++) {
			if (stringArray[pos] != null) {
				notNullCount = notNullCount + 1;
			}
		}
		System.out.println("Number of null values in array is " + notNullCount);
		//same solution with an enhanced for loop -- this is little bit simpler
		// with the enchanced for loop you are not able to get the position of the value in the array
		
		int notNullCountEnhanced = 0;
		for (String value : stringArray) {
			if (value != null) {
				notNullCountEnhanced = notNullCountEnhanced + 1;
			}
		}System.out.println("Number of values in array is " + notNullCountEnhanced);
		
		// write a for loop for final position
		int lastNullPositionReverse = -1;
		for (int pos = stringArray.length - 1; pos >= 0; pos--) {
			if (stringArray[pos] == null) {
				lastNullPositionReverse = pos;
				break;
			}
		}
		if (lastNullPositionReverse == -1) {
			System.out.println("The array does not have a null");
		} else {
				System.out.println("The last null of the array is in position" + lastNullPositionReverse);
				
				//loop over the array and count the number of letter that are not vowels
				int numberOfLetters = 0;
				String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
						//using an enhanced loop and much less code
						String vowels = "aeiou";
								int numberOfLettersEnhanced = 0;
						for (String letter : letters.split(",")) {
							if (!vowels.contains(letter)) {
								numberOfLettersEnhanced = numberOfLettersEnhanced + 1;
								
							}
						}
						System.out.println("Number of letters enhanced = "+ numberOfLettersEnhanced);
		}
		}
	}


