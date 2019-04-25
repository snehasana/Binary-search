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

public class LevelOrderTraversalSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		System.out.print("level Order Without Recursion: ");
		LevelOrderTraversalSpiral preorder = new LevelOrderTraversalSpiral();
		preorder.levelOrderTraversalSpiral(tree);
	}
	
	private void levelOrderTraversalSpiral(Node root) {
		
		Boolean flag = false;
		int h = getHeight(root);
		for(int i =1;i<= h;i++) {
			flag = !flag;
			getLevelOrder(root,i,flag);
		}
		
	}
	
	private void getLevelOrder(Node root,int level,Boolean flag) {
		
		if(root== null)
			return ;
		
		if(level==1) {
			System.out.print(root.data+" ");
			return;
		}
		if(flag == false) {
		getLevelOrder(root.left, level-1,flag);
		getLevelOrder(root.right, level-1,flag);
		}
		else {
			getLevelOrder(root.right, level-1,flag);
			getLevelOrder(root.left, level-1,flag);
		}
		
		
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
