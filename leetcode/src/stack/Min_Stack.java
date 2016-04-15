package stack;

import java.util.Stack;

public class Min_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MinStack {

	Stack<Long> s = new Stack<Long>();
	long min;

	public void push(int x) {
		if (s.isEmpty()) {
			s.push(0L);
			min = x;
		} else {
			s.push(x - min);
			if (x < min)
				min = x;
		}
	}

	public void pop() {
		if (s.isEmpty())
			return;
		long p = s.pop();
		if (p < 0)
			min = min - p;
	}

	public int top() {
		long top = s.peek();
		if (top > 0) {
			return (int) (s.peek() + min);
		} else {
			return (int) min;
		}

	}

	public int getMin() {
		return (int) min;
	}
}

class MinStack2 {

	Stack<Element> s = new Stack<Element>();

	private static class Element {
		public Element(int v, int m) {
			this.value = v;
			this.min = m;
		}

		private int value;
		private int min;
	}

	public void push(int x) {
		if (s.isEmpty()) {
			s.push(new Element(x, x));
		} else {
			Element top = s.peek();
			if (x < top.min) {
				s.push(new Element(x, x));
			} else {
				s.push(new Element(x, top.min));
			}
		}
	}

	public void pop() {
		s.pop();
	}

	public int top() {
		return s.peek().value;
	}

	public int getMin() {
		return s.peek().min;
	}
}