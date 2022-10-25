import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        
        tm.put("Guneet",1);
        tm.put("Abhishek",2);
        tm.put("Abheesh",3);
        
        System.out.println(tm); // strings are the keys
        //they are ordered lexicographically
        
        tm.put("Guneet",4); //will not be added
        
        System.out.println(tm);
    }
}
