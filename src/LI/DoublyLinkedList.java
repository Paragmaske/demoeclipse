package LI;

public class DoublyLinkedList {

	static Node head;
	static Node tail;
	static int size = 0;

	DoublyLinkedList() {
		head = null;
		tail = null;
	}

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int a) {
			this.data = a;
			this.left = null;
			this.right = null;
		}
	}

	void insertData(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			while (temp.right != null) {
				temp = temp.right;
			}
			temp.right = newNode;
			newNode.left = temp;
			tail = newNode;
		}
	}

	void insertPosition(int pos, int data) {
		Node temp = head;
		Node prev = null;
		int cp = 1;
		Node rs = null;
		Node newNode = new Node(data);
		while (temp.right != null) {
			if (cp == pos) {
				rs = temp.right;
				rs.left = newNode;
				newNode.left = temp;

				temp.right = newNode;
				newNode.right = rs;
			}
			cp++;
			temp = temp.right;
		}

	}

	public static void printDll() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.right;
		}
	}

	public static void printReverseDll() {
		Node temp = head;
		while (temp.right != null) {
			temp = temp.right;
		}

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.left;
		}
	}

	void moveToEnd(int data) {
		Node temp = head;
		Node temp1 = head;
		if(head.right==null)
		{
			return;
		}
		if(temp.data==data)
		{
			temp.right.left=null;
			head=temp.right;
		}
		else
		{
			temp1=head;
		while (temp.right != null) {
			Node leftSide = null;
			Node rightSide = null;
			if (temp.data == data) {
				leftSide=temp.left  ;
				rightSide=temp.right;

				leftSide.right = leftSide.right.right;
				rightSide.left = rightSide.left.left;
				break;
			}
			temp=temp.right;
		}}
		System.out.println("***");
		printDll();
		System.out.println("***");
			while(temp1.right!=null){
			{
				temp1=temp1.right;
				if(temp1.right==null)
				{
					Node newNode=new Node(data);
					temp1.right=newNode;
					newNode.left=temp1;
					break;
				}
			}
		
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertData(1);
	
		dll.printDll();

		dll.moveToEnd(1);
		dll.printDll();
	}
}
