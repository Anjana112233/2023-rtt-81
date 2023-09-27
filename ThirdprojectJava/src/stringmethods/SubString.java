package stringmethods;

public class SubString {
	public static void main(String[] args) {
		// ---------------012345678901234
		String string = "This is a string";

		// substring with a start and an end
		String sub = string.substring(5, 7);
		System.out.println(sub);

		// substring with just a start
		String sub1 = string.substring(5);
		System.out.println(sub1);

		String filename = "someimage.jpg";

		int lastDot = filename.lastIndexOf(" . ");
		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		System.out.println(ext);

		// ------------01234567890
		String name = "Eric Heilig";

		int spacePosition = name.indexOf(" ");
		String firstname = name.substring(0, spacePosition);
		System.out.println(firstname);

		String lastname = name.substring(name.indexOf(" ") + 1);
		System.out.println(lastname);
		
		// find the position of the first space in the string
		//------------------------012345678901234567
				String example = "This is an example";
				
				// find the position of the last space in the string
				int lastSpaceIndex = example.lastIndexOf(" ");
				
				// check if a space was found
				if (lastSpaceIndex != -1) {
					System.out.println("Position of the last space : " + lastSpaceIndex);
				}
				else {
					System.out.println("No space found in the spring");
				}
				
				
				// substring of the characters between the first and last space of the string
				
				
				// do the same thing to find the substring of the first and last vowel of the string
			
				
				// use the string.charAt function and use a for loop to loop over the entire string
				// and print out each character with a new line after it.
				// you need to use the string.length() function also
				
				// using only indexOf(" ") print the substring that contains the word "is"
				// use 2 substrings to do this.
				

	}

}
