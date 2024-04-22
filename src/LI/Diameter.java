package LI;

import LI.Tree.Node;

class Tree {
	Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int val) {
			data = val;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
		}
	}
}

public class Diameter {
	static int maxHeight = 0;
	public static void main(String[] args) {

		Tree t = new Tree();
		Node n = new Node(1);
		t.root = n;
		n.left = new Node(2);
		n.right = new Node(3);
//		n.right.right = new Node(7);
//		n.left.left = new Node(5);
//		n.left.right = new Node(4);
//		n.left.left.left = new Node(6);
//		n.left.left.left.left = new Node(7);
//		n.left.left.left.right = new Node(8);

		System.out.println("Diameter is : "+diameter(t.root));
		//System.out.println(diameter(t.root.left));
		//System.out.println(diameter(t.root.right));
//		System.out.println(diameter(t.root.left) + diameter(t.root.right));
	}

	private static int diameter(Node root) {
		d(root);
		return maxHeight-1;
	}

	private static int d(Node root) {
		if (root == null) {
			return 0;
		}

		int left = d(root.left);
		int right = d(root.right);
		
		int height = Math.max(left, right)+1;
		maxHeight = Math.max(left+right+1, maxHeight);

		return height;
		
	}
}
