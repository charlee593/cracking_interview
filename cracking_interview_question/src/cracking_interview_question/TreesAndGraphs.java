package cracking_interview_question;

public class TreesAndGraphs {
	
	//4.1
	public static boolean isBinaryTreeBalance(BSTnode tree)
	{
		if(BTHeight(tree) != -1)
		{
			return true;
		}
		return false;
	}
	
	private static int BTHeight(BSTnode tree)
	{
		if(tree == null)
			return 0;
		
		if(Math.abs(BTHeight(tree.getLeft()) - BTHeight(tree.getRight())) > 1)
		{
			return -1;
		}
		
		return 1 + ((BTHeight(tree.getLeft()) > BTHeight(tree.getRight()) )? BTHeight(tree.getLeft()) :BTHeight(tree.getRight()));
	}

	public static void main(String[] args) {
		BSTnode node10 = new BSTnode(10, null, null);
		BSTnode node9 = new BSTnode(9, null, null);
		
		BSTnode node7 = new BSTnode(7, node9, null);
		BSTnode node8 = new BSTnode(8, null, null);
		
		BSTnode node6 = new BSTnode(6, null, null);
		BSTnode node5 = new BSTnode(5, null, null);
		
		BSTnode node4 = new BSTnode(4, node5, node6);
		
		BSTnode node3 = new BSTnode(3, node4, node10);
		BSTnode node2 = new BSTnode(2, node7, node8);
		
		BSTnode node1 = new BSTnode(1, node2, node3);
		
		System.out.println(BTHeight(node1));
		System.out.println(isBinaryTreeBalance(node1));

	}
	
	//4.2
	public static boolean isConnected()
	{
		
	}

}
