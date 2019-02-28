
public class Drawing {

	Circle[] circles = new Circle[10];
	Triangle[] triangles = new Triangle[10];
	
	int circleCount = 0;
	int triangleCount = 0;
	
	public void addCircle(Circle circle) {
		if (circleCount < circles.length) {
			circles[circleCount] = circle;
			circleCount++;
		}
	}
	
	public void addTriangle(Triangle triangle) {
		if (triangleCount < triangles.length) {
			triangles[triangleCount] = triangle;
			triangleCount++;
		}
	}
}
