package drawing;

public class Box extends Rectangle {

	
	
	int sideC;
	
	public Box(String color, int sideA, 
			int sideB, int sideC) {
		super(color, sideA, sideB);
		this.sideC = sideC;
	}


	//@Override
	protected int area() {		
		return 2 *(super.area() + 
				(sideA * sideC) + (sideB * sideC));
	}
	
	public int volume() {
		return super.area() * sideC;
	}
}
