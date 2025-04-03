//Main Class
public class HierarchialInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calling parent class method
        dog.bark();  // Calling Dog class method

        Cat cat = new Cat();
        cat.sound(); // Calling parent class method
        cat.meow();  // Calling Cat class method
    }
}

// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}



