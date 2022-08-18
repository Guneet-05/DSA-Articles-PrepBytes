import java.io.*;
import java.util.*;

class Main {

static String reverseWords(String str)
{
	Stack<Character> stk = new Stack<Character>();
    StringBuilder res = new StringBuilder("");

	for (int i = 0; i < str.length(); i++) {
		
		char ch = str.charAt(i);
		
		if (ch != ' ')
			stk.push(ch);

		else {
			while (stk.empty() == false) {
				res.append(stk.pop());
				
			}
			res.append(" ");
		}
	}

	while (stk.empty() == false) {
		res.append(stk.pop());
	}
	
	return res.toString();
}

    public static void main(String[] args)
    {
        String str = "Welcome to PrepBytes";
    	System.out.println(reverseWords(str));
    }

}
