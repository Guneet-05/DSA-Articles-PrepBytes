#include <bits/stdc++.h>
using namespace std;

string reverse_words(string str)
{
	int start = 0;
	for (int i = 0; i <= str.size(); i++) {

		if (str[i] == ' ' || i == str.size()) {

			int end = i - 1;

			while (start < end) {
				swap(str[start], str[end]);
				start++;
				end--;
			}

			start = i + 1;
		}
	}

	return str;
}

int main()
{
	string str = "Welcome to PrepBytes";

	cout << reverse_words(str);

	return 0;
}
