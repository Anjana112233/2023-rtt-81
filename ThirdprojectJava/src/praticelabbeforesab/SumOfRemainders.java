package praticelabbeforesab;

public class SumOfRemainders {

	public static void main(String[] args) {

		// write a for loop that calculates the sum of the remainders of each number
		// divided
		// by 2 between 1 and 100

		int sumofReminders = 0;
		for (int i = 0; i <= 100; i++) {
			// calculate the remainder when divided by 2
			int remainder = i % 2;

			// Add the remainder to the sum
			sumofReminders = sumofReminders + remainder;
		}
		System.out.println(
				"The sum of the remainders of each numbers divided by 2 between 1 and 100 is: " + sumofReminders);

	}

}
