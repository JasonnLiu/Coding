package leetcode;

import java.util.HashMap;

public class Solution {

	public int[] twoSum(int[] nums, int target) {
		int index1, index2;
		int[] index = new int[2];
		for (int i = 0; i < nums.length; i++) {
			index1 = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				index2 = nums[j];
				if (index1 + index2 == target) {
					index[0] = i + 1;
					index[1] = j + 1;
					return index;
				}
			}
		}
		return null;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		// HashMap<Integer,Integer> nums = new HashMap<Integer, Integer>();
		int c = 0;
		int i = 0;
		ListNode[] lns = new ListNode[999];
		while (c != 0 || l1 != null | l2 != null) {
			int num = 0;
			num = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + c;
			if (num >= 10) {
				num = num - 10;
				c = 1;
			} else {
				c = 0;
			}
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
			lns[i] = new ListNode(num);
			i++;
		}
		for (int j = 1; j < lns.length; j++) {
			if (lns[j] != null) {
				lns[j-1].next = lns[j];
			}else{
				break;
			}
		}
		return lns[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
