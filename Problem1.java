public class Problem1 {
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length-1; turn++){
            for(int i = 0; i < arr.length-1-turn; i++){
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,5};
        bubbleSort(arr);
        printArr(arr);
    }    
}
