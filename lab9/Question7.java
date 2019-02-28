public class Question7{
    public static int powerN(int base,int pow){
        if (pow==0){
            return 1;
        }
        else{
            return base * powerN(base,pow-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(powerN(5, 2));
    }
}