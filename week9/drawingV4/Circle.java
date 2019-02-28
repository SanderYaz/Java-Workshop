package drawingV4;

public class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public void draw() {
		System.out.println("Drawing Circle with radius: " + radius );
	}
}
