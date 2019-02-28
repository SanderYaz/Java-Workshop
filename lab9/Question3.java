public class Question3{
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= 7; j++){ 
                if ( i < 5 && (j == 5 - i || j == 3 + i)){
                System.out.print("O");
                }
                else if (i >=5 && (j == i - 3 || j == 11 - i)){
                System.out.print("O");
                }
                else {
                System.out.print("X");
                }
            }
            System.out.println();
            
        }
    }
}