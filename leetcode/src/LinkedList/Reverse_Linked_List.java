package LinkedList;

public class Reverse_Linked_List {

	public ListNode reverseList1(ListNode head) {
		if (head == null)
			return null;
		ListNode curr = head.next;
		if (curr == null)
			return head;
		ListNode r_head = new ListNode(head.val);
		ListNode r_curr = r_head.next;
		while (curr != null) {
			r_curr = new ListNode(curr.val);
			r_curr.next = r_head;
			r_head = r_curr;
			curr = curr.next;
		}
		return r_head;
	}

	public ListNode reverseList2_inplace(ListNode head) {
		if (head == null)
			return null;
		ListNode curr = head.next;
		head.next = null;
		ListNode tmp;
		while (curr != null) {
			tmp = head;
			head = curr;
			ListNode next = curr.next;
			curr.next = tmp;
			curr = next;
		}
		return head;
	}

	public ListNode reverseList2_recursive(ListNode head) {
		if (head == null)
			return null;
		ListNode curr = head.next;
		head.next = null;
		return reverseList2_recursive(curr, head);

	}

	public ListNode reverseList2_recursive(ListNode curr, ListNode head) {
		if (curr == null) {
			return head;
		}
		ListNode next = curr.next;
		curr.next = head;
		head = curr;
		curr = next;
		return reverseList2_recursive(curr, head);

	}

	public static void main(String[] args) {

	}

}
