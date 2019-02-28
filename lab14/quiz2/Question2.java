package quiz2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(new Integer[] { 5, -2, -3, 2, 4, -2, -4, 1 }));
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int value = itr.next();
			if (value > 0) {
				itr.remove();
			}
		}
		System.out.println(list);
	}
}