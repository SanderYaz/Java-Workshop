package generics;

public class Exercise3 {
    public static void main(String[] args){
        System.out.printf("Maximum of %d, %d and %d is %d\n\n",
                3, 4, 5, max( 3, 4, 5 ));
        Integer a = (Integer) max(3,4,5);
        System.out.printf("Maximum of %.2f, %.2f and %.2f is %.2f\n\n",
                6.67, 8.89, 7.75, max( 6.67, 8.89, 7.75 ));
        System.out.printf("Maximum of %s, %s and %s is %s\n","pear",
                "apple", "orange", max("pear", "apple", "orange"));
        String str = max("pear", "apple", "orange");
    }

//    static Comparable max(Comparable x, Comparable y, Comparable z){
//        Comparable val = x;
//        if (y.compareTo(val) > 0){
//            val = y;
//        }
//        if (z.compareTo(val) > 0){
//            val = z;
//        }
//        return val;
//    }

    static <T extends Comparable<T>> T max(T x, T y, T z){
        T val = x;
        if (y.compareTo(val) > 0){
            val = y;
        }
        if (z.compareTo(val) > 0){
            val = z;
        }
        return val;
    }
}
