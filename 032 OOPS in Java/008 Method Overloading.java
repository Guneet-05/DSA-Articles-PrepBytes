import java.util.*;

public class Main {
    
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }
    
    public static void sort(List<Integer> list) {
        Collections.sort(list);
    }
    
    public static void display(int[] arr) {
        
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {9,8,6,3,4,7,2};
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(9);
        
        System.out.println("Before sorting:");
        System.out.println("Array");
        display(arr);
        System.out.println("List");
        System.out.println(list);
        
        System.out.println("\n\nAfter Sorting:");
        sort(arr);
        sort(list);
        System.out.println("Array");
        display(arr);
        System.out.println("List");
        System.out.println(list);
    }
}
