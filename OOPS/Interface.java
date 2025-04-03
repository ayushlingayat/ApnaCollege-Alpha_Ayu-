public class Interface {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();

        King king = new King();
        king.moves();
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

class Rook implements ChessPlayer{

    public void moves(){
        System.out.println("Straight, left , right , up , down");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("One square in any direction when checked or attacked");
    }
}