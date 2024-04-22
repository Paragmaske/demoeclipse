
public class AddinFrontLinkedList {

	Node head;

	static class Node {
		int value;
		Node next;

		Node(int data) {
			value = data;
			next = null;
		}
	}

	void addInFront(AddinFrontLinkedList l, int input) {
		Node ele = new Node(input);
		if (l.head == null) {
			l.head = ele;
		} else {
			ele.next = l.head;
			l.head = ele;
		}
	}

	static void printNodes(AddinFrontLinkedList l) {
		Node curr = l.head;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		AddinFrontLinkedList l = new AddinFrontLinkedList();
		l.addInFront(l, 1);
		l.addInFront(l, 2);
		l.addInFront(l, 3);
		l.printNodes(l);

	}

}
