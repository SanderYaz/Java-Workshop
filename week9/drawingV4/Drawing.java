package drawingV4;

import java.util.ArrayList;

public class Drawing {
	private ArrayList<Drawable> drawables = new ArrayList<Drawable>();
	

	public void draw() {		
		for (Drawable d : drawables) {
			d.draw();
		}	

	}

	public double calculateTotalArea() {
		double totalArea = 0;
		for (Drawable d : drawables) {
			if (d instanceof Shape) {
				//Shape s = (Shape)d;
				totalArea += ((Shape)d).area(); // totalArea = totalArea + circle.area();
				
			}
		}

		return totalArea;
	}

	public void addDrawable(Drawable d) {
		drawables.add(d);
	}
	


}
