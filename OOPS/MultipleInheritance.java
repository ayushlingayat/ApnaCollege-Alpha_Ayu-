public class MultipleInheritance {
    public static void main(String args[]){
        Bear bear = new Bear();
        bear.eat();
        bear.eats();
    }
}

interface Herbivour{
    void eats();
}

interface Carnivour{
    void eat();
}

class Bear implements Herbivour , Carnivour{
    public void eat(){
        System.out.println("Bear eats meat");
    }

    public void eats(){
        System.out.println("Bear eats plants");
    }
}