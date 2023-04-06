package TanpaLib;

public class StackTL {

    private int top = -1;
    private String[] stack = new String[10];

    public void push(String item) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = item;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        String item = stack[top];
        stack[top--] = null;
        return item;
    }

    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    public boolean empty() {
        return top == -1;
    }

    public int search(String item) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].equals(item)) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StackTL stack = new StackTL();
        stack.push("Aku");
        stack.push("Anak");
        stack.push("Indonesia");

        System.out.println("Next : " + stack.peek());
        stack.push("Raya");
        System.out.println(stack.pop());
        stack.push("!");

        int count = stack.search("Aku");
        while (count != -1 && count > 1) {
            stack.pop();
            count--;
        }
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
