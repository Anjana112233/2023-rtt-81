package variables;

public class JavaBasicsClass {
	public static void main(String[] args) {
		// declaring two integer variables
	int a =12;
	int b = 20;
	int add;
	//declaring two double variables
	double x =7;
	double y = 8;
	double sum;
	double subtract;
	double multiply;
	double divide;
	//declaring three variables
	double coffee = 5;
	double cappuccino= 7;
	double espresso = 6;
	double greentea = 4;
	double subtotal;
	double totalSale;
	double SALES_TAX = 0.4;
	
	//Assigning formula
	add = a + b;
	sum = x + y;
	subtract = x - y;
	multiply = x*y;
	divide = x/y;
	subtotal = coffee + cappuccino + espresso + greentea; 
	totalSale= subtotal + SALES_TAX;
	//Display result
	System.out.println("The sum of two number is: "+ add);
	System.out.println("The sum of two number is: "+ sum);
	System.out.println("The subtraction of two number is: "+ subtract);
	System.out.println("The multiplication of two number is: "+multiply);
	System.out.println("The division of two number is: "+divide);
	System.out.println("The subtotal of order is: "+subtotal);
	System.out.println("The total sale of the order is: "+totalSale);
		

}
}