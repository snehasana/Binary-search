import java.util.Stack;

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.left = null;
		this.right = null;
		this.data = data;
	}

}

public class InorderTraversalWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		Stack s = new Stack<Node>();
		System.out.print("Inorder Without Recusrion: ");
		InorderTraversalWithoutRecursion preorder = new InorderTraversalWithoutRecursion();
		preorder.inorderTraversal(tree,s);
	}

	public void inorderTraversal(Node root,Stack s) {
		
		s.push(root);
		root = root.left;
		while (!s.empty() || root!= null) {
			while(root!= null) {
				s.push(root);
				root= root.left;
			}
			Node temp = (Node) s.pop();
			System.out.print(temp.data+ " ");
			root = temp;
			
				root = root.right;
			 
			
		}
	}
}
