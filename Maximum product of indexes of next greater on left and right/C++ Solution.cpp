#include<bits/stdc++.h>
using namespace std;

void NGELeft(int arr[], int L[], int n) {
    stack<int> stk;
        
        for(int i=0;i<n;i++) {
            while(stk.size() > 0 && arr[stk.top()] < arr[i]) {
                stk.pop();
            }
            
            if(stk.size() == 0) {
                L[i] = 0;
            } else {
                L[i] = stk.top() + 1;
            }
            
            stk.push(i);
        }
}

void NGERight(int arr[], int R[],int n) {
        for(int i=0;i<n;i++) {
            R[i] = 0;
        }
    
        stack<int> stk;
        stk.push(0);
        
        for(int i=0;i<n;i++) {
            if(arr[i] < arr[stk.top()]) {
                stk.push(i);
            } else {
                while(stk.size() > 0 && arr[stk.top()] < arr[i]) {
                    int idx = stk.top();
                    stk.pop();
                    R[idx] = i + 1;
                }
                stk.push(i);
            }
        }
}

int solve(int L[], int R[],int n) {
        int max = INT_MIN;
        int maxIdx = -1;
        
        for(int i=0;i<n;i++) {
            if(max < L[i] * R[i]) {
                max = L[i] * R[i];
                maxIdx = i;
            }
        }
        
        return maxIdx;
}

int main() {
    int arr[] = {9,8,6,3,4,10,2};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    int L[n];
    NGELeft(arr,L,n);
    
    int R[n];
    NGERight(arr,R,n);
    
    int res = solve(L,R,n) + 1;
    cout<<res;
}
