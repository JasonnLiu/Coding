package LinkedList;

public class Intersection_of_Two_Linked_Lists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		ListNode p = headA;
		ListNode q = headB;
		ListNode A = headA;
		ListNode B = headB;
		while (q.next != null && p.next != null) {
			p = p.next;
			q = q.next;
		}
		if (p.next == null) {
			while (q.next != null) {
				B = B.next;
				q = q.next;
			} 
		}
		if (q.next == null) {
			while (p.next != null) {
				A = A.next;
				p = p.next;
			}
		}
		while (A != null) {
			if (A == B) {
				return A;
			}
			A = A.next;
			B = B.next;
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(null == null);

	}

}
