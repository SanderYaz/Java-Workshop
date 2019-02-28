package drawing;

public class Circle extends Shape{

	int radius;
	
	static final int PI = 3;
	
	public Circle() {
		radius = 5;
		color = "YELLOW";
	}

	public Circle(String col, int r) {
		radius = r;
		color = col;
	}

	public String toString() {
		return radius + " " + color;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.radius == ((Circle)obj).radius;
		
	}
	
	public double area() {

		return PI * radius * radius;
	}
	
}
