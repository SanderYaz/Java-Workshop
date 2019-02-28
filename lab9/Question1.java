public class Question1 {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int d = calculate(a++, ++b, c--);

        System.out.println("a= " + a + ", b= " + b + ", c= " + c + ", d= " + d);
    }

    private static int calculate(int c, int b, int a) {
        return a++ + ++b + c--;
    }

}