
public class Circle {

	
	int radius;
	
	public Circle(int r ) {
		radius = r;
	}
	public double area() {
		return 3.14 * radius * radius;
		
	}
	public double perimeter(){
		return 2 * 3.14 * radius;
	}
}
