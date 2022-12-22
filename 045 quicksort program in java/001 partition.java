import java.util.*;

public class Main {
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void partition(int[] arr, int pivot) {
        int l = 0;
        int r = 0;
        
        while(r < arr.length) {
            if(arr[r] > pivot) r++;
            else {
                swap(arr,l,r);
                l++;
                r++;
            }
        }
    }
    
    public static void display(int[] arr) {
        
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {7,9,4,8,3,6,2,5};
        partition(arr,5);
        display(arr);
    }
}
