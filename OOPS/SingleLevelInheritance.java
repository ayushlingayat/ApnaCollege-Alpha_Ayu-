public class SingleLevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calling parent class method
        dog.bark();  // Calling child class method
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


