public class StaticKeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setName("Ayush");
        // System.out.println(s1.getName());
        Student.schoolName = "Apna College"; //abb yeeh sab object kee liye change hoga

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        System.out.println(s2.returnPercentage(1,2,3));

        //Static object memory mein ek hee baar banti hee okk 
        // Static object ko static keyword se declare karna hota hee
    }
}

class Student{
    static int returnPercentage(int chem , int phys , int science){
        return (chem + phys + science)/3;
    }
    String name;
    int rollnumber;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
