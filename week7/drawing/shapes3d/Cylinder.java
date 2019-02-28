package drawing.shapes3d;

import drawing.shapes.Circle;

public class Cylinder extends Circle{

	//protected int radius; not recommended
	
	protected int height;
	
	public double area() {
		return 2 * super.area() 
				+ 2 *Math.PI * radius;
	}
	
	public double volume() {
		return super.area() * height;
	}
}
