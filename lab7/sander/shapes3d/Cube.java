package sander.shapes3d;

import sander.shapes.Square;

public class Cube extends Square {

	public Cube() {
		super(5);
		System.out.println("Cube is being create");
	}
	public double area() {
		return 6* super.area() ;
	}
	public double volume() {
		return super.area() * side ;
	}
	public String toString() {
		return "side = " + side  ;
	}
}
