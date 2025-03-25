import java.util.*;

class Stringbasic{
    public static void main(String args[]){
        String str = "ordinary way";

        String str1 = new String("new declare string");
        System.out.println(str);
        System.out.println(str1);

        //Input lere okk
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Your name is: " + name);

        //Using the length function in the string 
        String fullName = "Ayush Shyam Lingayat";
        System.out.println(fullName.length());
        // toh spaces kee sath yaha prr length mil jayegi okk 


        //Concatination using string
        String name1 = "Priya";
        String name2 = "Riya";

        System.out.println(name1 + " " + "and" + " " + name2 + " " + "are friends" + " ");

        //using charAt method of String 

        System.out.println("Character at 6th index: " + fullName.charAt(6));

    }
}