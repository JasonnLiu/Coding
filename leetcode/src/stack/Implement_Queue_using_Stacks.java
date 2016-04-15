package stack;

import java.util.Stack;

public class Implement_Queue_using_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyQueue {

	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {
		s1.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		peek();
		s2.pop();
	}

	// Get the front element.
	public int peek() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		int top = s2.peek();
		return top;
	}

	// Return whether the queue is empty.
	public boolean empty() {
		if (s1.isEmpty() && s2.isEmpty()) {
			return true;
		}
		return false;
	}
}