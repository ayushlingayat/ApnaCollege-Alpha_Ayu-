class CircularLL {
    static class Node {
        int data;
        Node next;
    }

    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;

        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        last.next = last; // circular link
        return last;
    }

    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next; // point to first node
        last.next = newNode;
        last = newNode;
        return last;
    }

    static void printList(Node last) {
        if (last == null) {
            System.out.println("List is empty bro!");
            return;
        }

        Node first = last.next;
        Node temp = first;
        System.out.print("Circular LL: ");

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != first);

        System.out.println("(back to " + first.data + ")");
    }

    public static void main(String[] args) {
        Node last = null;

        last = addToEmpty(last, 10);
        last = addEnd(last, 20);
        last = addEnd(last, 30);
        last = addEnd(last, 40);

        printList(last);
    }
}
