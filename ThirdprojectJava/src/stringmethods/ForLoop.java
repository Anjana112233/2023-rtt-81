package stringmethods;

public class ForLoop {
	public static void main(String[] args) {
		int sum = 0;
		int n = 1000;
		// for loop
		for (int i = 1; i <= n; ++i) {

			// body inside for loop
			sum += i;

		}
		System.out.println("Sum = " + sum);
	}

}
