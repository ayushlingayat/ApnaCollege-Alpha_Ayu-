public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Ayush";
        s1.rollnumber = 123;
        s1.password = "abcdef";

        s1.marks[0] = 100;
        s1.marks[1] = 200;
        s1.marks[2] = 300;

        Student s2 = new Student(s1); // Copy constructor is called here
        s2.password = "xyz_abc";
        s1.marks[2] = 500;
        for(int i =0 ; i< 3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int rollnumber;
    String password;
    int marks[];

    // Copy constructor
    public Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollnumber = s1.rollnumber; // Copying values from s1 to s2 using copy constructor
        this.marks = s1.marks;

        System.out.println("Copy constructor is been called");
        
    }

    public Student(){
        System.out.println("Constructor is been called");
    }
}


