#include <bits/stdc++.h>
using namespace std;

int getMaxArea(int arr[], int n)
{
	stack<int> s;
	s.push(-1);
	int area = arr[0];
	int i = 0;
	
	vector<int> left_smaller(n, -1), right_smaller(n, n);
	while(i<n){
		while(!s.empty()&&s.top()!=-1&&arr[s.top()]>arr[i]){
		    
			right_smaller[s.top()] = i;
			s.pop();
		}
		if(i>0&&arr[i]==arr[i-1]){
		    
			left_smaller[i] = left_smaller[i-1];
		}else{
			left_smaller[i] = s.top();
		}
		s.push(i);
		i++;
	}
	
	
	for(int j = 0; j<n; j++){
		area = max(area, arr[j]*(right_smaller[j]-left_smaller[j]-1));
	}
	
	
	return area;
}

int main()
{
	int arr[] = {2, 1, 5, 6, 2, 3, 1};
	int n = sizeof(arr  )/sizeof(arr[0]);
	cout << "maxArea = " << getMaxArea(arr, n) << endl;
	return 0;
}
