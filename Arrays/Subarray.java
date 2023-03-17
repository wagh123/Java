import java.util.*;
public class Subarray{
    // public static void printSubarray(int numbers[]){
    //     int tc = 0;

    //     for(int i = 0; i < numbers.length; i++){
    //         for(int j = i; j<numbers.length; j++){
    //             for(int k = i; k<=j; k++){
    //                 System.out.print(numbers[k] +" ");
    //             }
    //             tc++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("The count of the total substrings in the array is = "+tc);
    // }


    public static void maxSubarraySum(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j< numbers.length; j++){
                currentSum = 0;
                for(int k = i; k <=j; k++){
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        // printSubarray(numbers);

        maxSubarraySum(numbers);
    }
}