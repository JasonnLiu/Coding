package LinkedList;

public class Merge_Two_Sorted_Lists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head;
		ListNode p1 = l1;
		ListNode q2 = l2;
		if (p1.val < q2.val) {
			head = p1;
			p1 = p1.next;
		} else {
			head = q2;
			q2 = q2.next;
		}
		ListNode curr = head;
		while (p1 != null && q2 != null) {
			if (p1.val < q2.val) {
				curr.next = p1;
				p1 = p1.next;
			} else {
				curr.next = q2;
				q2 = q2.next;
			}
			curr = curr.next;
		}
		if (p1 != null) {
			curr.next = p1;
		}
		if (q2 != null) {
			curr.next = q2;
		}
		return head;

	}

	public ListNode mergeTwoLists_recursive(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head;
		if (l1.val < l2.val) {
			head = l1;
			head.next = mergeTwoLists_recursive(l1.next, l2);
		} else {
			head = l2;
			head.next = mergeTwoLists_recursive(l1, l2.next);
		}
		return head;
	}
	
	//递归比迭代更快

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
