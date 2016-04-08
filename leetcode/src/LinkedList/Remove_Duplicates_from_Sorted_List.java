package LinkedList;

public class Remove_Duplicates_from_Sorted_List {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head;
		if (curr == null)
			return null;
		ListNode next = curr.next;
		while (next != null) {
			if (next.val == curr.val) {
				next = next.next;
			} else {
				curr.next = next;
				curr = next;
				next = curr.next;
			}
		}
		curr.next = null;
		return head;
	}

	public ListNode deleteDuplicates_recursive(ListNode node) {
		if (node == null || node.next == null)
			return node;
		node.next = deleteDuplicates_recursive(node.next);
		return node.val == node.next.val ? node.next : node;
	}

	public static void main(String[] args) {

	}

}
