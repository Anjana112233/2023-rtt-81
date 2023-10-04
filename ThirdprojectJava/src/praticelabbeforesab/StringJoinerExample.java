package praticelabbeforesab;

import java.util.StringJoiner;

public class StringJoinerExample {
	
	

	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",", "[", "]"); 

		joinNames.add("Java");
		joinNames.add("Python");
		joinNames.add("C Sharp");
		joinNames.add("Javascript");
				
		System.out.println(joinNames);
		
		//{Name:Tony:LastName,Strak}    this is it!  right here
				StringJoiner sj1 = new StringJoiner(":", "{", "}");
				StringJoiner sj2 = new StringJoiner(",", "[", "]");	
				sj1.add("Name").add("Tony");
				sj2.add("LastName").add("Stark");
				System.out.println(sj1.merge(sj2).toString());
	}

}
