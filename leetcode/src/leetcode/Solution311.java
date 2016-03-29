package leetcode;

import java.util.Arrays;

public class Solution311 {

	public boolean isAnagram(String s, String t) {
		// if(s == "" & t == "") return true;
		if (s.equals(t))
			return true;
		if (s.length() != t.length())
			return false;
		char[] sc = s.toCharArray();
		char[] tc = t.toCharArray();
		Arrays.sort(tc);
		Arrays.sort(sc);
		// print(tc);
		// print(sc);
		// System.out.println(sc.hashCode());
		// System.out.println(tc.hashCode());
		for (int i = 0; i < tc.length; i++) {
			if (tc[i] != sc[i]) {
				return false;
			}
		}
		return true;
	}

	public static void print(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public void sortColors(int[] nums) {
		int num0 = 0, num1 = 0, num2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				num0++;
			} else if (nums[i] == 1) {
				num1++;
			} else {
				num2++;
			}
		}
		int j = 0;
		for (; j < num0; j++) {
			nums[j] = 0;
		}
		for (; j < num0 + num1; j++) {
			nums[j] = 1;
		}
		for (; j < nums.length; j++) {
			nums[j] = 2;
		}
	}

	public ListNode insertionSortList(ListNode head) {
		if (null == head || null == head.next)
			return head;

		if (head.val > head.next.val) {
			ListNode tmp = head;
			ListNode third = head.next.next;
			head = head.next;
			head.next = tmp;
			tmp.next = third;
		}
		if (null == head.next.next) {
			return head;
		}

		ListNode it_prev = head;
		ListNode it = head.next;
		ListNode curr = it.next;
		ListNode curr_prev = it;
		ListNode curr_next = curr.next;
		while (null != curr) {

			if (curr.val < head.val) {
				ListNode tmp = head;

				curr_next = curr.next;
				curr_prev.next = curr_next;

				head = curr;
				curr.next = tmp;
			} else {
				it = head.next;
				it_prev = head;

				while (curr.val > it.val) {
					it = it.next;
					it_prev = it_prev.next;

				}
				if (it == curr) {
					curr_prev = curr;
					curr = curr.next;
					continue;
				}
				ListNode tmp = it;
				curr_next = curr.next;
				curr_prev.next = curr_next;

				it_prev.next = curr;
				curr.next = tmp;
			}
			curr = curr_next;

		}

		return head;

	}

	public ListNode sortList(ListNode head) {
		
		return head;
	}

	public static void main(String[] args) {
		Solution311 s = new Solution311();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		s.insertionSortList(head);

	}

}
