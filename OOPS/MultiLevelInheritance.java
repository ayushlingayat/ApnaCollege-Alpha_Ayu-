//Main Class
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.sound(); // Calling grandparent class method
        puppy.bark();  // Calling parent class method
        puppy.weep();  // Calling child class method
    }
}

// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Grandchild class inheriting from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

