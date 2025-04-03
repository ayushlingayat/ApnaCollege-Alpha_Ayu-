public class Abstraction {
    public static void main(String args[]){
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal a = new Animal(); 
        // abstract class kaa object create nhi krr sakhte 

        //Abstract classes kii constructor toh nhi banti but usmein naa object define hote hee joo heirarchy follow karte hee 
        // System.out.println(h.color);

        Mustang myHorse = new Mustang();
        // we know the hierarchy 
        // Animal -> Horse -> Mustang
        //Abb naa Animal constructor call hoga phir hoga call Horse Constructor phir hoga call Mustang kaa constructor okk
    }
}

abstract class Animal{
    String color;

    public Animal(){
        // this.color = "brown";
        System.out.println("Animal Constructor called");
    }
    public void eat(){
        System.out.println("Eats anything");
    }

    abstract void walk();
    //abstract methods vooh hote hee jismein implementation nhi hota
    //har animal kee pass walk naam kaa function hoga vooh animal nhi batayega but uski sub classes batayegi okk apne liye
    //implementation nhi diya bss idea diya thik hee samje

}


class Horse extends Animal{

    public Horse(){
        System.out.println("Horse Constructor called");
    }
    public void changeColor(){
        this.color ="dark brown";
    }
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Mustang extends Horse{
    public Mustang(){
        System.out.println("Mustang Constructor called");
    }
}

class Chicken extends Animal{
    public void changeColor(){
        this.color ="yellow";
    }
    public void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}