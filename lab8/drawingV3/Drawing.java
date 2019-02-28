package drawingV3;

import java.util.ArrayList;

public class Drawing  {
	private ArrayList<Shapes> shapes = new ArrayList<Shapes>();

	public double calculateTotalArea() {
		double totalArea = 0;
		for (Shapes obj : shapes){
            totalArea += obj.area(); // totalArea = totalArea + circle.area();
        }
		return totalArea;
	}

	public void addObject(Shapes obj) {
		shapes.add(obj);
	}

}
