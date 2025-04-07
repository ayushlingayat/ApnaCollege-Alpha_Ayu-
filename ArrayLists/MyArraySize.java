import java.util.ArrayList;
public class MyArraySize {
    public static void main(String[] args){

        //As the name specify size of Array list seeh hume naa size mil jata hee arrayList kaa okk
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(50);

        // jese .length ek property hoti tii arrays kee liye vese hee .size() ek method hota hee arraylist kii size nikal nhe kaa okk and i am using it now 

        System.out.println(arrlist.size());

        //Abb isse hum arraylist koo traveers bhi krr sakhte hee so beautiful naa yes too beautiful 

        //Iterating the array list using size method 

        for(int i = 0; i< arrlist.size(); i++){
            System.out.print(arrlist.get(i) + " ");
        }

        System.out.println();

    }
}
