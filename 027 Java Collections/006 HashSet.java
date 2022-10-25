import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        
        for(int i=1;i<=30;i++) {
            if(hs.contains(i)) {
                System.out.println(i + " is already present in the hashset");
            }
            hs.add(i);
        }
        
        System.out.println(hs);
    }
}
