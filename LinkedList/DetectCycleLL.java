public class DetectCycleLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public boolean isCycle(){ //This is also called as Floyds Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;        // move by 1
            fast = fast.next.next;   // move by 2

            if(slow == fast){
                return true; // cycle detected
            }
        }
        return false; // no cycle
    }

    public static void main(String[] args){
        // Creating a sample linked list
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

    
        DetectCycleLL list = new DetectCycleLL();
        System.out.println("Cycle detected? " + list.isCycle());
    }
}
