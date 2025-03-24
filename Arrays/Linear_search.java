package Arrays;

public class Linear_search {

    public static int Linear_search(int numbers[] , int key){
        for(int i=0 ; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] ={2,4,6,8,10,12,16};
        int key =10;

        int index = Linear_search(numbers, key);
        if(index == -1){
            System.out.println("Key is not found buddy");
        }
        else{
        System.out.println("Key is found on number" + " " + index + " " + "okk enjoy now" );
    }
    }
}
