
public class Point {
	
	int xCoord;
	int yCoord;

	public Point() {
		System.out.println("Constructor is called");
	}
	
	
	public Point(int x, int y) {
		xCoord = x;
		yCoord = y;
		System.out.println("Constructor is called");
	}
	
	public void move(int xDistance, int yDistance) {
		xCoord += xDistance;
		yCoord += yDistance;
	}
	
	public double distanceFromOrigin() {
		return Math.sqrt(xCoord* xCoord + yCoord * yCoord);
	}
}
