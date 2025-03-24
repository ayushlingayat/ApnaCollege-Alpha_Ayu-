package Arrays;

public class Reverse_Array{

    public static void reverse(int[] numbers){
        // firtst the edge cases okk 
        int first =0;
        int last = numbers.length-1;
       
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            // increment the first and decrement the last
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};

        reverse(numbers);

        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
    }
}