package drawingV4;

public class Rectangle extends Shape{
	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return height * width;
	}
	
	public void draw() {
		System.out.println("Drawing Rectangle with width and height: " 
	+ width + ", "  + height);
	}	
}
