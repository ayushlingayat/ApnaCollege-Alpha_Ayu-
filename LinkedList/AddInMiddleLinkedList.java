public class AddInMiddleLinkedList {
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
    public void addLast(int data){
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
    public void printList() {   //0(n)
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMid(int idx , int data){
        if(idx == 0){ //yaha toh head kii value bhi modify krr sakhte isse okk 
            addFirst(data);
            return;
        }
        // Step 1 : create a NewNode
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0; //yeeh naa track rakhega idx kee prev element kaa

        while(i<idx -1){
            temp = temp.next;
            i++;
        }

        //i = idx -1 //matlab temp = prev hoga samje 
        //Step 2 : new node kaa next temp kee next koo point karne lage and temp kaa next banjaye new node 
        newNode.next = temp.next; //new node kaa next temp kee next koo point karne lage
        temp.next = newNode;//aur temp kaa niche side kaa next ban jaye newNode 
    }

    public static void main(String args[]){
        AddInMiddleLinkedList ll = new AddInMiddleLinkedList(); 
        ll.addFirst(2); 
        ll.addFirst(1); 
        ll.addLast(3); 
        ll.addLast(4);
        ll.addMid(2,9);
        ll.addMid(3, 10);
        ll.printList(); 
    }
}

// add(Index , data)
// add in middle take 0(n) time because idx (index) dundhne mein time lag jata hee 
// Linkage process mein naa constant time lagta hee 
 //Abb tail kee sath operation perform karne kaa code hoga
//Yeeh cheeze straight hori in addlast of linkedlist okk

// addFirst => 0(1); constant time
// addLast => 0(1); constant time
// printList => 0(n); 0n time lagta



