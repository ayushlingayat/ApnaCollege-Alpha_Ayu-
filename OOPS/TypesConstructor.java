public class TypesConstructor {
    public static void main(String args[]) {
        Student s = new Student(); //constructor overloading concept applies 
        Student s1 = new Student("Ayush"); //constructor overloading concept applies
        System.out.println(s1.name);
        Student s2 = new Student(37); //constructor overloading concept applies
        System.out.println(s2.rollnumber);
    }
}


class Student {
    String name;
    int rollnumber;
    int id;

    public Student() {
        System.out.println("Constructor called without anything");
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int rollnumber) { // Add public to constructor
        this.rollnumber = rollnumber;
    }
}


