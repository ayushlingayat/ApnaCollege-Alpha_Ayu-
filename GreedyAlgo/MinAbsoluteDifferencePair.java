import java.util.*;
public class MinAbsoluteDifferencePair {
    public static void main(String args[]){ //0(n logn)
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        //Doing greedy approach here 
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("The minDiff of the pair is " + minDiff);
    }
}
