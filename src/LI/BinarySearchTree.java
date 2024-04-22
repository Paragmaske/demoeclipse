package LI;

public class BinarySearchTree {

	 Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int value) {
			this.data = value;
			this.left = null;
			this.right = null;
		}
	}

	void insertMain(int value)
	{
		root=insertData(root,value);
	}
	Node insertData(Node root,int value)
	{
		if(root==null)
		{
			Node newNode=new Node(value);
			root=newNode;
		return root;
		}
		else if(value>root.data)
		{
			root.right=insertData(root.right,value);
				
		}
		else
		{
			root.left=insertData(root.left,value);

		}
		return root;
	}
	
	 void inorder() { inorderRec(root); }
	 
    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.right);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
b.insertMain(3);
b.insertMain(1);
b.insertMain(2);
b.inorder();
	}
}
