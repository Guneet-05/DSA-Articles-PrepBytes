import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        TreeSet<Integer> ts= new TreeSet<>();
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(5);
        ts.add(100);
        
        System.out.println(ts); //sorted order
        ts.add(100);
        ts.add(100);
        
        //100 wont be added again
        System.out.println(ts);
    }
}
