package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
	List<Product> products = new ArrayList<>();
	List<Product> order = new ArrayList<>();
	
	Scanner input = new Scanner(System.in);
	
	public void setupProducts() {
		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		products.add(coffee);
		
		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(4.33);
		products.add(tea);
		
		Product cookie = new Product();
		cookie.setName("Cookie");
		cookie.setPrice(6.77);
		products.add(cookie);
		printAllproducts();
		
		
		printProduct(coffee);
		printProduct(tea);
		printProduct(cookie);
		
		Product sandwich = new Product();
		sandwich.setName("Chicken & cheese salad");
		sandwich.setPrice(18.42);
		products.add(sandwich);
		
	}
	
	public void printProduct(Product product) {
		System.out.println("Product name: " + product.getName() + " \tPrice: $" + product.getPrice());
	
		}
	public void printAllproducts() {
		for (Product product : products) {
			printProduct(product);
		}
	}
	public void printOrders() {
		for(Product product : order) {
			printProduct(product);
			
		}
	}
	public void example() {
		// the value of each product is the price
				double coffee = 5.43d;
				double tea = 4.33d;
				double cookie = 6.76d;
				double subTotal = 0;
				//3 items of first product
				subTotal = coffee * 3;
				 //4 items of the 2nd product
				subTotal = subTotal + (tea * 4);
				
				//2 items of the 3rd product
				subTotal = subTotal + (cookie * 2);
				
				//Display result
				
				//System.out.println("Subtotal : " + subTotal);
				
				DecimalFormat df = new DecimalFormat("$#,###.00");
				System.out.println("Subtotal\t" + df.format(subTotal));
				
				double salesTax = subTotal * 0.10;
				System.out.println("Sales Tax\t" + df.format(salesTax));
				
				double totalSale = subTotal + salesTax;
				System.out.println("Total\t\t"+ df.format(totalSale));
				
		
	} 
	public int displayMainUserMenu() {
		System.out.println("1) Print the menu itens and prices");
		System.out.println("2) Add an iten to your order");
		System.out.println("3) Print the item in your order");
		System.out.println("4) Checkout");
		
		System.out.println("What do you want to do?");
		int select = input.nextInt();
		input.nextLine();
		return select;
		
	}
	public void userSelectProduct() {
		System.out.println("Enter product name to order: ");
		String orderSelection = input.nextLine();
		
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(orderSelection)) {
				order.add(product);
				System.out.println("Added " + product.getName() + "to your order.");
			}
		}
	}
	
	public static void main(String[] args) {
		CoffeeShop cf = new CoffeeShop();
		cf.setupProducts();
		
		while (true) {
			
		int userSelection = cf.displayMainUserMenu();
		if (userSelection == 1) {
			cf.printAllproducts();
		}else if (userSelection == 2) {
			cf.userSelectProduct();
		}else if (userSelection == 3) {
			cf.printOrders();
		}else if (userSelection == 5) {
			System.exit(0);
		}
		else {
			System.out.println("User input " + userSelection + " is unknown. Try again.");
		}
		
		
	}
	}
}



