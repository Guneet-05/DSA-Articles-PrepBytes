import java.util.*;

public class Main {
    
    public static void reverse(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
    
    
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        reverse(arr);
    }
}
