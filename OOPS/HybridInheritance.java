//Main Class
public class HybridInheritance {
    public static void main(String[] args){
        //Creating objects of the classes
        Animal animal = new Animal();
        Fish fish = new Fish();
        Bird bird = new Bird();
        Mammal mammal = new Mammal();
        //Derived Class Objects
        Dog dog = new Dog();
        Cat cat = new Cat();
        Human human = new Human();
        Tuna tuna = new Tuna();
        Shark shark = new Shark();
        Peacock peacock = new Peacock();

        animal.breathe();
        fish.breathe();
        bird.breathe();
        mammal.eat();
        dog.eat();
        cat.eat();
        human.eat();
        tuna.eat();
        shark.eat();
        peacock.eat();
    }
}

//Base Class
class Animal{
    public void eat(){
        System.out.println("Animal eats");
    }

    public void breathe(){
        System.out.println("Animal Breathes");
    }

    public void sleep(){
        System.out.println("Animal sleeps");
    }
}

//Derived Class (Derived from Animal) 
class Fish extends Animal{
    String color;
    void swim(){
        System.out.println("Fish swims");
    }
}

//Derived Class (Derived from Animal)
class Bird extends Animal{
    void fly(){
        System.out.println("Bird flies");
    }
}

//Derived Class (Derived from Fish and Bird)
class Mammal extends Animal{
    public void walk(){
        System.out.println("Mammals walks");
    }
}

class Tuna extends Fish{
    void hunt(){
        System.out.println("Tuna hunts");
    }
}

class Shark extends Fish{
    void dive(){
        System.out.println("Shark dives");
    }
}

class Peacock extends Bird{
    void dance(){
        System.out.println("Peacock dances");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Mammal{
    void meow(){
        System.out.println("Cat meows");
    }
}

class Human extends Mammal{
    void speak(){
        System.out.println("Human speaks");
    }
}


