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
	public static int findKthLastElement(Node node, int k)
	{
		if(k > 0)
		{
			Node current = node;
			Node runner = node;
			int gap = 0;
			while(runner != null)
			{
				if(gap < k)
				{
					gap++;
				}
				else
				{
					current = current.next;
				}
				runner = runner.next;
			}
			return current.data;
		}
		return node.data;

	}
	
	//2.3
	public static void deleteNodeMiddleLinkedList(Node node)
	{
		node.data = node.next.data;
		node.next = node.next.next;
	}
	
	//2.4
	public static Node partitionLinkList(Node node, int x)
	{
		Node lessThanXHead = null;
		Node lessThanXTail = null;
		Node head = node;
		Node current = node;
		Node previous = current;
		
		while(current != null)
		{
			if(current.data < x)
			{
				previous.next = current.next;
				if(lessThanXHead == null)
				{
					lessThanXHead = current;
					lessThanXTail= current;
				}
				else
				{
					lessThanXTail.next = current;
					lessThanXTail = current;
				}
				current = previous.next;
			}
			else if(current.data == x)
			{
				previous.next = current.next;
				current.next = head;
				head= current;
				current = previous.next;
			}
			else
			{
				previous = current;
				current = current.next;
			}
		}
		if(lessThanXTail != null)
		{
			lessThanXTail.next = head;
			return lessThanXHead;
		}
		else
		{
			return head;
		}
		
	}
	
	//2.5
	public static Node sumLinkList(Node number1, Node number2) {
		Node pointer1 = number1;
		Node pointer2 = number2;
		Node result = null;
		Node current = null;
		int carry = 0;
		
		while(pointer1 != null || pointer2 != null)
		{
			int numPointer1 = (pointer1 == null) ?0 : pointer1.data;
			int numPointer2 = (pointer2 == null) ?0 : pointer2.data;
			int sum = numPointer1 + numPointer2 + (carry/10);
			if(sum>9)
			{
				carry = 10;
				sum = sum - carry;
				
			}
			else
			{
				carry = 0;
			}
			Node resultNode = new Node(sum);
			if(result == null)
			{
				result = resultNode;
				current = resultNode;
			}
			else
			{
				current.next = resultNode;
				current = resultNode;
			}
			if (pointer1 != null)  pointer1 = pointer1.next;
			if (pointer2 != null)  pointer2 = pointer2.next;
		}
		if(carry != 0)
		{
			Node resultNode = new Node(1);
			current.next = resultNode;
			current = resultNode;
		}
		return result;
	}
	
	static class SumWithNodeAndCarry
	{
		public int carry = 0;
		public Node result = null;
		
	}
	
	public static SumWithNodeAndCarry sumRecursion(Node node, Node node2)
	{
		if(node == null && node2 == null)
		{
			SumWithNodeAndCarry result = new SumWithNodeAndCarry();
			result.result = null;
			return result;
		}
		
		SumWithNodeAndCarry previousSum = sumRecursion(node.next, node2.next);
		int resultSum = (node == null) ? 0 : node.data + 
				((node2 == null) ? 0 : node2.data) + previousSum.carry;
		int carry = 0;
		if(resultSum > 9){
			resultSum = resultSum % 10;
			carry = 1;
		}
		Node resultNode = new Node(resultSum);
		resultNode.next = previousSum.result;

		SumWithNodeAndCarry result = new SumWithNodeAndCarry();
		result.carry = carry;
		result.result = resultNode;
		return result;
	}
	
	//2.5b
	public static Node sumLinkListB(Node node, Node node2)
	{
		Node pointer1 = node;
		Node head = node;
		Node pointer2 = node2;
		Node head2 = node2;
		while(pointer1 != null || pointer2 != null)
		{
			if(pointer1 == null && pointer2 != null)
			{
				Node zeroNode = new Node(0);
				zeroNode.next = head;
				head = zeroNode;
			}
			if(pointer2 == null && pointer1 != null)
			{
				Node zeroNode = new Node(0);
				zeroNode.next = head2;
				head2 = zeroNode;
			} 
			pointer1 = (pointer1 != null) ? pointer1.next : null;
			pointer2 = (pointer2 != null) ? pointer2.next : null;
		}
		SumWithNodeAndCarry result = sumRecursion(head, head2);
		if(result.carry != 0)
		{
			Node resultNode = new Node(result.carry);
			resultNode.next = result.result;
			return resultNode;
		}
		
		return result.result;
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
