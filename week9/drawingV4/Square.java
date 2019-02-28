package drawingV4;

public class Square extends Shape{

	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	public double area() {
		return side * side;
	}
	
	public void draw() {
		System.out.println("Drawing Square with side: " + side );
	}	
}
