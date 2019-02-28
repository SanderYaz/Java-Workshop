
public class RecursionDemo {

	public static void main(String[] args) {
		
		int result = factorial(5);
		
		System.out.println(result);
		
		System.out.println(sum(10));

		System.out.println(fibonacci(5));
	}

	private static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
		
	}

	
	private static int sum(int n) {
		if (n == 0)
			return 0;
		return n + sum(n - 1);
		
	}
	
	private static int fibonacci(int n) {
		if ((n == 0) || (n == 1))
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);		
	}	
}
