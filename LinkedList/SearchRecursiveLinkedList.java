public class SearchRecursiveLinkedList {
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
    public static int size; //by default size 0 gheil java 

    //methods 
    public void addLast(int data){
        //Step 1 tha kii new node koo create karna hee 
        Node newNode = new Node(data);
        size++; //here new node ayega so size++

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
        size++; //here new node ayega so size++

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
        size++; //here new node ayega so size++
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

    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty ⭐");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size -2;
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        //jab yeeh loop khatam hoga actually size - 2 index pee kadhe honge hum log

        int val = prev.next.data; //isko tail kaa data bhi bol sakhte 
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!= null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head , int key){  //0(n) because call stack naa space occupy karta hee
        //Base Case
        if(head == null){
            return -1;
        }
        if(head.data == key){ //phele hee key mili toh
            return 0;
        }
        int idx = helper(head.next , key); //badmein key mili toh automatically 1 add hoga
        if(idx == -1){
            return -1;
        }

        return idx + 1; //yeh step 1 add krr dengi
    }

    //ek helper function bana rahe hee hum for the recursive search okk so yeeh naa help karega recSearch function koo okk lets go 
    public int recSearch(int key){
        return helper(head , key);
    }

    public static void main(String args[]){
        SearchRecursiveLinkedList ll = new SearchRecursiveLinkedList(); 
        ll.addFirst(2); 
        ll.addFirst(1); 
        ll.addLast(4); 
        ll.addLast(5);
        ll.addMid(2,3);
        

        //Now iteration search in linkedlist 
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));

    }
}
