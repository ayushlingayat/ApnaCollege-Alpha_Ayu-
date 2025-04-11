class LinkedList{

    public static class Node{
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

    //yeeh access karne kee liye codes nhi likhenge in main function hum uske methods bana lenge hum yeeh methods linkedlist class mein hee bana denge 

     //Methods we will make okk
    //add()
    // remove()
    // print()
    // search()

   

    public static void main(String args[]){
        // LinkedList ll = new LinkedList();
        // ll.head = new Node(1); 
        //LinkedList kee ander joo bhi head hee naa usmein data store hoga 1
        // ll.head.next = new Node(2);
         //linkedlist kee agla node koo yeeh point karr raha hee aur iski value idar 2 hee iska yehi matlab hee ll.head.next
    }
}