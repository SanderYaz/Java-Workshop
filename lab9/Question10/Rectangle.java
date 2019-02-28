package Question10;
public class Rectangle extends Shape {
    int width;
    int length;

    public Rectangle(int width, int length) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}