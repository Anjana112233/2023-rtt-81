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

	}

}
