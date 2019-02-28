package quiz2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Question5 implements Comparator<Integer> {
	public int compare(Integer q1, Integer q2) {
		return q1 % 5 - q2 % 5;
	}

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>(new Question5());
		map.put(3, "a");
		map.put(7, "ab");
		map.put(8, "abc");
		map.put(2, "a");
		map.put(5, "bc");
		System.out.println(map);
	}
}