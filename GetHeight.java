import java.util.Stack;


public class GetHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		tree.left.left = new Node(4);
		tree.left.right = new Node(5);
		GetHeight h = new GetHeight();
		int height= h.getHeight(tree);
		
		System.out.println("Height :"+ height);
	}
	private int getHeight(Node root) {
		
		if(root == null) {
			return 0;
		}
		if(root.left!=null)
		System.out.print(root.left.data+" ");
		int lh = getHeight(root.left);
		if(root.right!=null)
		System.out.println(root.right.data+" ");
		int rh= getHeight(root.right);
		System.out.println();
		
		
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
		
	}
	

}
