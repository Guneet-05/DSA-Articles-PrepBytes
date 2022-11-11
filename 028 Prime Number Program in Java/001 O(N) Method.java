import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}
