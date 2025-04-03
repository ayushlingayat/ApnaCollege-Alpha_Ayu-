class Inheritance{
    public static void main(String[] args){
       Fish fish = new Fish();
       fish.eats();
    }
}

//Base Class //Parent Class 
class Animal {
    String color;
    public void eats(){
        System.out.println("Eats");
    }

    public void breathe(){
        System.out.println("Breathes");
    }

    public void sleep(){
        System.out.println("Sleeps");
    }
}

//Derived Class //Sub Class //Child Class

class Fish extends Animal{

    int fins;
    public void swim(){
        System.out.println("Swims");
    }
}