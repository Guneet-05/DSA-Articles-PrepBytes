import java.util.*;

public class Main {
    
    public static int countNGE(int[] arr, int idx) {
        
        int count = 0;
        
        for(int i=idx + 1;i<arr.length;i++) {
            if(arr[i] > arr[idx]) count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }
        
        int Q = scn.nextInt();
        
        while(Q-- > 0) {
            int idx = scn.nextInt();
            int res = countNGE(arr,idx);
            System.out.println(res);
        }
        
        scn.close();
    }
}
