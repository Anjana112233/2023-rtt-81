package Inheritance;

public class Circle extends Shape {

	private double diameter;
	// this functionality is only for a circle
	// because rectangle do not have a diameter

	public double getRadius() {
		return diameter / 2;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double calculateArea() {
		return 3.14159 * getDiameter() * getDiameter();
	}

}
