
public class FindSecondMax {

	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]);
		int secondMax = max;
		
		//search for the secondmax
		for(int i =1; i < args.length; i++) {
			int next = Integer.parseInt(args[i]);
			if (next > max) {
				secondMax = max;
				max = next;
			}else if (next < max) {
				if (max == secondMax) {
					secondMax = next;
				}else if (next > secondMax) {
					secondMax = next;
				}	
			}
		}
		
		
		if(max == secondMax) {
			System.out.println("There is no Second Max");
		}else {
			System.out.println(secondMax);
		}

	}

}
