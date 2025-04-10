//Abb tail kee sath operation perform karne kaa code hoga
public class AddLastInLinkedList {
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

    //methods 
    public static void addLast(int data){
        //Step 1 tha kii new node koo create karna hee 
        Node newNode = new Node(data);

        if(head == null){  //matlab naa linkedlist empty hee humesha head == null raha toh samj jana linkedlist empty hee 
            head = tail = newNode;
            return;
        }

        //Step 2 : tha kii tail koo next point karana 
        tail.next = newNode;

        //Step 3 : Tail kii value mein assign kardena hee newNode koo okk
        tail = newNode;
    }

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

    //print function to print the linkedlist 
    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        AddLastInLinkedList ll = new AddLastInLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printList();  
    }
}

//Yeeh cheeze straight hori in addlast of linkedlist okk
