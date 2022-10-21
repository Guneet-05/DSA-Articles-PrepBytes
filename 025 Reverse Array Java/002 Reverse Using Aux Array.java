import java.util.*;

public class Main {
    
    public static void reverseUsingAuxArray(int[] arr) {
        int[] aux = new int[arr.length];
        
        int i = arr.length -1;
        int j = 0;
        
        //fill the reverse of arr
        //in aux array
        while(i >= 0) {
            aux[j] = arr[i];
            i--;j++;
        }
        
        //fill back the array arr
        for(i=0;i<arr.length;i++) {
            arr[i] = aux[i];
        }
        
    }
    
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseUsingAuxArray(arr);
        display(arr);
    }
}
