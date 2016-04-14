package ch3_StackAndQueue;

import java.util.Stack;

public class q5_stackToQueue {

	public static class MyQueue<T> {
		Stack<T> s1 = new Stack<T>();
		Stack<T> s2 = new Stack<T>();

		public void enqueue(T t) {
			s1.push(t);
		}

		public T dequeue() {
			if (s2.isEmpty()) {
				while (!s1.isEmpty()) {
					s2.push(s1.pop());
				}
			}
			T back = s2.pop();
			return back;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
