package sander.shapes3d;

import sander.shapes.Circle;

public class Cyclinder extends Circle {
		
	protected int height;
	
	public Cyclinder() {
			super(5);
			height = 10;
			System.out.println("Cyclinder is being create");
			}
	
	public Cyclinder(int r) {
		this(r, 10);
		System.out.println("Cyclinder is being create");
		}
	
	public Cyclinder(int r, int h ) {
		super(5);
		height = h;
		this.radius = r ;
		System.out.println("Cyclinder is being create");
		}
	public double area() {
		return 2*  super.area() + 2 * Math.PI * radius * height ;
	}
	public double volume() {
		return super.area() * height ;
	}
	public String toString() {
		return "radius = " + radius + " height = " + height ;
	}
} 
