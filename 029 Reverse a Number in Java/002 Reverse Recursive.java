import java.util.*;

public class Main {
    
    static int rev;
    
    public static void reverse(int number) {
        if(number == 0) return;
        
        int rem = number % 10;
        rev = rev * 10 + rem;
        reverse(number/10);
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        rev = 0;
        reverse(number);
        System.out.println(rev);
    }
}
