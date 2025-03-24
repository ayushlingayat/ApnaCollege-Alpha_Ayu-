public class FunctionOverloading {

    public static int funover(int a , int b){
        return a + b;
    }

    public static int funover(int a , int b , int c){
        return a + b + c;
    }

    public static int funover(float a , float b , float c){
        return (int)(a + b + c);
    }
    public static void main(String args[]){
        int a =  10;
        int b = 20;
        int c = 30;

        System.out.println(funover(a , b));
        System.out.println(funover(a , b , c));
    }
}
