
public class LoopArray {

	public static void main(String[] args) {
		int[] values = {4, 5, 7, 2};
		
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}

		System.out.println();
		
		for (int i = values.length -1; i>=0; i--) {
			System.out.print(values[i] + " ");
		}

		
	}

}
