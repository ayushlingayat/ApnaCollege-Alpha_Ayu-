import java.util.*;

public class FractionalKnapsack {
    public static void main(String args[]) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        //making 2d array now 
        double ratio[][] = new double[val.length][2];
        //0th col => index 
        //1st col pee naa ratio store hoga okk 

        for(int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i];
        }

        //Ascending order mein sorting kii hee 
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        //Descending order mein chahiye so ulta loop chala loo 
        int capacity = W;
        double finalValue = 0;

        for(int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0]; // original index
            if(capacity >= weight[idx]) {
                // pura item lelo include full item
                finalValue += val[idx];
                capacity -= weight[idx];
            } else {
                // fractional item lelo
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
                break; // knapsack is full
            }
        }

        System.out.println("Maximum value in knapsack = " + finalValue);
    }
}
