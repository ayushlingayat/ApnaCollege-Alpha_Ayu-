public class DeepCopy {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Ayush";
        s1.rollnumber = 123;
        s1.password = "abcdef";

        s1.marks[0] = 100;
        s1.marks[1] = 200;
        s1.marks[2] = 300;

        Student s2 = new Student(s1); // Copy constructor is called here
        s2.password = "xyz_abc";
        s1.marks[2] = 500; // This should not affect s2's marks

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]); // Should print original values, not modified ones
        }
    }
}

class Student {
    String name;
    int rollnumber;
    String password;
    int marks[];

    // Copy constructor (Deep Copy)
    public Student(Student s1) {
        this.name = s1.name;
        this.rollnumber = s1.rollnumber; 
        this.marks = new int[3]; // Allocate new array
        
        // Copy individual elements to avoid reference sharing
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }

        System.out.println("Copy constructor has been called");
    }

    public Student() {
        marks = new int[3]; // Initialize the array in default constructor
        System.out.println("Constructor has been called");
    }
}
