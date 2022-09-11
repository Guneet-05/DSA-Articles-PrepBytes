import java.util.*;

class Interval
{
	int start,end;
	
	Interval(int start, int end)
	{
		this.start=start;
		this.end=end;
	}
}

public class Main {
	
	public static void mergeIntervals(Interval arr[])
	{
		Arrays.sort(arr,new Comparator<Interval>(){
			public int compare(Interval i1,Interval i2)
			{
				return i1.start - i2.start;
			}
		});

		int index = 0; 
		
		for (int i=1; i<arr.length; i++)
		{
			if (arr[index].end >= arr[i].start)
			{
				arr[index].end = Math.max(arr[index].end, arr[i].end);
			}
			else {
				index++;
				arr[index] = arr[i];
			}
		}
		
		System.out.print("The Merged Intervals are: ");
		for (int i = 0; i <= index; i++)
		{
			System.out.print("[" + arr[i].start + ","+ arr[i].end + "]\t");
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
