import java.util.*;

public class Main {
    
    public static String convertArrayToString(char[] arr) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<arr.length;i++) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        char[] arr = {'a','e','i','o','u'};
        String str = convertArrayToString(arr);
        System.out.println(str);
    }
}
