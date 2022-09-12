import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	
	public static int getMaxArea(int arr[], int n)
	{
		Stack<Integer> s = new Stack<>();
		s.push(-1);
		int max_area = arr[0];
		
		int leftSmaller[] = new int[n];
		int rightSmaller[] = new int[n];
		for (int i = 0; i < n; i++){
			leftSmaller[i] = -1;
			rightSmaller[i] = n;
		}

		int i = 0;
		while (i < n)
		{
			while(!s.empty()&&s.peek()!=-1 && arr[i]<arr[s.peek()]){
			    
				rightSmaller[s.peek()] = (int)i;
				s.pop();
			}
			if(i>0&&arr[i]==arr[(i-1)]){
				leftSmaller[i] = leftSmaller[(int)(i-1)];
			}else{
				leftSmaller[i] = s.peek();
			}
			s.push(i);
			i++;
		}


		for(i = 0; i<n; i++){
			max_area = Math.max(max_area, arr[i]*(rightSmaller[i] - leftSmaller[i] - 1));
		}

		return max_area;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2, 1, 5, 6, 2, 3, 1};
		System.out.println("Maximum area is " + getMaxArea(arr, arr.length));
	}
}
