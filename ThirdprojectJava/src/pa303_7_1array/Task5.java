package pa303_7_1array;

public class Task5 {
	public static void main(String[] args) {
	 // Create an integer array with a length of 5
    int[] myArray = new int[5];

    // Loop through the array and assign values
    for (int i = 0; i < myArray.length; i++) {
        myArray[i] = i;
    }

    // Print the updated array
    System.out.print("Updated Array: [");
    for (int i = 0; i < myArray.length; i++) {
        System.out.print(myArray[i]);
        if (i < myArray.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}
}





	


