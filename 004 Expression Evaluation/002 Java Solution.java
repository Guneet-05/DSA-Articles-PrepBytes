import java.util.*;

public class Main
{
	public static int precedence(char op) {
        if(op == '*' || op == '/') return 2;
        else if(op == '+' || op == '-') return 1;
        return 0;
    }
    
    public static int operation(int a, char op, int b) {
        if(op == '+') {
            return a+b;
        } else if(op == '-') {
            return a-b;
        } else if(op == '*') {
            return a*b;
        }
        
        return a/b;
    }
    
    public static int calculate(String s) {
        
        Stack<Character> operators = new Stack<>();
        Stack<Integer> operands = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            
            if(ch >= '0' && ch<='9') {
                int num = 0;
                while(i < s.length() && s.charAt(i) >='0' && s.charAt(i) <= '9') {
                    num = num * 10 + (s.charAt(i) -'0');
                    i++;
                }
                operands.push(num);
                i--;
            } else if(ch == ' ') {
                
            } else if(ch == '(') {
                operators.push(ch);
            } else if(ch == ')') {
                while(operators.size() > 0 && operators.peek() != '(') {
                    int B = operands.pop();
                    int A = operands.pop();
                    char op = operators.pop();
                    int res  = operation(A,op,B);
                    operands.push(res);
                }
                operators.pop();
            } else {
                if(operators.size() == 0) {
                    operators.push(ch);
                    continue;
                }
                
                if(precedence(ch) > precedence(operators.peek())) {
                    operators.push(ch);
                } else {
                    while(operators.size() > 0 && precedence(ch) <= precedence(operators.peek())) {
                        int B = operands.pop();
                        int A = operands.pop();
                        char op = operators.pop();
                        int res  = operation(A,op,B);
                        operands.push(res);
                    }
                    operators.push(ch);
                }
            }
        }
        
        while(operators.size() > 0) {
            int B = operands.pop();
            int A = operands.pop();
            char op = operators.pop();
            int res  = operation(A,op,B);
            operands.push(res);
        }
        
        return operands.peek();
    }

	public static void main(String[] args)
	{
	    String expression = "5 + 2 * (3 - 4 + 2 / 3) * 4 + 2";
	    System.out.println(calculate(expression));
	}
}
