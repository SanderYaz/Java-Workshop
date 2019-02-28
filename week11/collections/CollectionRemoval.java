package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionRemoval {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		// list.add(1);
		list.add(5);
		list.add(3);
		list.add(11);
		list.add(12);
		list.add(22);

		// for (int i = 0; i < list.size(); i++) {
		// int element = list.get(i);
		// // delete numbers between 10 and 20
		// if ((element >= 10) && (element < 20)) {
		// list.remove(i);
		// }
		// }

//		for (Integer a : list) {
//			// delete numbers between 10 and 20
//			if ((a >= 10) && (a < 20)) {
//				list.remove(a);
//			}
//		}

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int element = itr.next();
			if ((element >= 10) && (element < 20)) {
				itr.remove();
			}
		}

		System.out.println(list);
	}

}
