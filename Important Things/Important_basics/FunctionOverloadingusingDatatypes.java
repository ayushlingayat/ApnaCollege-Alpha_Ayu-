public class FunctionOverloadingusingDatatypes {

    public static int sum(int a , int b){
        return a + b;
    }

    public static float sum(float c , float d){
        return c + d;
    }

    public static boolean sum(boolean e , boolean f){
        return e;
    }
    public static void main(String args[]){
        int a = 10 , b = 10;
        float c  = 10.2f , d = 10.2f;
        boolean e = true , f = false;

        System.out.println(sum(a,b));
        System.out.println(sum(c,d));
        System.out.println(sum(e,f));

    }
}
