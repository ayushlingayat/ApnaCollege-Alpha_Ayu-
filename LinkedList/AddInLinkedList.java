public class AddInLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Making static Node head and tail here 
    public static Node head;
    public static Node tail;

    // methods
    public void addFirst(int data){
        //Assume karte hee linkedlist isempty toh kay steps honge 

        //Step 1 create new node 
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step 1 create new node 
        // Node newNode = new Node(data);

        //Step 2 : new node kee head mein assign kardena hee next kii value 
        newNode.next = head;  
        
        //here we are linking the linkedlist okk yaha naa reference store hua kal value change bhi hua toh koi baat nhi cause reference store hua hee
        // toh original value hee rahega simple as that 

        //Step 3 : hoga kii head kii value naa abb new Node ban jayee
        head = newNode;
    }

    // Added method to print the linked list
    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        AddInLinkedList ll = new AddInLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.printList();  
    }

}


//yeeh cheeze reverse hori Insertion of Linkedlist okk