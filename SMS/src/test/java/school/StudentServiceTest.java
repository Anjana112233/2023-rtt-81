package school;
import org.junit.jupiter.api.Test;

import jpa.service.StudentService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;


public class StudentServiceTest {
	  @Test
	    public void testValidStudent() {
	        StudentService validator = new StudentService();
	        //check condition for valid username and password
	        String email = "hluckham0@google.ru";
	        String password = "X1uZcoIh0dj";
	        
	        boolean actual = validator.validateStudent(email, password);
	        
	        // Add assertions to verify the expected outcome of the test
	        assertTrue(actual); //this should be true for a valid student
	    }
	
	

}
