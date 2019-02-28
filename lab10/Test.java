package stack;

public class Test {

	public static <T> void main(String[] args) {
		StackArrayListImpl<String> stack1 = new StackArrayListImpl<String>();
        stack1.push("A");
        stack1.push("B");
                
        StackImpl<String> stack =  new StackImpl<String>();
        stack.push("hello");
        stack.push("abc");
        //stack.push(8);
        //stack.push(new Double(9.5));

        Object obj = stack1.pop();
        System.out.println(obj);
        System.out.println(stack.toList());

        if (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        if (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
