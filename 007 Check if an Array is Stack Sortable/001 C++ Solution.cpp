#include <bits/stdc++.h>
using namespace std;

bool check(int A[], int N)
{
	stack<int> stk;

	int B_end = 0;

	for (int i = 0; i < N; i++)
	{
		if (!stk.empty())
		{
			int top = stk.top();

            //we are checking whether the top of the stack
            //can be appended into the array B
			while (top == B_end + 1)
			{
				B_end = B_end + 1;

				stk.pop();
                
                //if the stack is empty
                // we cannot perform the pop operation again
                // So, we will break
				if (stk.empty())
				{
					break;
				}

				top = stk.top();
			}

            //as per our discussion
            //if stack is empty
            //perform operation 1
            
			if (stk.empty()) {
				stk.push(A[i]);
			}
			
			else
			{
				top = stk.top();

                //this is the case of performing operation 1
				if (A[i] < top)
				{
					stk.push(A[i]);
				}
				
				//else we cannot push the element into the stack
				//and we cannot insert the stack element into the array (already checked)
				//so, A is not stack sortable
				else
				{
					// Not Stack Sortable
					return false;
				}
			}
		}
		else
		{
			// If the stack is empty push the current
			// element in the stack.
			stk.push(A[i]);
		}
	}

	// Stack Sortable
	return true;
}

int main()
{
	int A[] = {4, 1, 2, 3 };
	int N = sizeof(A) / sizeof(int);
	check(A, N)? cout<<"Yes, the array A is stack sortable": cout<<"NO, the array A is not stack sortable";
	return 0;
}
