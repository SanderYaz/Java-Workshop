public class Question6{
    public static int function(int n) {
        if(n == 0 || n == 1 || n == 2)
        return 1;
        else
        return function(n - 1) + 2*function(n - 2) + function(n - 3);
    }
    public static void main(String[] args) {
        System.out.println(function(6));
    }
}