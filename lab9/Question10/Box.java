package Question10;
public class Box extends Rectangle {
    int height;

    public Box(int width, int length, int height) {
        super(width, length);
        this.height = height;
    }

    public double area() {
        return 2 * height * super.area() + 2 * length * height + 2 * width * height;
    }

    public double volume() {
        return super.area() * height;
    }
}