#include <bits/stdc++.h>
using namespace std;

string reverseWords(string str)
{
	stack<char> stk;
	string res = "";
	
	for (int i = 0; i < str.length(); ++i) {
		if (str[i] != ' ')
			stk.push(str[i]);

		
		else {
			while (stk.empty() == false) {
				res += stk.top();
				stk.pop();
			}
			res += " ";
		}
	}

	while (stk.empty() == false) {
		res += stk.top();
		stk.pop();
	}
	
	return res;
}

int main()
{
	string str = "Welcome to PrepBytes";
	cout << reverseWords(str);
	return 0;
}
