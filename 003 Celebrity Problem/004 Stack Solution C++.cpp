#include <bits/stdc++.h> 
using namespace std; 
  
int celebrity_solution(int mat[][4],int N) {
        stack<int> stk;
    	
    	for(int i=0;i<N;i++) {
    	    stk.push(i);
    	}
    	
    	while(stk.size() > 1) {
    	    int col = stk.top();
    	    stk.pop();
    	    int row = stk.top();
    	    stk.pop();
    	    if(mat[row][col] == 1) {
    	        stk.push(col); //col may or may not be a celeb
    	    } else {
    	        stk.push(row); //row may or may not be a celeb
    	    }
    	}
    	
    	int x = stk.top();
    	stk.pop();
    	
    	for(int j=0;j<N;j++) {
    	    if(j == x) continue;
    	    if(mat[x][j] == 1) {
    	        return -1;
    	    }
    	}
    	
    	for(int i=0;i<N;i++) {
    	    if(i == x) continue;
    	    if(mat[i][x] == 0) {
    	        return -1;
    	    }
    	}
    	
    	return x;
}  
  
int main() {
    int matrix[][4] = {{0,1,1,0},
                     {0,0,0,0},
                     {0,1,0,0},
                     {1,1,0,0}};
                     
    int res = celebrity_solution(matrix,4);
    if(res == -1) {
        cout<< "There is no celebrity in the party";
    } else {
        cout<< res <<" is the celebrity in the party";
    }
}
