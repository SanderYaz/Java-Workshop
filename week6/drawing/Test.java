package drawing;

public class Test {

	public static void main(String[] args) {
		Rectangle r = new Rectangle("Green", 5, 6);
		
		Circle c = new Circle("Red",5);
		
		System.out.println(c.area());
		
		Ball b  = new Ball("Red",5);
		
		System.out.println(b.volume());
		
		System.out.println(b.area());
		
		
		System.out.println(c);
		
		
		Circle c2 = new Circle("Red",5);
		
		if (c2.equals(c)) {
			System.out.println("Same Radius");
		}
		
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		if (str != str2) {
			System.out.println("Different Objects");
		}
		
		if (str.equals(str2)) {
			System.out.println("Same Content");
		}
		
	}

}
