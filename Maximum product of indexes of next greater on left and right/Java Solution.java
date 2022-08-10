// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    
    public static void NGELeft(int[] arr, int[] L) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0;i<arr.length;i++) {
            while(stk.size() > 0 && arr[stk.peek()] < arr[i]) {
                stk.pop();
            }
            
            if(stk.size() == 0) {
                L[i] = 0;
            } else {
                L[i] = stk.peek() + 1;
            }
            
            stk.push(i);
        }
    }
    
    public static void NGERight(int[] arr, int[] R) {
        Arrays.fill(R,0);
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < arr[stk.peek()]) {
                stk.push(i);
            } else {
                while(stk.size() > 0 && arr[stk.peek()] < arr[i]) {
                    int idx = stk.pop();
                    R[idx] = i + 1;
                }
                stk.push(i);
            }
        }
    }
    
    public static int solve(int[] L, int[] R) {
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        
        for(int i=0;i<L.length;i++) {
            if(max < L[i] * R[i]) {
                max = L[i] * R[i];
                maxIdx = i;
            }
        }
        
        return maxIdx;
    }
    
    public static void main(String[] args) {
        int[] arr = {9,8,6,3,4,10,2};
        int[] L = new int[arr.length];
        NGELeft(arr,L);
        
        int[] R = new int[arr.length];
        NGERight(arr,R);
        
        System.out.println(solve(L,R) + 1);
    }
}
