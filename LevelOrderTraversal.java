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
public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		System.out.print("level Order Without Recursion: ");
		LevelOrderTraversal preorder = new LevelOrderTraversal();
		preorder.levelOrderTraversal(tree);
	}
	
	private void levelOrderTraversal(Node root) {
		
		
		int h = getHeight(root);
		for(int i =1;i<= h;i++) {
			getLevelOrder(root,i);
		}
		
	}
	
	private void getLevelOrder(Node root,int level) {
		
		if(root== null)
			return ;
		
		if(level==1) {
			System.out.print(root.data+" ");
			return;
		}
		
		getLevelOrder(root.left, level-1);
		getLevelOrder(root.right, level-1);
		
		
	}
private int getHeight(Node root) {
		
		if(root == null) {
			return 0;
		}
		int lh = getHeight(root.left);
		int rh= getHeight(root.right);
		
		
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
		
	}
}
