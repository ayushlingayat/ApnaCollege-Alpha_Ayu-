import java.util.*;

class QueueUsingtwoStack {
    static class Queue {
        // Two stacks for implementing the queue
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add element to the queue
        public void add(int data) { // 0(n)
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push new element to s1
            s1.push(data);

            // Push everything back from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove the front element from the queue
        public int remove() { //O(1)
            if (isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        // Peek the front element
        public int peek() { //0(1)
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        // Adding elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);

        // Removing and printing elements
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
