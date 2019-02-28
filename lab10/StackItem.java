package stack;

public class StackItem<T> {

	private T object;
	private StackItem<T> previous;

	public StackItem(T obj, StackItem<T> previous) {
		this.object = obj;
		this.previous = previous;
	}

	public T getItem() {
		return object;
	}

	public StackItem<T> getPrevious() {
		return previous;
	}
}
