
public class Main {

	public static void main(String[] args) {
		Rectangle rectA = new Rectangle(5,6);
		/*rectA.sideA = 5;
		rectA.sideB = 6;
		*/
		System.out.println("Side A:" + rectA.sideA + " Side B:  " + rectA.sideB);
		
		int area = rectA.area();
		
		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + rectA.perimeter());
		
		
		Circle circ = null;
		circ = new Circle(10); 
		System.out.println("Radius: " + circ.radius);
		System.out.println("Area : " + circ.area());
		System.out.println("Perimeter : " + circ.perimeter());
		
		Rectangle[] rectangles = new Rectangle[5];
		rectangles[0] = rectA;
		rectangles[1] = new Rectangle(5,6);

		Rectangle rect = rectangles[0];
		rectangles[2] = rectangles[0];
		
		System.out.println(rect.area());
		
		if(rectangles[0] == rectangles[1]) {
			//this is false
		}
		if(rectangles[0] == rectangles[2]) {
			//this is true
		}
		
		if(rectA == rectangles[1]) {
			//this is true
		}
	}

}
