public class Subarray1 {
    //using prefix array approach
    public static void sumOfSubarray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int Prefixcarray[] = new int[numbers.length];

        Prefixcarray[0] = numbers[0];
        for(int i = 1; i<Prefixcarray.length; i++){
            Prefixcarray[i] = Prefixcarray[i-1] + numbers[i];
        }
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j<numbers.length; j++){

            }
        }
    }
    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};
        sumOfSubarray(number);
    }
}
