//package bst;
//
//import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
//
//class Node{
//	Node left ;
//	Node right ;
//	int value ;
//	
//	Node(int value){
//		this.value = value ;
//		this.left = null ;
//		this.right = null;
//	}
//}
//class Bst{
//	Node root ;
//	
//	Node InsertNode(int value) {
//		Node newNode  = new Node(value);
//		Node temp = root;
//		if(root==null) {
//			root  = newNode;
//		}
//		else {
//			Node prev  = null;
//			while(temp!=null) {
//				prev  = temp;
//				if(value< temp.value) {
//					temp  = temp.left;
//				}
//				else {
//					temp  = temp.right;
//				}
//			}
//			if(prev.value>value) {
//				prev.left = newNode;
//			}
//			else {
//				prev.right = newNode;
//			}
//		}
//		return root;
//	}
//	
//	void preOrder(Node root) {
//		if(root!=null) {
//			preOrder(root.left);
//			System.out.println(root.value);
//			preOrder(root.right);
//		}
//	}
//	
//	
//	Node RecursionInsert(Node temp  , int value ) {
//		if(temp == null) {
//			Node newNode  = new Node(value);
//			return newNode ;
//		}
//		if(temp.value > value) {
//			temp.left = RecursionInsert(temp.left, value);
//		}
//		else {
//			temp.right = RecursionInsert(temp.right, value);
//		}
//		return temp ;
//	}
//	Node getRoot() {
//		return root;
//	}
//}
//public class BinaryS {
//	
//	public static void main(String[] args) {
//		Bst bst  = new Bst();
//		bst.RecursionInsert(root,100);
//		bst.RecursionInsert(root,20);
//		bst.RecursionInsert(root,500);
//		bst.RecursionInsert(root,10);
//		bst.RecursionInsert(root,30);
//		bst.RecursionInsert(root,40);
//		
//		bst.preOrder(root);
//	}
//}
