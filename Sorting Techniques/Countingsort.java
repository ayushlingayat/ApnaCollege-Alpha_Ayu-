public class Countingsort {

    public static void Countingsortsortimplementation(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        //Now making the count array here

        int count[] = new int[largest+1];

        //Filling the count array by iterating on original array 
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting step
        int j = 0;
        for(int i=0;i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){

        int arr[] = {1,4,1,3,2,4,3,7};

        Countingsort.Countingsortsortimplementation(arr);
        Countingsort.printArray(arr);
    }
}
