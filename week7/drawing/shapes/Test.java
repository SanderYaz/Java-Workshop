package drawing.shapes;

import drawing.shapes3d.Box;

public class Test {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,6);
		
		//Circle c = (Circle) r;
		
		Rectangle r2 = new Rectangle(5,6);
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		if(str1 != str2) {
			System.out.println("str1 and str2 are different objects");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1 and str2 have the same content");
		}
		
		
				
		if (r==r2) {
			System.out.println("r and r2 points to the same obj");
		}
		
		if (r.equals(r2)) {
			System.out.println("r and r2 have the same dimensions");
		}
		
		System.out.println(r.getClass());
		r.setDimension(10, 12);

		Object obj = new Box();
		
		Box b = (Box) obj;  
		b.setDimension(5, 7);
		b.setDimension(4, 5, 6);
		
		Shape shape = r;
		
		shape.area();  //returns area of rectangle
		
		Shape shape2 = b;
		
		shape2.area();  //returns area of box
		
		
	}

}
