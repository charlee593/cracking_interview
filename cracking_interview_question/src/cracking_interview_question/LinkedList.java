package cracking_interview_question;

import java.util.HashMap;

public class LinkedList {
	
	//2.1
	public static void removeDuplicateFromUnsortedLinkedList(Node node)
	{
		if(node != null)
		{
			HashMap hash = new HashMap();
			Node current = node;
			hash.put(current.data, true);
			while(current != null)
			{
				if(current.next != null)
				{
					if(hash.get(current.next.data) != null)
					{
						current.next = current.next.next;
					}
					else
					{
						hash.put(current.next.data, true);
					}
				}
				current = current.next;
			}
		}
	}
	
	//2.1b
	public static void removeDuplicateFromUnsortedLinkedListB(Node node)
	{
		Node current = node.next;
		Node nonDuplicate = node;
		nonDuplicate.next = null;
		while(current != null)
		{
			Node currentNonDuplicate = nonDuplicate;
			Node previousNonDuplicate = currentNonDuplicate;
			while(currentNonDuplicate != null && currentNonDuplicate.data != current.data)
			{
				previousNonDuplicate = currentNonDuplicate;
				currentNonDuplicate = currentNonDuplicate.next;
			}
			if(currentNonDuplicate == null)
			{
				previousNonDuplicate.next = current;
				currentNonDuplicate = current;
				current = current.next;
				currentNonDuplicate.next = null;
			}
			else
			{
				current = current.next;
			}
	
		}
	}
	
	//2.2
	public static void findKthLastElement(Node node)
	{
	}
	
	//2.3
	public static void deleteNodeMiddleLinkedList(Node node)
	{
	}
	
	//2.4
	public static void partitionLinkList(Node node, int x)
	{
	}
	
	//2.5
	public static int sumLinkList(Node node, Node node2)
	{
		return 0;
	}
	
	//2.5b
	public static int sumLinkListB(Node node, Node node2)
	{
		return 0;
	}
	
	//2.6
	public static Node getHeadOfLoop(Node node)
	{
		return null;
	}
	
	//2.7
	public static boolean isPalindrome(Node node)
	{
		return false;
	}

}
