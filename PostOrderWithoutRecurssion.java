import java.util.Stack;

import javax.swing.RootPaneContainer;


public class PostOrderWithoutRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		tree.left.right.left= new Node(6);
		tree.left.right.right= new Node(7);
		Stack s = new Stack<Node>();
		s.push(tree);
		System.out.print("PreOrder Order Without Recursion: ");
		PostOrderWithoutRecurssion postorder = new PostOrderWithoutRecurssion();
		postorder.postOrderTraversal(tree,s);
	}
	public void postOrderTraversal(Node root, Stack s) {
		// TODO Auto-generated method stub
		
		while(root!= null) {
			if(root.right!= null)
				s.push(root.right);
			if(root.left!= null)
				s.push(root.left);
			
			root=(Node) s.peek();
		}
	}
}
