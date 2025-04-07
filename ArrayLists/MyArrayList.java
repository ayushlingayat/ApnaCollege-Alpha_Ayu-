import java.util.ArrayList;

class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Operations on ArrayList to add Element

         // list mein item add karne kee liye time complexity lagti hee 0(1) okk humesha yaad rakhna okk hyee cheeze 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // add kee liye aur ek syntax hee okk yaad rakhna 
        // list.add(index no. , value to add)
        list.add(1 , 12); // isko perform karne kee liye 0(n) time lagta hee okk lets go
          //yee overwrite hoga okk acche seeh dekha jaye toh lets go 
        // list.addAll(Arrays.asList(5, 6, 7, 8));

        System.out.println(list);
        //Operation on ArrayList to get Element 

        // list.get(index number)
        // list mein item koo get karne kee liye time complexity lagti hee 0(1) 
        int elementIndexAt0 = list.get(0);
        int elementIndexAt1 = list.get(1);
        int elementIndexAt2 = list.get(2);
        int elementIndexAt3 = list.get(3);
       

        System.out.println("Element at Index 0 is" + " " + elementIndexAt0);
        System.out.println("Element at Index 1 is" + " " + elementIndexAt1);
        System.out.println("Element at Index 2 is" + " " + elementIndexAt2);
        System.out.println("Element at Index 2 is" + " " + elementIndexAt3);
        
        //Operation to remove element of the list 

        // list.remove(index number) -- yeeh use karna okk 
        // list mein item koo remove karne kee liye time complexity lagti hee 0(n)

        System.out.println("Removed index 1 using list.removed function");
        list.remove(1);

        System.out.println(list);


        //Set Element at Index 
        
        // list.set(index number, new element) -- yeeh use karna okk
        //Yeeh new value index prr store karne kee liye use hota hee easy hee buddy darna mat bilkul bhi 
        // list mein item koo set karne kee liye time complexity lagti hee 0(n) yeh bhi linear mein hota hee okk 
        
        System.out.println("Setting element at index 3 which value will be 60");
        list.set(2, 60);

        System.out.println(list);

        //Contains element gives true and false values which is in boolean okk lets go 

        // list.contains(element) -- yeeh use karna okk
        // list mein item koo check karne kee liye time complexity lagti hee 0(n)

        

        System.out.println(list.contains(60));
        System.out.println(list.contains(11));
    }
}
