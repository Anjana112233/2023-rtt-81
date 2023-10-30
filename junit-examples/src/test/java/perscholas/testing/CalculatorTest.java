package perscholas.testing;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
	/*@Test
	public void additionTest() {
		Calculator c = new Calculator();
		double expected = 10.0;
		
		double actual = c.add(5.0, 5.0);
		
		Assertions.assertEquals(expected,actual);
		
		Assertions.assertEquals(15.0, c.add(7.5,7.5));*/
	@ParameterizedTest
    @CsvSource({
            "5, 5, 10",
            "10, 10, 20",
            "5.5, 5.5, 11.0"
    })
	public void additionTest(double a, double b, double answer) {
Calculator c = new Calculator();
		
		double actual = c.add(a, b);
		
		Assertions.assertEquals(answer, actual);
	}
	  @ParameterizedTest
	    @CsvSource({
	            "5, 5, 12",
	            "10, 10, 20.5",
	            "5.5, 5.5, 12.0"
	    })
		public void additionErrorTest(double a, double b, double answer) {
			Calculator c = new Calculator();
			
			double actual = c.add(a, b);
			// we can change assertions .assertequals and not assertnotequals
			Assertions.assertNotEquals(answer, actual);
		}
	  @ParameterizedTest
	  @CsvSource({
		  "10, 5, 5"
		  
	  })
	  public void subtractionErrorTest(double a, double b, double answer) {
		  Calculator c = new Calculator();
		  double actual = c.subtract(a,  b);
		  Assertions.assertEquals(answer, actual);
	  }
	  
	
	/*@Test
	public void subtractionTest() {
		Calculator c = new Calculator();
		double expected = 0.0;
		
		double actual = c.subtract(5.0, 5.0);
		
		Assertions.assertEquals(expected,actual);
		
		Assertions.assertEquals(15.0, c.subtract(20.0, 5.0));
	}*/

}
