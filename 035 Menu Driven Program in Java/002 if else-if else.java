import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n > 0) System.out.println("Greater than 0");
        else if(n < 0) System.out.println("Less than 0");
        else System.out.println("Equal to 0");
        
        scn.close();
    }
}
