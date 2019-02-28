public class Question2 {
    public static int min(int a, int b, int c) {
        int min = a < b ? a : b;
        return min < c ? min : c;
    }

    public static void main(String[] args) {
        System.out.println(min(10, 18, 5));
    }
}