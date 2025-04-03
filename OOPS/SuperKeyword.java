public class SuperKeyword {
    public static void main(String args[]){
        Horse horse = new Horse();
        System.out.println(horse.color); 
    }
}

class Animal{
    String color;
    public Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    public Horse(){
        super.color = "Brown";
        // super(); // Calls the constructor of the parent class (Animal)
        System.out.println("Horse constructor is called");
    }
}
