import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i=1;i<=5;i++) list.add(i);
        
        System.out.println(list);
        System.out.println(list.size());
        
        list.remove(2); //removes an element at index 2
        
        System.out.println(list);
        System.out.println(list.size());
    }
}
