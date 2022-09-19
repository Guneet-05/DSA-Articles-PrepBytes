#include <bits/stdc++.h>
using namespace std;

int checkMirrorTree(int M, int N, int u1[ ],
					int v1[ ] , int u2[], int v2[])
	{
		
		unordered_map<int , stack<int>>mp;

		for (int i = 0 ; i < N ; i++ )
		{
		    mp[u1[i]].push(v1[i]);
		}
		
    
		for (int i = 0 ; i < N ; i++)
		{
			if(mp[u2[i]].top() != v2[i])
				return 0;
			mp[u2[i]].pop();
		}

		return 1;
	}

int main()
{
	int M = 7, N = 6;
	
	int u1[] = { 1, 1, 1, 10, 10, 10 };
	int v1[] = { 10, 7, 3, 4, 5, 6 };

	int u2[] = { 1, 1, 1, 10, 10, 10 };
	int v2[] = { 3, 7, 10, 6, 5, 4 };

	if(checkMirrorTree(M, N, u1, v1, u2, v2))
	cout<<"Yes, the trees are mirror";
	else
	cout<<"No, they are not mirror";

	return 0;
}
