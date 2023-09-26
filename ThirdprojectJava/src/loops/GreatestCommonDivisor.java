package loops;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
/*		int n1 = readPositiveNumber(scanner);
		int n2 = readPositiveNumber(scanner);
		
		System.out.println("First number : " + n1);
		System.out.println("Second number : " + n2);
		
		public static int readPositiveNumber(Scanner scanner) {
			int number = -1;
			while (number <= 0) {
				System.out.println("Enter a positive integer greater than 0 : ");
				number = scanner.nextInt();
				
				if (number <= 0) {
					System.out.println("Error : must be a positive number");
				}
			}
			return number;  
		
		System.out.println("First number : " + n1);
		System.out.println("Second number : " + n2);
		
		
		
		int gcd = 1;
		int min = Math.min(n1,  n2);
		for (int k = 1; k <=min; k++) {
			if (n1 % k == 0) && (n2 % k == 0){
				gcd = k;
			}
		}
		*/
		
		System.out.println("Enter a positive integer: ");
		int n1 = scanner.nextInt();
		
		if (n1 < 0) {
			System.out.println("must be a positive number ");
			System.exit(1);
		}
		System.out.println("First number is : "+ n1);
		
		System.out.print("Enter another positive integer");
		int n2 = scanner.nextInt();
		
		if (n2 < 0) {
			System.out.println("must be a positive number");
			System.exit(1);
			
		}
		System.out.println("Second number is : " + n2);
		
		

}
}