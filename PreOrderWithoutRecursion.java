import java.util.Stack;


public class PreOrderWithoutRecursion {

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
		PreOrderWithoutRecursion preorder = new PreOrderWithoutRecursion();
		preorder.preOrderTraversal(tree,s);
	}
	private void preOrderTraversal(Node root,Stack s) {
		
		while(!s.empty() && root!= null) {
			Node temp = (Node) s.pop();
			System.out.print(temp.data+" ");
			root = temp;
			
			if(root.right!= null)
				s.push(root.right);
			
			if(root.left!= null)
				s.push(root.left);
		}
	}
	
}

