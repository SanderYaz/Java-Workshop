package drawing.shapes;

public class Circle extends Shape{

	protected int radius;
	
	public double area() {
		return Math.PI * radius* radius;
	}
	
	
}
