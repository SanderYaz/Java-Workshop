package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//creates a hash set filled with strings 
		// Create a hash set 
		Set<String> set = new TreeSet<>();
		// Text in String 
		String text = "Have a good day. Have a good class. " + 
		"Have a good visit. Have fun!";
		// Extract words from text  
		StringTokenizer st = new StringTokenizer(text, " .!?");  
		while (st.hasMoreTokens())     
				set.add(st.nextToken());
		
		System.out.println(set);
	}

}
