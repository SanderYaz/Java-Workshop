
public class UnaryDemo {

	public static void main(String[] args) {
		int value = 5;
		
		int a = value++;
		int b = ++value;
		System.out.println(value);
		System.out.println(a);
		System.out.println(b);
		
		int x = ++a + b++ + value++;
		System.out.println(x);
		System.out.println(value);
		System.out.println(a);
		System.out.println(b);

	}

}
