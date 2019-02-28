package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Iteration {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(5);
		values.add(3);
		values.add(11);
		values.add(22);
		
		for(int a : values) {
			System.out.println(a);
		}
		
		Iterator<Integer> itr = values.iterator();
		while(itr.hasNext()) {
			Integer a = itr.next();
			System.out.println(a);
		}
		
		for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i));
		}
		
		
		
	}

}
