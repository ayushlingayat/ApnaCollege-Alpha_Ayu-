public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        // Pen p1 = new Pen("blue",5);
        // System.out.println(p1.color);
    }
}

class Student{
    String name;
    int roll;
    // creating constructor intentionaly
    Student(){
        System.out.println("Constructor is called and written inside the function");
    }
}

class Pen{
    String color;
    int tip;
    //Giving initial values using a contructor
    // Pen(String newColor, int newTip){
    //     this.color = newColor;
    //     this.tip = newTip;
    //     System.out.println("Color is set to: " + color);
    // }
}
