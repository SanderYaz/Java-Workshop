package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Util {

	public static void main(String[] args) {
		Integer i = 5;
		Number n = i;

		foo2(i);
		Box<Integer> bi = new Box<>(5);
		//foo(bi);

		Box<String> bStr = new Box<>("hello");
		String a = bStr.item;

		Box box = new Box(5);

		String b = (String) box.item;

		inspect(5);
		// inspect("hello");
		Util.add(1.5, 1);

		if ("hello".compareTo("world") < 0) {
			System.out.println("hello comes before world");
		}

		String[] strs = { "a", "b", "c", "d" };

		// System.out.println(Util.<String>countGreaterThan(strs, "c"));

		Collection<String> list = new ArrayList<>();
		list.add("abc");
		
		printCollection(list);
		
		Collection<String> list2 = new ArrayList<>(list);
		
		List<Integer> ints = new ArrayList<>();
		ints.add(7);
		Integer x = ints.get(0);
		int c = x;
	}

	public static <U extends Number> void inspect(U u) {
		System.out.println("U: " + u.getClass().getName());
	}

	public static <U extends Number> void add(U a, U b) {
		System.out.println(a);
		System.out.println(b);
	}

	public static <T extends Comparable<T>, Number> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}

	public static void foo(Box<Number> bn) {
		System.out.println(bn.item);
	}

	public static void foo2(Number n) {
		System.out.println(n);
	}

	static void  printCollection(Collection<?> col) {
		for (Object obj : col) {
			System.out.println(obj);
		}
	}
}
