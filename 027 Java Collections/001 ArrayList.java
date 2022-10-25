import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        
        System.out.println(al);
        System.out.println(al.size());
        
        al.remove(1); //removes the element at index 1
        
        System.out.println(al);
        System.out.println(al.size());
    }
}
