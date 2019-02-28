package quiz2;

import java.util.Set;
import java.util.TreeSet;

public class Question3 implements Comparable<Question3> {
	String value;

	public static void main(String[] args) {
		Set<Question3> set = new TreeSet<>();
		set.add(new Question3("abc"));
		set.add(new Question3("a"));
		set.add(new Question3("bc"));
		set.add(new Question3("ab"));
		set.add(new Question3("c"));
		System.out.println(set);
	}

	public Question3(String value) {
		this.value = value;
	}

	public int compareTo(Question3 q) {
		return q.value.length() - value.length();
	}

	public String toString() {
		return value;
	}
}