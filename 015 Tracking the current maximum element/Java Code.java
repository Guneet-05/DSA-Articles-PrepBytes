import java.util.*;
class Main {

static class StackWithMax
{
	static Stack<Integer> mainStack = new Stack<Integer> ();

	static Stack<Integer> trackStack = new Stack<Integer> ();

static void push(int x)
	{
		mainStack.push(x);
		if (mainStack.size() == 1)
		{
			trackStack.push(x);
			return;
		}
		if (x > trackStack.peek())
			trackStack.push(x);
		else
			trackStack.push(trackStack.peek());
	}

	static int getMax()
	{
		return trackStack.peek();
	}

	static void pop()
	{
		mainStack.pop();
		trackStack.pop();
	}
};

public static void main(String[] args)
{
	StackWithMax s = new StackWithMax();
	s.push(10);
	System.out.println(s.getMax());
	s.push(20);
	System.out.println(s.getMax());
	s.push(5);
    System.out.println(s.getMax());
	s.push(30);
	System.out.println(s.getMax());
}
}
