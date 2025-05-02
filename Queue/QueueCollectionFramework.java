import java.util.*;

public class QueueCollectionFramework {
     public static void main(String args[]){
    //    Queue<Integer> q = new LinkedList<>();  
       //ArrayDeque bhi use krr sakhte LinkedList kee jagah pee okk
       //In dono seeh bana sakhte queue but thode difference hote hee abb homework yeeh hee kii analyze karna kya difference hote hee okk ismein okk naa

       Queue<Integer> q = new ArrayDeque<>(); 

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
