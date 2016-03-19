package cracking_interview_question;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import org.jgrapht.alg.*;
import org.jgrapht.*;
import org.jgrapht.graph.*;

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

	public static void main(String[] args) 
	{
//        DirectedGraph<String, DefaultEdge> g = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
//
//        String vertex1 = "1";
//        String vertex2 = "2";
//        String vertex3 = "3";
//        String vertex4 = "4";
//        String vertex5 = "5";
//
//        // add the vertices
//        g.addVertex(vertex1);
//        g.addVertex(vertex2);
//        g.addVertex(vertex3);
//        g.addVertex(vertex4);
//        g.addVertex(vertex5);
//
//        // add edges to create linking structure
//        g.addEdge(vertex1, vertex2);
//        g.addEdge(vertex2, vertex3);
//        g.addEdge(vertex2, vertex4);
//        g.addEdge(vertex3, vertex5);
//        g.addEdge(vertex4, vertex5);
////        g.addEdge(vertex1, vertex5);
//                
//        System.out.println(isConnected(g, "4", "1"));
		
		
//		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		System.out.println(isBinaryTreeBalance(createBalanceBST(array).root));
		
		
		
	}
	
	//4.2
	public static boolean isConnected(DirectedGraph<String, DefaultEdge> g, String vertex1, String vertex2 )
	{
		LinkedList<String> queue = new LinkedList<String>();
		Hashtable<String, Boolean> visitTable = new Hashtable<String, Boolean>();
		
		for(String e : g.vertexSet())
		{
			visitTable.put(e, false);
		}
		
		visitTable.put(vertex1, true);
		queue.add(vertex1);
		
		while(!queue.isEmpty())
		{
			String currentVertex = queue.removeFirst();
			for(DefaultEdge child: g.edgesOf(currentVertex))
			{
				if(!visitTable.get(g.getEdgeTarget(child)))
				{
					if(g.getEdgeTarget(child) == vertex2)
					{
						return true;
					}
					queue.add(g.getEdgeTarget(child));
				}
			}
			visitTable.put(currentVertex, true);
		}
		
		return false;
	}
	
	//4.3
	public static BST createBalanceBST(int[] array )
	{
		BST<Integer> result = new BST<Integer>();
		
		int middle = array.length /2;
		
		result.insert(array[middle]);
		
		for(int i = 0; i < array.length; i++)
		{
			if(i != middle)
			{
				result.insert(array[i]);
			}
		}
		return result;
	}
	
	//4.4 
	public static Hashtable<Integer, LinkedList<BSTnode<Integer>>> createLinkedListFromDepth(BSTnode<Integer> tree)
	{
		Hashtable<Integer, LinkedList<BSTnode<Integer>>> hash = new Hashtable<Integer, LinkedList<BSTnode<Integer>>>();
		traverseDepth(hash, tree, 0);
		return hash;
	}
	
	private static void traverseDepth(Hashtable<Integer, LinkedList<BSTnode<Integer>>> hash, BSTnode<Integer> treeNode, int depth)
	{
		if(treeNode != null)
		{
			if(hash.contains(depth))
			{
				hash.get(depth).add(treeNode);
			}
			else
			{
				LinkedList<BSTnode<Integer>> list = new LinkedList<BSTnode<Integer>>();
				list.add(treeNode);
				hash.put(depth, list );
			}
			traverseDepth(hash, treeNode.getLeft(), depth+1);
			traverseDepth(hash, treeNode.getRight(), depth+1);
		}

	}
	
	//4.5
	public static boolean isBST(BSTnode<Integer> treeNode)
	{
		return isBST(treeNode, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean isBST(BSTnode<Integer> treeNode, int min, int max)
	{
		if(treeNode == null)
			return true;
		
		if(treeNode.getKey() <= min && treeNode.getKey() >= max)
		{
			return false;
		}
		
		return isBST(treeNode.getLeft(), min, treeNode.getKey()) && isBST(treeNode.getRight(), treeNode.getKey(), max);
	}
	
	//4.6
	public static BSTnode<Integer> nextNode(BSTnode<Integer> treeNode)
	{
		if(treeNode.getRight() != null)
		{
			return smallest(treeNode.getRight());
		}
		if(treeNode.getParent() != null)
		{
			return nextNode(treeNode.getParent());
		}
		return null;
	}
	
    private static BSTnode<Integer> smallest(BSTnode<Integer> n)
	 {
	     if (n.getLeft() == null) {
	         return n;
	     } else {
	         return smallest(n.getLeft());
	     }
	 }
    
    //4.7
    public static BSTnode<Integer> commonNode(BSTnode<Integer> root, BSTnode<Integer> node, BSTnode<Integer> node2)
    {
    	if(root == null)
    		return null;

    	if(root.getKey() == node.getKey() || root.getKey() == node2.getKey() )
    		return root;

    	BSTnode<Integer> commonLeft = commonNode(root.getLeft(), node, node2);
    	BSTnode<Integer> commonRight = commonNode(root.getRight(), node, node2);
    	
    	if(commonLeft == null && commonRight == null)
    		return null;
    		
    	if(commonLeft != null && commonRight != null)
    		return root;
    	
    	return commonLeft != null ?  commonLeft :  commonRight;

    }
    
    //4.8
    public static boolean isSubtree(BSTnode<Integer> tree, BSTnode<Integer> tree2)
    {
    	if(tree == null)
    		return false;
    	
    	return (tree.getKey() == tree2.getKey()) ? sameTree(tree, tree2): (isSubtree(tree.getLeft(), tree2) || isSubtree(tree.getRight(), tree2));
    }
    
    
    
    private static boolean sameTree(BSTnode<Integer> tree, BSTnode<Integer> tree2)
    {
    	if(tree == null)
    		return tree == tree2;
    	
    	return tree.getKey() == tree2.getKey() && sameTree( tree.getLeft(),  tree2.getLeft()) && sameTree( tree.getRight(),  tree2.getRight());
    }
    
    //4.9
    public static void printPath(BSTnode<Integer> node, int sum)
    {
    	int depth = BTHeight(node)-1;
    	int[] path = new int[1];
    	printPath(node, path, sum, depth);
    }
	
    public static void printPath(BSTnode<Integer> node, int[] path, int sum, int level)
    {
    	if(node == null) return;
    	
    	path[level] = node.getKey();
    	
    	int currentSum = 0;
    	for(int i = level; i>= 0; i--)
    	{
    		currentSum += path[i];
    		if(currentSum == sum)
    		{
    			for(int x = level; x >= i; x--)
    			{
    				System.out.print(x + " ");
    			}
    			System.out.print("\n");
    		}
    	}
    	
    	printPath(node.getLeft(), path, sum, level+1);
    	printPath(node.getRight(), path, sum, level+1);
    	
    	path[level] = 0;
    }

}
