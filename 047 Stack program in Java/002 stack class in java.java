import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println("Pushing some elements in the stack");
        //pushing an element into the stack -> push()
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        //display the stack
        System.out.println("Stack: " + stk);
        
        //pop() -> removes the element
        int x = stk.pop();
        System.out.println(x);
        
        //top of the stack -> peek()
        System.out.println("The element at the top of the stack is: " + stk.peek());
        //size of the stack -> number of elements
        System.out.println("Number of elements in the stack: " + stk.size());
        //empty() -> return true if the stack is empty, false otherwise
        System.out.println("Is the stack empty: " + stk.empty());
        
        //Iterating the stack using iterator
        Iterator it = stk.iterator();
        while(it.hasNext()) {
            Object value = it.next();
            System.out.println(value);
        }
    }
}
