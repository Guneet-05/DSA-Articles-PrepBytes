import java.util.*;

class Main {

	static boolean check(int A[], int N) {
		Stack<Integer> stk = new Stack<Integer>();

		int B_end = 0;

		for (int i = 0; i < N; i++) {
			if (!stk.empty()) {
				int top = stk.peek();
                
                //perform operation 1
				while (top == B_end + 1) {
					B_end = B_end + 1;

					stk.pop();

					// If the stack is empty We cannot
					// further perfom pop operation.
					// hence break
					if (stk.empty()) {
						break;
					}

					top = stk.peek();
				}

				if (stk.empty()) {
					stk.push(A[i]);
				} else {
					top = stk.peek();

                    //this is the case of operation 1 
					if (A[i] < top) {
						stk.push(A[i]);
					} // Else we cannot insert the element into the stack
					//and we cannot pop an element from the stack (already checked)
					//so, A is not stack sortable
					else {
						// Not Stack Sortable
						return false;
					}
				}
			} else {
			    //if the stack is empty, perform operation 1
				stk.push(A[i]);
			}
		}

		// Stack Sortable
		return true;
	}

	public static void main(String[] args) {

		int A[] = {4, 1, 2, 3};
		int N = A.length;

		if (check(A, N)) {
			System.out.println("YES, the array A is stack sortable");
		} else {
			System.out.println("NO, the array B is not stack sortable");
		}

	}
}
