import java.util.*;

public class StackusingtwoQueue {
    static class Stack {
        // Two queues for implementing the stack
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push operation
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (q1.size() > 1) {
                    q2.add(q1.remove());
                }
                top = q1.remove();
            } else {
                while (q2.size() > 1) {
                    q1.add(q2.remove());
                }
                top = q2.remove();
            }

            return top;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = -1;

            if (!q1.isEmpty()) {
                while (q1.size() > 1) {
                    q2.add(q1.remove());
                }
                top = q1.peek();
                q2.add(q1.remove());
            } else {
                while (q2.size() > 1) {
                    q1.add(q2.remove());
                }
                top = q2.peek();
                q1.add(q2.remove());
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek: " + s.peek()); // 3
        System.out.println("Pop: " + s.pop());   // 3
        System.out.println("Peek: " + s.peek()); // 2
        System.out.println("Pop: " + s.pop());   // 2
        System.out.println("Pop: " + s.pop());   // 1
        System.out.println("Is Empty? " + s.isEmpty()); // true
    }
}
