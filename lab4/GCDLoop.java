public class GCDLoop {

        public static void main(String[] args) {
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[1]);
                int a = x;
                int b = y;

                int q = a/b;
                int r = a%b;

                while (r!=0)
                {
                        a=b;
                        b=r;
                        q=a/b;
                        r=a%b;
                }           

                System.out.println(b);
        }
}

