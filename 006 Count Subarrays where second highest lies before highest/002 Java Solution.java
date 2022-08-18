import java.util.*;

public class Main
{
	
    static int MAXN = 100005;
    
    static class pair
    {
    	int first, second;
    	public pair(int first, int second)
    	{
    		this.first = first;
    		this.second = second;
    	}
    }
    
    static void NGEToRight(int arr[], int n, int nextBig[])
    {
    	Stack<pair> s = new Stack<>();
    
    	for (int i = n - 1; i >= 0; i--)
    	{
    
    		nextBig[i] = i;
    		while (!s.empty() && s.peek().first < arr[i])
    			s.pop();
    
    		if (!s.empty())
    			nextBig[i] = s.peek().second;
    
    		s.push(new pair(arr[i], i));
    	}
    }
    
    static void NGEToLeft(int arr[], int n, int prevBig[])
    {
    	Stack<pair> s = new Stack<>();
    	for (int i = 0; i < n; i++)
    	{
    
    		prevBig[i] = -1;
    		while (!s.empty() && s.peek().first < arr[i])
    			s.pop();
    
    		if (!s.empty())
    			prevBig[i] = s.peek().second;
    
    		s.push(new pair(arr[i], i));
    	}
    }
    
    static int countValidPairs(int arr[], int n)
    {
    	int []nextBig = new int[MAXN];
    	int []prevBig = new int[MAXN];
    	int []maxi = new int[MAXN];
    	int ans = 0;
    
    	NGEToLeft(arr, n, prevBig);
    
    	NGEToRight(arr, n, nextBig);
    
    	for (int i = 0; i < n; i++)
    		if (nextBig[i] != i)
    			maxi[nextBig[i] - i] = Math.max(maxi[nextBig[i] - i],i - prevBig[i]);
    
    	for (int i = 0; i < n; i++)
    		ans += maxi[i];
    
    	return ans;
    }
    
    
    public static void main(String[] args)
    {
    
    	int arr[] = {4,6,5,7};
    	int n = arr.length;
    
    	System.out.println(countValidPairs(arr, n));
    }
}
