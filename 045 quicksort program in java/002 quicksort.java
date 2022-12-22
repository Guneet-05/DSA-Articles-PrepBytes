import java.util.*;

public class Main {
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
     public static void quickSort(int[] arr, int lo, int hi) {
    //write your code here
    
    if(lo > hi) return;
    
    int pivot = arr[hi];
    int partitionIndex = partition(arr,pivot,lo,hi);
    
    quickSort(arr,lo,partitionIndex -1);
    quickSort(arr,partitionIndex + 1,hi);
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    return (j - 1);
  }
    
    public static void display(int[] arr) {
        
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {7,9,4,8,3,6,2,5};
        quickSort(arr,0,arr.length-1);
        display(arr);
    }
}
