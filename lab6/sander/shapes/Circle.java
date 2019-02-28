package sander.shapes;
import java.lang.Math; 
 
 
public class Circle {
 
    int radius ; 
    
    public Circle (int radius) {
        this.radius = radius ;
    }
 
    public double area() {
        return Math.PI*radius * radius ;
    }
 
}
