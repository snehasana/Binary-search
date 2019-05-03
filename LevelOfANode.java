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
public class LevelOfANode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		tree.left.right.left= new Node(6);
		tree.left.right.right= new Node(7);
		
		LevelOfANode level = new LevelOfANode();
		System.out.println(level.checkLevelOfNode(tree,tree.left,1));
	}

	private int checkLevelOfNode(Node root, Node node,int level) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return 0;
		
		if(root.data== node.data)
			return level;
		
		
		int downlevel =checkLevelOfNode(root.left, node, level+1) ;
		if(downlevel!=0)
		{ 
			// If found in left subtree , return 
			return downlevel;
		}
		downlevel = checkLevelOfNode(root.right, node, level+1);
		
		return downlevel;
	}

}
