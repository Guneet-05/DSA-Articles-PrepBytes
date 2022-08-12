#include <bits/stdc++.h>
using namespace std;

int precedence(char op){
	if(op == '+'||op == '-')
	return 1;
	if(op == '*'||op == '/')
	return 2;
	return 0;
}

int operation(int a, int b, char op){
	switch(op){
		case '+': return a + b;
		case '-': return a - b;
		case '*': return a * b;
		case '/': return a / b;
	}
}

int solve_infix_expression(string tokens){
	int i;
	
	stack <int> operands;
	
	
	stack <char> operators;
	
	for(i = 0; i < tokens.length(); i++){
		
		//skip spaces
		if(tokens[i] == ' ')
			continue;
		
		else if(tokens[i] == '('){
			operators.push(tokens[i]);
		}
		
		
		else if(isdigit(tokens[i])){
			int val = 0;
			
			//converting string of characters to number
			while(i < tokens.length() &&
						isdigit(tokens[i]))
			{
				val = (val*10) + (tokens[i]-'0');
				i++;
			}
			
			operands.push(val);
			i--;
		}
		
		else if(tokens[i] == ')')
		{
			while(!operators.empty() && operators.top() != '(')
			{
				int val2 = operands.top();
				operands.pop();
				
				int val1 = operands.top();
				operands.pop();
				
				char op = operators.top();
				operators.pop();
				
				operands.push(operation(val1, val2, op));
			}
			
			if(!operators.empty())
			operators.pop();
		}
		
		else
		{
			while(!operators.empty() && precedence(operators.top())
								>= precedence(tokens[i])){
				int val2 = operands.top();
				operands.pop();
				
				int val1 = operands.top();
				operands.pop();
				
				char op = operators.top();
				operators.pop();
				
				operands.push(operation(val1, val2, op));
			}
			
			operators.push(tokens[i]);
		}
	}
	
	while(!operators.empty()){
		int val2 = operands.top();
		operands.pop();
		
		int val1 = operands.top();
		operands.pop();
		
		char op = operators.top();
		operators.pop();
		
		operands.push(operation(val1, val2, op));
	}
	
	return operands.top();
}

int main() {
	cout << solve_infix_expression("5 + 2 * (3 - 4 + 2 / 3) * 4 + 2");
	return 0;
}
