public class Question4 {
    public static void main(String[] args) {
        int i=1;
        while(i<=7){ 
            int j = 1;
            while (j <= 7) {
                if (i < 5 && (j == 5 - i || j == 3 + i)) {
                    System.out.print("O");
                } 
                else if (i >= 5 && (j == i - 3 || j == 11 - i)) {
                    System.out.print("O");
                } 
                else {
                    System.out.print("X");
                }
                j++;
            }
            i++;
            System.out.println();
        }
        
    }
}
    
