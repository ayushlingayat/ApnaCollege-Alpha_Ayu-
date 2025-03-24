package Arrays;

public class Print_Subarray {

    public static void printSubArrays(int numbers[]) {
        int total_subarray = 0; // Moved outside the loop for cumulative count

        for (int i = 0; i < numbers.length; i++) { // Start index of subarray
            for (int j = i; j < numbers.length; j++) { // End index of subarray
                // Print elements from 'i' to 'j'
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                total_subarray++; // Increment after printing each subarray
                System.out.println(); // New line for each subarray
            }
            System.out.println(); // Separate different start indices
        }

        System.out.println("The Total Subarray is " + total_subarray);
    }
    
    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4};
        printSubArrays(numbers);
    }
}
