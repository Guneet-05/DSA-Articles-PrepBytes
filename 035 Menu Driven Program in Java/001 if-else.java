import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n % 2 == 0) System.out.println("The input number is even");
        else System.out.println("The input number is odd");

        scn.close();
    }
}
