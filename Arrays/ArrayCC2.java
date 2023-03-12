import java.util.*;
import java.util.Locale.LanguageRange;
public class ArrayCC2 {
    public static int largestNumber(int arr[]){
        int largestNumber = Integer.MIN_VALUE; //-infinity
        int smallestNumber = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(largestNumber < arr[i]){
                largestNumber = arr[i];
            }
            if(smallestNumber > arr[i]){
                smallestNumber = arr[i];
            }
        }
        System.out.println("The Smallest number is = " + smallestNumber);// because we cannot use two return statements
        return largestNumber;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5};
        System.out.println("The largest number is = " + largestNumber(arr));

    }
}
