public class MergesortLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is mid
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); // dummy node
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        if (head1 != null) temp.next = head1;
        else temp.next = head2;

        return mergedLL.next; // skipping dummy
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public void sort() {
        head = mergeSort(head);
    }

    public static void main(String[] args) {
        MergesortLL list = new MergesortLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        //5-4-3-2-1

        System.out.println("Before sorting:");
        list.print();

        list.sort();

        System.out.println("After sorting:");
        list.print();
    }
}
