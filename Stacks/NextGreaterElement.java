import java.util.*;

public class NextGreaterElement {

    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();

        int[] nxtGreater = new int[arr.length];

        for(int i= arr.length-1; i>=0; i--){
            //1 step while loop chalana 
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){ //yaha prr index store kare stack kee andar not number okk 
                s.pop();
            }

            //2 step if else check karna 
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }
            else{
                nxtGreater[i] = arr[s.peek()]; //yaha number store karre index nhi okk
            }

            //third step push karna element in stack 
            s.push(i); //element koo push kare but in the form of index not element okk 

        }

        for(int i=0; i< nxtGreater.length; i++){ //yeeh apen nxtGreater joo array banaya vooh print karega okk 
            System.out.println(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}

//NEXT GREATER kee forms kee question puchte 

//next greater right 
//next greater left 
//next Smaller right
//next Smaller left
