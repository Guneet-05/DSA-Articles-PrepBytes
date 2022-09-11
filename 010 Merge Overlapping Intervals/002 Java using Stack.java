import java.util.*;

public class Main {

	public static void mergeIntervals(Interval arr[])
	{
	    
		if (arr.length <= 0)
			return;

		Stack<Interval> stack=new Stack<>();

		Arrays.sort(arr,new Comparator<Interval>(){
			public int compare(Interval i1,Interval i2)
			{
				return i1.start-i2.start;
			}
		});

		stack.push(arr[0]);

		for (int i = 1 ; i < arr.length; i++)
		{
			Interval top = stack.peek();

			if (top.end < arr[i].start)
				stack.push(arr[i]);

			else if (top.end < arr[i].end)
			{
				top.end = arr[i].end;
				stack.pop();
				stack.push(top);
			}
		}

		System.out.print("The Merged Intervals are: ");
		while (!stack.isEmpty())
		{
			Interval t = stack.pop();
			System.out.print("["+t.start+","+t.end+"] ");
		}
	}

	public static void main(String args[]) {
		Interval arr[]=new Interval[6];
		arr[0]=new Interval(1,8);
		arr[1]=new Interval(5,12);
		arr[2]=new Interval(14,19);
		arr[3]=new Interval(22,28);
		arr[4]=new Interval(25,27);
		arr[5]=new Interval(27,20);
		mergeIntervals(arr);
	}
}

class Interval
{
	int start,end;
	Interval(int start, int end)
	{
		this.start=start;
		this.end=end;
	}
}
