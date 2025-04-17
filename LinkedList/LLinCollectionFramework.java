import java.util.LinkedList;

public class LLinCollectionFramework {
    public static void main(String args[]){
        //creating a LinkedList using from java collection
        LinkedList<Integer> ll = new LinkedList<>();

        //adding elements in LinkedList
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0->1->2 
        System.out.println(ll);

        //Remove Function
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
