package drawing;

public class Rectangle extends Shape{

	protected int sideA;
	int sideB;
	
	public Rectangle(String string, int i, int j) {
		color = string;
		sideA = i;
		sideB = j;
	}

	public String toString() {
		return sideA + " "+ sideB 
				+ " " + color;
	}
	
	
	
	protected int area() {
		return sideA * sideB;
	}
	
	
}
