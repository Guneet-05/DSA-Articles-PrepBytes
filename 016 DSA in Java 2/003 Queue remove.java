import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        
        System.out.println(q);
        
        q.remove();
        
        System.out.println(q);
        
        q.remove();
        
        System.out.println(q);
    }
}
