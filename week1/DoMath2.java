
public class DoMath2 {
	public static void main(String[] args){
		System.out.println(square(3));
		add(square(3),7);
	}
	
	public static void add(int a, int b){
		System.out.println(a + b);
	}
	
	public static int square(int a){
		return a*a;
	}
	
}
