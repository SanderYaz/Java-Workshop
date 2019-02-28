package drawingV1;

public class Square {
    double side;

    public Square(double side){
        this.side = side;
    }

    public double area(){
        return side*side;
    }
}
