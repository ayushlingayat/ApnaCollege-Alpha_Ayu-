public class Interface {
    public static void main(String[] args) {
        
    }
}

interface ChessPlayer{
    void moves(); //By default public bhi hee abstract bhi hee aur ChessPlayer mein hum iski implementation nhi likh sakhte kyuki idar total abstraction hota hee
}

class Queen implements ChessPlayer{
    //yeeh joo moves function diya hee usko define karna hoga yaha 
    public void moves(){
        System.out.println("up , down , left , right , diagonal (in all the directions queen moves)");
    }
}