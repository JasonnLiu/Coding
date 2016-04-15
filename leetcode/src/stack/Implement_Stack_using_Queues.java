package stack;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues {

	public static void main(String[] args) {
		MyStack m = new MyStack();
		m.push(1);
		m.pop();

	}

}

class MyStack {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	/*
	 * 把LinkedBlockingQueue换为LinkedList,性能瞬间提升，在Leetcode里1.64%提升到86.37%
	 */
	
	

	// Push element x onto stack.
	public void push(int x) {
		if (q2.isEmpty()) {
			q1.add(x);
		} else {
			q2.add(x);
		}

	}

	// Removes the element on top of the stack.
	public void pop() {
		if (q2.isEmpty()) {
			while (q1.size() > 1) {
				q2.add(q1.remove());
			}
			q1.remove();
		} else {
			while (q2.size() > 1) {
				q1.add(q2.remove());
			}
			q2.remove();
		}

	}

	// Get the top element.
	public int top() {
		if (q2.isEmpty()) {
			while (q1.size() > 1) {
				q2.add(q1.remove());
			}
			int back = q1.peek();
			q2.add(q1.remove());
			return back;
		} else {
			while (q2.size() > 1) {
				q1.add(q2.remove());
			}
			int back = q2.peek();
			q1.add(q2.remove());
			return back;
		}

	}

	// Return whether the stack is empty.
	public boolean empty() {
		return q1.isEmpty() && q2.isEmpty();
	}
}