package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {

	String id;
	int grade;
	String name;

	public Student(String id, int grade, String name) {
		super();
		this.id = id;
		this.grade = grade;
		this.name = name;
	}

	public static void main(String[] args) {
		Set<Student> st = new HashSet<>();
		Student a = new Student("01", 54, "Ozgur");
		st.add(a);
		st.add(a);
		a = new Student("01", 54, "Ozgur");
		st.add(a);
		a = new Student("03", 94, "Ahmet");
		st.add(a);
		a = new Student("02", 74, "Ali");
		st.add(a);

		System.out.println(st);
	}

	@Override
	public String toString() {
		return id + " " + name + " " + grade;
	}

	@Override
	public int compareTo(Student o) {

		return name.compareTo(o.name);
	}

	@Override
	public boolean equals(Object student) {
		if (student instanceof Student) {
			if (id.equals(((Student) student).id)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}

}
