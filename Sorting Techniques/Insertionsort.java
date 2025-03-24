public class Insertionsort {

    public static void Insertionsortimplementation(int arr[]){
        for(int i =1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            
            //finding out correct position to insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            
            arr[prev+1] = curr; //inserting the current element at correct position
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){

        int arr[] = {5,4,1,3,2};

        Insertionsort.Insertionsortimplementation(arr);
        Insertionsort.printArray(arr);
    }
}
