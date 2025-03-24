class CallByValue{


    public static void swap(int a , int b){
        //Swap function code 
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        swap(x , y);

        System.out.println("The value of x is" + x);
        System.out.println("The value of y is" + y);
    }
}