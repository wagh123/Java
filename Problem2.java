public class Problem2 {
    public static void selectionSort(int arr[]){
        for(int phase = 0; phase < arr.length-1; phase++){
            int min = phase;//considering the first element as a smallest element
            for(int i = phase+1; i < arr.length; i++){
                if(arr[i] > arr[min]){
                    min = i;
                }
            }
            int temp = arr[min];
            arr[min] = arr[phase];
            arr[phase] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,7,2,0,4};
        selectionSort(arr);
        printArr(arr);
    }
}
