package variables;

public class ConditionalOperators {
	public static void main (String[] args) {
		boolean conditionOne = true;
		boolean conditionTwo = true;
		
		//&& is and
		if (conditionOne && conditionTwo) {
			//do something only if both variables are true
			System.out.println("Both variables are true.");
			
		}
		// || is or
		if (conditionOne || conditionTwo) {
			//do something if one or the other or both variables are true
			System.out.println("Either or both of the variables are true");
		}
		//this is using mathematical operators
		int x = 10;
		if (x>3 && x<20) {
			System.out.println("x is between 3 and 20");
			
		}
		
		//odd vs even
		int y =4;
		if (y % 2 == 1) {
			System.out.println("This is a odd number");
			}
		else {
			System.out.println("This is an even number");
		}
	}

}
