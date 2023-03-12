import java.util.*;
public class ArrayCC{
    public static int linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;  //means the key did not exists in the array
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        int key = 16;
        int index = linearSearch(arr, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("the index number is = "+index);

        }
    }
}