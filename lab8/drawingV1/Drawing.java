package drawingV1;

import java.util.ArrayList;

public class Drawing {
	private ArrayList<Circle> circles = new ArrayList<Circle>();
	private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	private ArrayList<Square> squares = new ArrayList<Square>();


	public double calculateTotalArea() {
		double totalArea = 0;
		for (Circle circle : circles) {
			totalArea += circle.area(); // totalArea = totalArea + circle.area();
		}
		for (Rectangle rect : rectangles) {
			totalArea += rect.area(); // totalArea = totalArea + circle.area();
		}
		for (Square square : squares) {
			totalArea += square.area(); // totalArea = totalArea + circle.area();
		}
		return totalArea;
	}
	
	public void addCircle(Circle circle) {
		circles.add(circle);
	}
	
	public void addRectangle(Rectangle rect) {
		rectangles.add(rect);
	}

	public void addSquare(Square square) {	squares.add(square); }


}
