public class Problem4 {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j =0;

        for(int i = count.length-1; i >= 0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i =0; i < arr.length; i++){
            System.err.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,6,7,2,1,9,3};
        countingSort(arr);
        printArr(arr);
    }
}
