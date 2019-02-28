public class Int2Bin {
    public static void main(String[] args){
        int sander=Integer.parseInt(args[1]);
        System.out.println(Int2Bin(sander));
    }

    public static String Int2Bin(int number) {
        if((number==0) || (number==1)) 
            return number +"";
        return Int2Bin(number/2)+(number%2);
    }
}
