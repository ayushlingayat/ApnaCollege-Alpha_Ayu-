public class MaxSubarray_Optimized
 {
    public static void maxSubarray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[numbers.length];

        //yee naa prefix sum array bana dega 
        // first element of prefixSum array is equal to first element of given array
        prefixSum[0] = numbers[0];

        //yee abb naa plus karke subarray ko prefix sum create karega using a loop 
        for(int i = 1 ; i < numbers.length; i++){
            prefixSum[i] = prefixSum[i-1] + numbers[i]; //Formula should be learned 
        }

        for(int i = 0 ; i < numbers.length; i++ ){
            int start = i;
            for(int j = i; j< numbers.length; j++){
                int end = j;
                if (start == 0) {
                    currSum = prefixSum[end];
                } else {
                    currSum = prefixSum[end] - prefixSum[start - 1];
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("The maximum sum of Subarray is" + " " + maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {1, -1, 6 ,-1 ,3};

        maxSubarray(numbers);
    }


}
