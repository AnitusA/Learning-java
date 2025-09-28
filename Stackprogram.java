import java.util.Stack;

public class Stackprogram {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack: " + stack);
        String top = stack.pop();
        System.out.println("Popped: " + top);
        System.out.println("Top element now: " + stack.peek());
        System.out.println("Is stack empty:" + stack.isEmpty());
        System.out.println("Stack: " + stack);
    }
}
