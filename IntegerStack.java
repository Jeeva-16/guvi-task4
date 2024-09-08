import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int value) {
        stack.push(value);
    }

    // Method to pop an element from the stack
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stack.pop();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    // Main method for demonstration
    public static void main(String[] args) {
        IntegerStack myStack = new IntegerStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Is stack empty? " + myStack.isEmpty());

        myStack.pop(); // Continue popping
        myStack.pop(); // Trying to pop from an empty stack
        System.out.println("Is stack empty? " + myStack.isEmpty());
    }


}
