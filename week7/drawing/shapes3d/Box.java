package drawing.shapes3d;

import drawing.shapes.Rectangle;

public class Box extends Rectangle {

	protected int height;
	
	public Box() {
		super(5,6);
	}
	
	public void setDimension(int l, int w, int h) {
		super.setDimension(l, w);
		height = h;
		
	}
	
}
