
public class Point {

	private int xCoordinate;
	private int yCoordinate;
	
	static int count = 0;
	
	public Point() {
		this(0,0);

	}
	
	
	
	public void move(int dx, int dy) {
		xCoordinate += dx;
		yCoordinate += dy;
	}
	
	public int getXCoordinate() {
		return xCoordinate;
	}
	
	public int getYCoordinate() {
		return yCoordinate;
	}
	
	public Point(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		count++;
	}
}
