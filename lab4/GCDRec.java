public class GCDRec {
    public static void main(String[] args) {
        int x =Integer.parseInt(args[0]);
        int y =Integer.parseInt(args[1]);
        int gcd = findGCD(x, y);
        System.out.println(gcd);

    }

    private static int findGCD(int a, int b){
        if (b==0)
            return a;
        return findGCD(b,a%b);
    }
}
