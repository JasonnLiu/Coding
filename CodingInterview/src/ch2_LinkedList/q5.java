package ch2_LinkedList;

public class q5 {

	public static int len(Node n) {
		int k = 0;
		while (n != null) {
			k++;
			n = n.next;
		}
		return k;
	}

	public static Node padList(Node n, int k) {
		Node head = n;
		for (int i = 0; i < k; i++) {
			Node tmp = new Node(0);
			tmp.next = head;
			head = tmp;
		}
		return head;
	}

	public static Node addList(Node l1, Node l2) {
		int len1 = len(l1);
		int len2 = len(l2);
		if (len1 < len2) {
			l1 = padList(l1, len2 - len1);
		} else {
			l2 = padList(l2, len1 - len2);
		}
		printNode(l1);
		System.out.println();
		printNode(l2);
		System.out.println();
		PartialSum ps = addListHelper(l1, l2);
		Node n = ps.partialNode;
		if (ps.carry > 0) {
			Node newNode = new Node(ps.carry);
			newNode.next = n;
			n = newNode;
		}
		return n;
	}

	public static PartialSum addListHelper(Node l1, Node l2) {
		if (l1 == null) {
			return new PartialSum();
		}
		PartialSum ps = addListHelper(l1.next, l2.next);
		int val = l1.data + l2.data + ps.carry;
		int data = val % 10;
		Node n = new Node(data);
		int carry = val / 10;
		ps.carry = carry;
		n.next = ps.partialNode;
		ps.partialNode = n;
		return ps;
	}

	public static void printNode(Node n) {
		int k = 1;
		while (n != null) {
			System.out.print(k + ":" + n.data + " ");
			k++;
			n = n.next;
		}
	}

	public static void main(String[] args) {
		Node first = new Node(8);
		Node second = new Node(2);
		Node third = new Node(3);
		first.next = second;
		second.next = third;

		Node first2 = new Node(9);
		Node second2 = new Node(2);
		Node third2 = new Node(3);
		Node fourth2 = new Node(4);
		first2.next = second2;
		second2.next = third2;
		third2.next = fourth2;

		System.out.println(len(first));

		Node f = addList(first, first2);
		printNode(f);

	}

}

class PartialSum {
	public int carry;
	public Node partialNode;
}

class Node {

	public Node(int k) {
		this.data = k;
	}

	Node next;
	int data;
}
