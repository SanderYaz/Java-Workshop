
public class Test {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();

		Point center = new Point(5, 6);
		Circle circle = new Circle(center, 7);

		drawing.addCircle(circle);

		if (Triangle.isValidTriangle(
				new Point(1, 6), new Point(3, 5), 
				new Point(4, 4))) {

			Triangle triangle = new Triangle(
					new Point(1, 6), new Point(3, 5), new Point(4, 4));

			//not wanted
			//triangle.corners[0] = new Point(1, 6);
					
			drawing.addTriangle(triangle);
		}
		System.out.print(center.count);

	}

}
