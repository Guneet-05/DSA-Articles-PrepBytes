import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        
        hm.put("Guneet",1);
        hm.put("Abhishek",2);
        hm.put("Abheesh",3);
        
        System.out.println(hm);
        
        hm.put("Guneet",4); //will not be added
        
        System.out.println(hm);
    }
}
