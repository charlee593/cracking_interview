package cracking_interview_question;

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
		
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(isBinaryTreeBalance(createBalanceBST(array).root));
		
		
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
		
		visitTable.replace(vertex1, true);
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
			visitTable.replace(currentVertex, true);
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

}
