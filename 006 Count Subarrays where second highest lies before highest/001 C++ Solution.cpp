#include <bits/stdc++.h>
#define MAXN 100005
using namespace std;

void NGE_To_Right(int arr[], int n, int nextBig[])
{
	stack<pair<int, int> > s;

	for (int i = n - 1; i >= 0; i--) {

		nextBig[i] = i;
		while (!s.empty() && s.top().first < arr[i])
			s.pop();

		if (!s.empty())
			nextBig[i] = s.top().second;

		s.push(pair<int, int>(arr[i], i));
	}
}

void NGE_To_Left(int arr[], int n, int prevBig[])
{
	stack<pair<int, int> > s;
	for (int i = 0; i < n; i++) {

		prevBig[i] = -1;
		while (!s.empty() && s.top().first < arr[i])
			s.pop();

		if (!s.empty())
			prevBig[i] = s.top().second;

		s.push(pair<int, int>(arr[i], i));
	}
}

int count_valid_pairs(int arr[], int n)
{
	int nextBig[MAXN];
	int prevBig[MAXN];
	int maxi[MAXN];
	int ans = 0;

	NGE_To_Left(arr, n, prevBig);

	NGE_To_Right(arr, n, nextBig);

	for (int i = 0; i < n; i++)
		if (nextBig[i] != i)
			maxi[nextBig[i] - i] = max(maxi[nextBig[i] - i],i - prevBig[i]);

	for (int i = 0; i < n; i++)
		ans += maxi[i];

	return ans;
}

int main()
{
	int arr[] = {4,6,5,7};
	int n = sizeof(arr) / sizeof(arr[0]);
	cout << count_valid_pairs(arr, n) << endl;
	return 0;
}
