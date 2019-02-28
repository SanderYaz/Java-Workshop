package quiz2;

public class Question8 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception ex) {
			System.out.println("G");
		}
	}

	private static void method1() {
		System.out.print("A");
		try {
			method2();
		} catch (RuntimeException ex) {
			return;
		} catch (Exception ex) {
			System.out.println("D");
		} finally {
			System.out.print("E");
		}
		System.out.print("F");
	}

	private static void method2() {
		try {
			System.out.print("B");
			int a = 5 / 0;
		} catch (Exception ex) {
			throw ex;
		} finally {
			System.out.print("C");
		}
	}
}