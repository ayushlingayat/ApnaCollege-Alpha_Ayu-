public class Abstraction {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal(); 
        // abstract class kaa object create nhi krr sakhte 
    }
}

abstract class Animal{
    public void eat(){
        System.out.println("Eats anything");
    }

    abstract void walk();
    //abstract methods vooh hote hee jismein implementation nhi hota
    //har animal kee pass walk naam kaa function hoga vooh animal nhi batayega but uski sub classes batayegi okk apne liye
    //implementation nhi diya bss idea diya thik hee samje

}


class Horse extends Animal{
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}