package stringmethods;

public class LengthDemo {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("Java".length());
		// one dash \ have no length
		System.out.println("Java\\n".length());
		System.out.println("Learn Java".length());
	}

}
