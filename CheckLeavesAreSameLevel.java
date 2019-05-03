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
public class CheckLeavesAreSameLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		tree.left.right.left= new Node(6);
		tree.left.right.right= new Node(7);
		
		CheckLeavesAreSameLevel checkLevel = new CheckLeavesAreSameLevel();
		int leaflevel = checkLevel.checkLevelOFLeaf(tree);
		boolean check = checkLevel.checkSameLevel(tree,1,leaflevel);
		if(check== true)
			System.out.println("same Level");
		else
			System.out.println("Not Same Level");
		
		System.out.println(leaflevel);
	}
	
	
	private int checkLevelOFLeaf(Node root) {
		
		if(root== null ) {
			return 0;
		}
		
		int lh = checkLevelOFLeaf(root.left);
		int rh = checkLevelOFLeaf(root.right);
		
		
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
	}
	
	private boolean checkSameLevel(Node root , int level, int leaflevel) {
		
		if(root==null)
			return false;
		
		
		if(root.left== null && root.right== null) {
			return(level==leaflevel);
		}
		
		return checkSameLevel(root.left, level+1, leaflevel) && checkSameLevel(root.right, level+1, leaflevel);
	}

}
