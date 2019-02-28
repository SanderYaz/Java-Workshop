package stack;

import java.util.ArrayList;
import java.util.List;

public class StackArrayListImpl<T> implements Stack {

	private ArrayList<T> contents = new ArrayList<T>();

	public void push(Object item) {
		contents.add((T) item);
	}

	public T pop() {
		return contents.remove(contents.size() - 1);
	}

	public boolean isEmpty() {
		return contents.size() == 0;
	}

	public List toList() {
		return contents;
	}
}
