package drawingV3;

public class Test {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.addObject(new Circle(5));
		drawing.addObject(new Rectangle(5,6));
		drawing.addObject(new Circle(8));
		drawing.addObject(new Rectangle(8,6));
		drawing.addObject(new Square(4));

		System.out.println(drawing.calculateTotalArea());

	}

}
