
public class Circle {

	int radius;
	Point center;
	
	//int centerX   bad
	//int centerY  bad
	
	public Circle(Point c, int r) {
		center = c;
		radius = r;
	}
	
	public void move(int dx, int dy) {
		//center.xCoordinate += dx;  bad
		//center.yCoordinate += dy;  bad
		
		center.move(dx, dy);
		
	}
}
