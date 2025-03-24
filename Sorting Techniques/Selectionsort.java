public class Selectionsort {

    public static void Selectionsortimplementation(int arr[]){
        for(int i=0;i<arr.length-1;i++){ //yeeh outer loop turns count karta
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j; //min number idar store hua or phir iski swapping minpos i kidar kiya tha udar krr diye okk
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){

        int arr[] = {5,4,1,3,2};

        Selectionsort.Selectionsortimplementation(arr);
        Selectionsort.printArray(arr);
    }
}
