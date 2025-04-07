import java.util.HashSet;
import java.util.Iterator;
class Hashsetimplementation{
    public static void main(String args[]){
        //Creation of HashSet
        HashSet<Integer> set = new HashSet<Integer>();
        
        //Insertion of elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        
        //Printing the HashSet
        System.out.println("HashSet: " + set);
        
        //Checking if an element exists in the HashSet
        //Search karne kee liye we use contains 
        if(set.contains(20)){
            System.out.println("Hashset contains 20 in it");
        }

        if(!set.contains(70)){
            System.out.println("HashSet does not contains 70 in it");
        }

        //Removing an element from the HashSet
        set.remove(30);

        if(!set.contains(30)){
            System.out.println("We successfully removed the element 30 from it");
        }
        
        //Printing the updated HashSet
        System.out.println("Updated HashSet: " + set);

        //See the size of the set 
        System.out.println("The size of the set is " + set.size());

        //Iterator in set 
        Iterator it = set.iterator();
        //Set koo bhi iterate karte hee using this iterator aur hashmap koo bhi iterate karte hee using this iterator
        //iske doo function hote hee hasNext; next function

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}