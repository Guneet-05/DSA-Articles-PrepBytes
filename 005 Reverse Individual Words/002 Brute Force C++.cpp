#include<bits/stdc++.h>
using namespace std;
int main() {
    string s = "Welcome to PrepBytes";
    
    vector<string> v;
    string temp = "";
	for(int i=0;i<s.length();++i){
		
		if(s[i]==' '){
			v.push_back(temp);
			temp = "";
		}
		else{
			temp.push_back(s[i]);
		}
		
	}
	
	v.push_back(temp);
	string res = "";
	
	for(int i=0;i<v.size();i++) {
	    string curr = v[i];
	    
	    //reverse the current string
	    int lo = 0;
	    int hi = curr.length()-1;
	    while(lo < hi) {
	        char temp = curr[lo];
	        curr[lo] = curr[hi];
	        curr[hi] = temp;
	        lo++;
	        hi--;
	    }
	    
	    res += curr;
	    if(i != v.size() -1) res += " ";
	}
	
	cout << res;
}
