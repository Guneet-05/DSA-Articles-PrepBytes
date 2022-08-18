import java.util.*;

public class Main {
    
    public static String reverseWords(String str) {
        List<String> list = new ArrayList<>();
        
        int idx = 0;
        StringBuilder temp = new StringBuilder("");
        
        while(idx < str.length()) {
            char ch = str.charAt(idx);
            if(ch == ' ') {
                list.add(temp.toString());
                temp = new StringBuilder("");
            } else {
                temp.append(ch);
            }
            idx++;
        }
        
        list.add(temp.toString());

        StringBuilder res = new StringBuilder("");

        for(int i=0;i<list.size();i++) {
            String rev = reverse(list.get(i));
            res.append(rev);
            if(i != list.size() -1) res.append(" ");
        }

        return res.toString();
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i=str.length() -1;i>=0;i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        String res = reverseWords(str);
        System.out.println(res);
    }
}
