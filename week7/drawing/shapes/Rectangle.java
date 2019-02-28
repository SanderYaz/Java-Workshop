package drawing.shapes;

public class Rectangle extends Shape{

	protected int length;
	protected int width;

	public Rectangle() {
		super();
	}
	
	public Rectangle(int l, int w) {
		super();
		length = l;
		width = w;
	}
	
	public void setDimension(int l, int w) {
		length = l;
		width = w;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Rectangle) {
			Rectangle r2 =  (Rectangle)obj;
			return this.length == r2.length &&
					this.width == r2.width;
		}
		return false;
	}
	
	public  double area() {
		return length * width;
	}
}
