package Collection.Stack;
import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}