public class MergeSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int arr[] , int si , int mid , int ei){
        // left(0,3) = 4
        // right(4,6) = 3
        // ei - si + 1
        // --> 6-0+1 = 7
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for the left part 
        int j = mid+1; // iterator for the right part 
        int k = 0; //iterator for temp array

        while(i<= mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
            }
            else{
                temp[k] = arr[j];
                j++; 
            }
            k++;
        }

        //left part while loop 
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part kee liye loop samje 
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //copy temp to my original array 
        for(k=0 , i =si; k<temp.length; k++ , i++){
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(int arr[] , int si , int ei){
        //abb upar naa base case likhna hee okk 
        if(si >= ei){
            return;
        }
        //approach krr lete first means kaam 
        int mid = si + (ei - si)/2; //(si + ei / 2) bhi likkhe toh chal jayega code okk
        //abb left hissa nikal lenge 
        // si seeh start hoga aur khatam hoga mid prr iske liye recurssion use karree hum log okk

        mergeSort(arr,si,mid); //Yeeh left hissa hee 
        mergeSort(arr,mid+1,ei); //Yeeh right hissa hee 

        //merge kee liye ek alag function likha hee okk jisse apne koo merge karna hee 
        merge(arr, si, mid, ei);
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr , 0 , arr.length-1);
        printArr(arr);
    }
}
