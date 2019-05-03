
public class BoundaryTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(20);
	         root.left = new Node(8); 
	         root.left.left = new Node(4); 
	         root.left.right = new Node(12); 
	         root.left.right.left = new Node(10); 
	         root.left.right.right = new Node(14); 
	         root.right = new Node(22); 
	         root.right.right = new Node(25); 
	        
		System.out.print("level Order Without Recursion: ");
		BoundaryTraversal boundary = new BoundaryTraversal();
		boundary.boundaryTraversal(root);
	}
	
	private void boundaryTraversal(Node root) {
		
		
		if(root== null)
			return;
		System.out.print(root.data+" ");
		printLeftView(root.left);
		printleaves(root);
		printRightView(root.right);
		
		
	}
	
private void printRightView(Node root) {
		
		if(root== null)
			return;
		
		
		 if (root.right!= null) {
			System.out.print(root.data+" ");
			printRightView(root.right);
		}else if(root.left!= null) {
			System.out.print(root.data+" ");
			printRightView(root.left);
		}
		
}	
private void printLeftView(Node root) {
	
	if(root== null)
		return;
	
	if(root.left!= null) {
		System.out.print(root.data+" ");
		printLeftView(root.left);
	}
	else if (root.right!= null) {
		System.out.print(root.data+" ");
		printLeftView(root.right);
	}
	
}		
		
	private void printleaves(Node root) {
		
		if(root== null)
			return;
		printleaves(root.left);
		printleaves(root.right);
		
		if(root!= null&& root.left == null && root.right== null) {
			System.out.print(root.data+" ");
		}
		
	}
}
