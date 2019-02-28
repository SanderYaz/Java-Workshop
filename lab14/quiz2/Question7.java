package quiz2;

public class Question7 extends Exception {
	public static void main(String[] args) {
		try {
			aMethod();
		} catch (Exception e) {
			System.out.print("F");
		}
	}

	public static void aMethod() throws Exception {
		try {
			badMethod();
			System.out.print("A");
		} catch (RuntimeException ex) {
			System.out.print("B");
		} catch (Exception ex1) {
			System.out.print("C");
			throw new Exception(ex1);
		} finally {
			System.out.print("D");
		}
		System.out.print("E");
	}

	public static void badMethod() throws Question7 {
		throw new Question7();
	}
}