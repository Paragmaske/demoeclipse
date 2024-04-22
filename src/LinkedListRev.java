import java.util.ArrayList;
import java.util.List;

public class LinkedListRev {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	static void printLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedListRev l = new LinkedListRev();

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		l.head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		// Node rev = rev(n0);
		// printLinkedList(rev);
		// System.out.println(lengthLinkedList(n1));
		reverseBetween(n1, 2, 4);
	}

	public static Node reverseBetween(Node head, int left, int right) {

		int lengthLinkedList = lengthLinkedList(head);
		int countleft = 0;
		int countright = 0;
		int count = 0;
		Node curr = head;
		for (int i = 1; i <= lengthLinkedList; i++) {

			if (curr.data == left) {
				countleft = count;
			}
			if (curr.data == right) {
				countright = count;
				break;
			}
			count++;
			curr = curr.next;
		}

		Node fin = head;
		int p = 1;
		while (p < left) {
			fin = fin.next;
			p++;
		}
		fin.next = null;
		Node break1 = fin;
		Node prev = null;
		Node curr1 = fin;
		int p1 = 0;
		while (p1 < (right - left) + 1) {

			Node next = null;
			while (curr1 != null) {
				next = curr1.next;
				curr1.next = prev;
				prev = curr1;
				curr1 = next;

			}
			p1++;
		}

		break1.next = prev;
		return head;

	}

	private static int lengthLinkedList(Node head) {
		int len = 0;
		Node c = head;
		while (c != null) {
			len++;
			c = c.next;
		}
		return len;
	}

	private static Node rev(Node head) {

		Node prev = null;
		Node next = null;
		Node curr = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		head = prev;
		return head;
	}
}
