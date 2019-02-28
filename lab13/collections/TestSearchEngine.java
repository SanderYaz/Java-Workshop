package lab;
package collections;


import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class TestSearchEngine {

	public static void main(String[] args) throws Exception {
		SearchEngine engine = new SearchEngine();
		engine.index("https://docs.oracle.com/javase/tutorial/collections/");
		engine.index("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
		engine.index("https://docs.oracle.com/javase/tutorial/java/nutsandbolts/");
		//engine.print();
		
		Scanner scanner;
		
		while (true){	
			System.out.print("Enter keyword: ");
			scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			if(input.equals("bye")){
				break;
			}
			Set<String> results = engine.search(input);

			for (String url : results) {
				System.out.println(url);
			}
			
			System.out.println();
		} 
		System.out.println("Bye...");
		scanner.close();
	}
}