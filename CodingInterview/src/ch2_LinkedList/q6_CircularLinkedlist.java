package ch2_LinkedList;

import java.util.Stack;

public class q6_CircularLinkedlist {

	public static boolean isCircularLinkedlist(Node n) {
		boolean flag = false;
		Node slow = n;
		Node fast = n;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				flag = true;
				return flag;
			}
		}
		return flag;
	}

	public static int findCircularLinkedlist(Node n) {
		Node slow = n;
		Node fast = n;
		Node colli;
		slow = slow.next;
		fast = fast.next.next;
		if (slow == fast) {
			colli = slow;
		}
		int k = 1;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
			k++;
		}
		return k;
	}

	public static void main(String[] args) {
		Stack<Integer> s; 
	}

}
