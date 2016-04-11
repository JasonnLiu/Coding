package LinkedList;

import java.util.Stack;

public class Palindrome_Linked_List {

	public boolean isPalindrome(ListNode head) {
		if (head == null)
			return true;
		ListNode it = head;
		int c = 0;
		while (it != null) {
			c++;
			it = it.next;
		}
		it = head;
		int a = c / 2;
		Stack<Integer> s = new Stack<Integer>();
		if (c % 2 == 0) {
			while (a > 0) {
				s.push(it.val);
				it = it.next;
				a--;
			}

			while (it != null) {
				if (it.val == s.pop()) {
					it = it.next;
				} else {
					return false;
				}
			}
		} else {
			while (a > 0) {
				s.push(it.val);
				it = it.next;
				a--;
			}
			it = it.next;
			while (it != null) {
				if (it.val == s.pop()) {
					it = it.next;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isPalindrome2(ListNode head) {
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
