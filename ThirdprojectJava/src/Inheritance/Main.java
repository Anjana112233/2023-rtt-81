package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setName("Rectangle");
		rect.setHeight(10);
		rect.setWidth(5);

		Circle circle = new Circle();
		circle.setName("Circle");
		circle.setDiameter(100);

		List<Shape> shapes = new ArrayList<>();
		shapes.add(rect);
		shapes.add(circle);
		
		for ( Shape shape : shapes ) {
			System.out.println("The area for shape " + shape.getName() + " is " + shape.calculateArea());
		}
	}

}
