package generics;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(2);
		lst.remove(2);
		System.out.println(lst);

	}

}
