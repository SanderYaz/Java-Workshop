package sander.main;
import sander.shapes.*;
import java.lang.Math;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<Circle>() ;
        Circle circle = new Circle(5) ;
        
        circles.add(circle) ;
        circles.add(new Circle(3)) ;
        circles.add(new Circle(4)) ;
        circles.add(new Circle(10)) ;
        for(int i = 0 ; i< circles.size() ; i++) {
            Circle  c = circles.get(i) ;
            System.out.println(c.area());
        }
            
        
        Square square = new Square(3) ;
    
        String str = "Hello" ;
            
    }
}
