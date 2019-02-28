
public class Triangle {

	private Point[] corners = new Point[3];
	
	
	public Triangle(Point point1, Point point2, Point point3) {
		if (isValidTriangle(point1, point2, point3)) {
			
		}
		corners[0] = point1;
		corners[1] = point2;
		corners[2] = point3;
	}


	public void move(int dx, int dy) {
		for(int i=0; i< corners.length; i++) {
			corners[i].move(dx, dy);
		}
	}
	
	public static boolean isValidTriangle(Point point1,
			Point point2, Point point3) {
		//corners[0] = null; can not access non static
		//
		if (point1.getXCoordinate() == point2.getXCoordinate() &&
				point1.getXCoordinate()== point3.getXCoordinate() &&
				point1.getYCoordinate() == point2.getYCoordinate() &&
				point1.getYCoordinate()== point3.getYCoordinate()) {
			return false;
		}
		return true;
	}
	
}
