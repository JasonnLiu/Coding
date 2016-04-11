package LinkedList;

public class Remove_Nth_Node_From_End_of_List {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;
		ListNode fast = head;
		while (n > 1) {
			fast = fast.next;
			n--;
		}
		fast = fast.next;
		if(fast == null){
			head = head.next;
			return head;
		}
		ListNode slow = head;
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;

		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
