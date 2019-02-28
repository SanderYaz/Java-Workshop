
public class Test {

	public static void main(String[] args) {
		
		String str1 = "abc ";
		
		String str2 = new String("abc");
		
		System.out.println("str1: " + str1 +" str2: " +str2);
		
		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
		}
		
		
		int b = 5;
		int c = b;
		 c++;
		 
		 System.out.println(b +" " + c);
		
		Cat mom = new Cat();
		mom.name = "mom";
		
		Cat aCat = mom;
		
		aCat.name = "aCat";
		
		 System.out.println("mom's name " + mom.name);
		
		
		
		Cat[] kittens = mom.giveBirth();
		for (int i=0; i<5; i++) {
			kittens[i].name = "Cat " + i;
		}
		
		System.out.println(kittens[0].mom.name);
		
		int a = 5;
		int y = 5;
		
		boolean equals = a == y;
		System.out.println("a ==y " + equals);
		
		Point p1 = new Point(3,2);
		
		
		Point p2 = new Point(3,2);
		
		p2 = p1;
		
		p2.xCoord =5;
		
		System.out.println("p1. x " + p1.xCoord);
		
		equals = p1 == p2;
		System.out.println("p1 == p2 " + equals);
		
		System.out.println("coordinates of p2 " + p2.xCoord 
				+ ", "+ p2.yCoord);
		
		p2.move(3, 3);
		
		System.out.println("coordinates of p2 " + p2.xCoord 
				+ ", "+ p2.yCoord);
		
		System.out.println("distance from origin for p1 " + p1.distanceFromOrigin());

	}

}
