package stack;

import java.util.List;

public interface Stack<T> {

	public void push(T item);

	public T pop();

	public boolean isEmpty();

	public List<T> toList();
}
