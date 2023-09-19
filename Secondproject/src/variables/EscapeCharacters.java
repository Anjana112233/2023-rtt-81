package variables;

public class EscapeCharacters {
	public static void main(String[] args) {
		//this is an example of the tab escape character \t
		System.out.println("This is a tab character ->\t<-");
		
		//basic formatting with tabs
		System.out.println("1\tone\t\tcol3");
		System.out.println("10\tten\t\tcol3");
		System.out.println("100\tonehundred\tcol3");
		
		//this is an example of a new line character \n
		System.out.println("This is line 1. \nThis is line 2.");
		System.out.println("This is line 3.");
		System.out.println("This is line 4.");
		
		//what happens if I want to put just a\
		System.out.println("To get a slash to print we need 2 of them \\");
		
		//what happens if I want a " quote in my string
		System.out.println("This is a quote \" in a string ");
	}

}
