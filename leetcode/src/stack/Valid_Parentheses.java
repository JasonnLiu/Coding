package stack;

import java.util.Stack;

public class Valid_Parentheses {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] c = s.toCharArray();
		if (c.length % 2 != 0)
			return false;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
				stack.push(c[i]);
			} else if (c[i] == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return false;
				} else {
					stack.pop();
				}
			} else if (c[i] == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return false;
				} else {
					stack.pop();
				}
			} else if (c[i] == '}') {
				if (stack.isEmpty() || stack.peek() != '{') {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
