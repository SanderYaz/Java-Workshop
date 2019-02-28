package quiz2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question6 {
	int value;

	public static void main(String[] args) {
		Map<Question6, String> map = new LinkedHashMap<>();
		map.put(new Question6(3), "a");
		map.put(new Question6(7), "ab");
		map.put(new Question6(8), "abc");
		map.put(new Question6(2), "a");
		map.put(new Question6(5), "bc");
		System.out.println(map);
	}

	public Question6(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Question6) {
			return value % 5 == ((Question6) o).value % 5;
		}
		return false;
	}

	public String toString() {
		return "" + value;
	}

	public int hashCode() {
		return 0;
	}
}