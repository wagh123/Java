public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            //just consider the first element in array is a minimum element
            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
      
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,0,3,2,1};
        selectionSort(arr);
        printArr(arr);
    }
}
