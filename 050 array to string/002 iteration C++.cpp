#include<bits/stdc++.h>
using namespace std;
int main()
{
	char arr[] = {'a','e','i','o','u'};
    string str = "";
    int n = sizeof(arr)/sizeof(char);
    
    for(int i=0;i<n;i++) {
        str += arr[i];
    }
    
    cout<<str;
}
