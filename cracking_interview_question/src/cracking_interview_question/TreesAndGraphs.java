package cracking_interview_question;

public class TreesAndGraphs {
	
	//4.1
	public static boolean isBinaryTreeBalance(BSTnode tree)
	{
		return false;
	}
	
	private int BTHeight(BSTnode tree)
	{
		if(tree == null)
			return 0;
		
		return 1 + BTHeight(tree.getLeft()) + BTHeight(tree.getLeft());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
