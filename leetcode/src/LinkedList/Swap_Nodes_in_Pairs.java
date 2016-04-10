package LinkedList;

public class Swap_Nodes_in_Pairs {

	public ListNode swapPairs(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode tmp = head;
		ListNode nextPairs;
		head = head.next;
		nextPairs = head.next;
		head.next = tmp;
		tmp.next = swapPairs(nextPairs);
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
