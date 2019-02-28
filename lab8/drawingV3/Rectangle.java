package drawingV3;

public class Rectangle extends Shapes{
	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return height * width;
	}
}
