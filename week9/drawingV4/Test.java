package drawingV4;

public class Test {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.addShape(new Circle(5));
		drawing.addShape(new Rectangle(5,6));
		drawing.addShape(new Circle(8));
		drawing.addShape(new Rectangle(8,6));
		//drawing.addShape("hello");
		drawing.addShape(new Square(4));
		
		System.out.println(drawing.calculateTotalArea());

		drawing.addText(new Text("Hello"));
		drawing.draw();
		
	}

}
