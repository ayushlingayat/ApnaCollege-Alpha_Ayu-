import java.util.*;

public class DequeImplementation {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.err.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first element of the deque :" + " " +deque.getFirst() );
        System.out.println("Last element of the deque :" + " " +deque.getLast() );

    }
}
