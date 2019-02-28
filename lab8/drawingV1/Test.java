package drawingV1;

public class Test {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.addCircle(new Circle(5));
		drawing.addRectangle(new Rectangle(5,6));
		drawing.addCircle(new Circle(8));
		drawing.addRectangle(new Rectangle(8,6));
		drawing.addSquare(new Square(4));
		System.out.println(drawing.calculateTotalArea());

	}

}
