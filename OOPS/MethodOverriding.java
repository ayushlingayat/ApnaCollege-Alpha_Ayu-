//Parent and child class both contains the same function but function kee andar kaa change hota hee means function definition is changed

//Main class
public class MethodOverriding {
    public static void main(String[] args){
        Deer deer = new Deer();
        deer.eat(); //output: eats grass
        //This is example of method overriding okk
    }
}

//Base class
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
