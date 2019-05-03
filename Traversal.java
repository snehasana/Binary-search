

public class Traversal {
		public static void main(String[] args) {
	
			
	
			Node tree = new Node(1);
			tree.left = new Node(2);
			tree.right = new Node(3);
			tree.left.left = new Node(4);
			tree.left.right = new Node(5);
	
			System.out.print("Preorder: ");
			Traversal preorder = new Traversal();
			preorder.preorderTraversal(tree);
	
			System.out.println("");
			
			System.out.print("Inorder: ");
			Traversal inorder = new Traversal();
			inorder.inorderTraversal(tree);
	
			System.out.println("");
			
			System.out.print("PostOrder: ");
			Traversal postOrder = new Traversal();
			postOrder.postOrderTraversal(tree);
			System.out.println("");
			
		}

		private void preorderTraversal(Node root) {
	
			if (root == null)
				return;
			System.out.print(root.data+" ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
	
		}

		private void inorderTraversal(Node root) {
	
			if (root == null)
				return;
	
			inorderTraversal(root.left);
			System.out.print(root.data+" ");
			inorderTraversal(root.right);
	
		}
	
		private void postOrderTraversal(Node root) {
	
			if (root == null)
				return;
	
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data+" ");
	
		}
}