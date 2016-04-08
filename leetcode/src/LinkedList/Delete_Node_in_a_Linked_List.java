package LinkedList;

public class Delete_Node_in_a_Linked_List {

	public void deleteNode(ListNode node) {
		ListNode next = node.next;
		node.val = next.val;
		node.next = next.next;

	}

	public static void main(String[] args) {

	}

}
