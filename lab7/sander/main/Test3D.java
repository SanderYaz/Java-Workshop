package sander.main;

import sander.shapes3d.Cube;
import sander.shapes3d.Cyclinder;

public class Test3D {
	
	public static void main(String[] args) {
		Cyclinder cyclinder = new Cyclinder(6, 10) ;
		System.out.println(cyclinder.toString());
		
		Cube cube = new Cube () ;
		System.out.println(cube.toString());
	}
}