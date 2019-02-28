
public class OperatorPrecedence {

	public static void main(String[] args) {
	
		int x = 6;		
		{	
			if (true) {
				x = 5;
			}
			System.out.println(x);
		}
		x = test(x);
		System.out.println(x);
		
	}
	
	public static int test(int a) {
		a = 10;
		System.out.println(a);
		return a;
	}

}
