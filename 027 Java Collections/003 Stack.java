import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i=5;i>=1;i--) {
            stk.push(i);
        }
        
        System.out.println(stk);
        
        stk.pop();
        
        System.out.println(stk);
    }
}
