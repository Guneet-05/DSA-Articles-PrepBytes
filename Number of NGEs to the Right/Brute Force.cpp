#include <bits/stdc++.h>
using namespace std;

int countNGE(vector<int>& a, int index)
{
	int count = 0, N = a.size();
	for (int i = index + 1; i < N; i++)
		if (a[i] > a[index])
			count++;

	return count;
}

int main()
{
	int N;
	cin >> N;

    vector<int> arr(N);
	
	for(int i=0;i<N;i++) {
	    cin >> arr[i];
	}
	
	int Q;
	cin >> Q;
	
	while(Q--) {
	    int idx;
	    cin >> idx;
	    
	    int res = countNGE(arr,idx);
	    cout<< res << "\n";
	}
}
