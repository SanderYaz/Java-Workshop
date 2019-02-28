package stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {

	StackItem<T> top;

	public void push(T item) {
		StackItem<T> newTop = new StackItem<T>(item, top);
		top = newTop;
	}

	public T pop() {
		T item = top.getItem();

		top = top.getPrevious();
		return item;
	}

	public boolean isEmpty() {

		return top == null;
	}

	public List<T> toList() {
		StackItem<T> current = top;
		ArrayList<T> items = new ArrayList<T>();
		while (current != null) {
			items.add(0, current.getItem());
			current = current.getPrevious();
		}
		return items;
	}

}
