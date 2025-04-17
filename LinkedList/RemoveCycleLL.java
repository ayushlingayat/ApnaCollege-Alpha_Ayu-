public class RemoveCycleLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true; // cycle exists
            }
        }
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;

        boolean isCycle = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (isCycle == false) return; // No cycle

        // Step 2: Find the start of the cycle means meeting point
        slow = head;
        Node prev = null; // To keep track of the node just before meeting point

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Break the cycle last node kee next vale koo null kardena simple
        prev.next = null;
    }

    public static void main(String[] args){
        // Creating a sample linked list with a cycle
        head = new Node(1);
        Node temp  = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2

        RemoveCycleLL list = new RemoveCycleLL();

        System.out.println("Cycle detected? " + list.isCycle());
        list.removeCycle();
        System.out.println("Cycle detected after removal? " + list.isCycle());
    }
}

