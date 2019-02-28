package drawing;

public class Ball extends Circle {

	

	
	public Ball(String color, int r) {
		super(color, r);
	}

	public double volume() {
		return (4/3) * Math.PI * radius 
				* radius * radius;
	}
	
	
	public double area() {
		return 4 * Math.PI * radius 
				* radius ;
	}
}
