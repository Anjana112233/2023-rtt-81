package praticelabbeforesab;

import java.io.IOException;

class Result {

	    public static int getDigitsSum(int largeNumber) {
	        // Initialize the sum to 0
	        int sum = 0;

	        // Convert the integer to a string
	        String numberStr = String.valueOf(largeNumber);

	        // Iterate through each character of the string
	        for (char digitChar : numberStr.toCharArray()) {
	            // Convert the character to its numeric value and add it to the sum
	            int digitValue = Character.getNumericValue(digitChar);
	            sum += digitValue;
	        }

	        // Return the sum of all single digits
	        return sum;
	        
	       





	    }
	}
	
	


