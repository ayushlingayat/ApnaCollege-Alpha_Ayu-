class Quicksort{

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int partition(int arr[] , int si , int ei){
        int pivot = arr[ei];
        int i = si -1; 
        //-1 seeh initailize krr diya samne iska kaam hota hee jagah banna in simple terms okk
        //to make place for element smaller than pivot 

        for(int j=si ; j<ei; j++){
            if(arr[j] <= pivot){ //toh swapping karni hogi simple okk
                i++;
                //Swap function hoga run okk
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        //pivot koo sahi jaga pee dalne kee liye yeeh vala code niche kaa
        i++; 
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; // pivot kaa sahi idx i hogaya becuase of swapping aur yeeh return hora quickSortImp function koo okk 

    }
    public static void quickSortImp(int arr[] , int si , int ei){

        //Base case for quick sort is given as 

        if(si >= ei){
            return;
        }

        //Finding pivot here we are taking pivot as the last elem cause everywhere generally 
        // pivot is taken as last element 

        //partition function pivot kaa index deta hee so isko naa ek variable mein store karte

        //last element as pivot
        int pidx = partition(arr ,si , ei);

        //now again calling the quicksort
        quickSortImp(arr, si, pidx-1); //isse naa left part sort hoga 
        quickSortImp(arr, pidx + 1, ei); //isse naa right part sort hoga 

        //Calling the quicksort recurssively here okk 

    }
    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quickSortImp(arr,0,arr.length-1);
        printArr(arr);
    }
}