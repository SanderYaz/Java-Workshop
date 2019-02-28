package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Iteration2 {

	public static void main(String[] args) {
		List<Integer> values1 = new ArrayList<>();
		values1.add(null);
		values1.add(3);
		values1.add(null);
		values1.add(22);
		
		Integer [] vals = values1.toArray(new Integer[0]);
	
		
		System.out.println(values1);
		values1.removeAll(Collections.singleton(null));
		//values1.remove(null);
		System.out.println(values1);
		
		List<Integer> values2 = new ArrayList<>();
		values2.add(5);
		values2.add(3);
		values2.add(11);
		values2.add(22);
		
		for(int i=0; i<values1.size(); i++) {
			System.out.println(values1.get(i)+values2.get(i));
		}
		
		Iterator<Integer> itr1 = values1.iterator();
		Iterator<Integer> itr2 = values2.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next()+itr2.next());
		}
		
		
		values1.addAll(values2);
		
		
		
	}

}
