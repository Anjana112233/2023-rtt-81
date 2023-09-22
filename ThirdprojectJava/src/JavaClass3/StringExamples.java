package JavaClass3;

public class StringExamples {
	public static void main (String[] args) {
		String s1 = "welcome";
		String s2 = "Welcome";
		
		//this is actually a string in memory that 0 character and length of 0
		
		
		if ( s1.equalsIgnoreCase(s2) ) {
			System.out.println("The strings are equal");
		} else {
			System.out.println("The strings are not equal");
		}
		
		if ( s1.toLowerCase().equals(s2.toLowerCase())) {
			// this is the same as equalsIgnoreCase
		}
		
		String upper = s1.toUpperCase();
		String lower = s1.toLowerCase();

		
		// make all of the lowercase e into E
		String s = new String("welcome");
		s = s.replaceAll("e", "E");
		System.out.println(s);
		
	}
		
	}


