package cracking_interview_question_testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import cracking_interview_question.LinkedList;
import cracking_interview_question.Node;

public class LinkedListTest {

	private void printNode(Node node){
		while(node!= null)
		{
			System.out.print(node.data + " - ");
			node = node.next;
		}
		System.out.print("\n");
	}
	
	@Test
	public void testRemoveDuplicateFromUnsortedLinkedList() {
		Node node = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(1);
		Node node8 = new Node(8);
		Node node9 = new Node(10);
		Node node10 = new Node(10);
		
		node.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		
		System.out.println("Test Case 2.1a:");
		printNode(node);
		LinkedList.removeDuplicateFromUnsortedLinkedList(node);
		printNode(node);
		
		Node Anode = new Node(1);

		System.out.println("Test Case 2.1b:");
		printNode(Anode);
		LinkedList.removeDuplicateFromUnsortedLinkedList(Anode);
		printNode(Anode);
		
		Node Bnode = new Node(1);
		Node Bnode2 = new Node(1);

		
		Bnode.next = Bnode2;

		
		System.out.println("Test Case 2.1c:");
		printNode(Bnode);
		LinkedList.removeDuplicateFromUnsortedLinkedList(Bnode);
		printNode(Bnode);
	}

	@Test
	public void testRemoveDuplicateFromUnsortedLinkedListB() {
		Node node = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(1);
		Node node8 = new Node(8);
		Node node9 = new Node(10);
		Node node10 = new Node(10);
		
		node.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		
		System.out.println("Test Case 2.1Ba:");
		printNode(node);
		LinkedList.removeDuplicateFromUnsortedLinkedListB(node);
		printNode(node);
		
		Node Anode = new Node(1);

		System.out.println("Test Case 2.1Bb:");
		printNode(Anode);
		LinkedList.removeDuplicateFromUnsortedLinkedListB(Anode);
		printNode(Anode);
		
		Node Bnode = new Node(1);
		Node Bnode2 = new Node(1);

		
		Bnode.next = Bnode2;

		
		System.out.println("Test Case 2.1Bc:");
		printNode(Bnode);
		LinkedList.removeDuplicateFromUnsortedLinkedListB(Bnode);
		printNode(Bnode);
	}

	@Test
	public void testFindKthLastElement() {
		Node node = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		
		node.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		
		System.out.println("Test Case 2.2a:");
		printNode(node);
		System.out.println(" " + LinkedList.findKthLastElement(node, 0));
		
		System.out.println("Test Case 2.2b:");
		System.out.println(" " + LinkedList.findKthLastElement(node, 1));
		
		System.out.println("Test Case 2.2:c");
		System.out.println(" " + LinkedList.findKthLastElement(node, 2));
		
		System.out.println("Test Case 2.2d:");
		System.out.println(" " + LinkedList.findKthLastElement(node, 3));
		
		System.out.println("Test Case 2.2e:");
		System.out.println(" " + LinkedList.findKthLastElement(node, 4));
		
		System.out.println("Test Case 2.2f:");
		System.out.println(" " + LinkedList.findKthLastElement(node, 10));

	}

	@Test
	public void testDeleteNodeMiddleLinkedList() {
		Node node = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		
		node.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		
		System.out.println("Test Case 2.3a:");
		printNode(node);
		LinkedList.deleteNodeMiddleLinkedList(node5);
		printNode(node);
		
		System.out.println("Test Case 2.3b:");
		printNode(node);
		LinkedList.deleteNodeMiddleLinkedList(node4);
		printNode(node);	
		
		System.out.println("Test Case 2.3c:");
		printNode(node);
		LinkedList.deleteNodeMiddleLinkedList(node3);
		printNode(node);	
		
		System.out.println("Test Case 2.3d:");
		printNode(node);
		LinkedList.deleteNodeMiddleLinkedList(node2);
		printNode(node);	
	}

	@Test
	public void testPartitionLinkList() {
		Node node = new Node(9);
		Node node2 = new Node(8);
		Node node3 = new Node(7);
		Node node4 = new Node(6);
		Node node5 = new Node(5);
		Node node6 = new Node(4);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(1);
		Node node10 = new Node(10);
		
		node.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		
		Node pointer = node;
		System.out.println("Test Case 2.4a:");
		printNode(pointer);
		printNode(LinkedList.partitionLinkList(pointer, 5));
		
		Node nodeB = new Node(9);
		Node nodeB2 = new Node(8);
		Node nodeB3 = new Node(7);
		Node nodeB4 = new Node(6);
		Node nodeB5 = new Node(5);
		Node nodeB6 = new Node(4);
		Node nodeB7 = new Node(5);
		Node nodeB8 = new Node(5);
		Node nodeB9 = new Node(5);
		Node nodeB10 = new Node(5);
		
		nodeB.next = nodeB2;
		nodeB2.next = nodeB3;
		nodeB3.next = nodeB4;
		nodeB4.next = nodeB5;
		nodeB5.next = nodeB6;
		nodeB6.next = nodeB7;
		nodeB7.next = nodeB8;
		nodeB8.next = nodeB9;
		nodeB9.next = nodeB10;
		
		System.out.println("Test Case 2.4b:");
		printNode(nodeB);
		printNode(LinkedList.partitionLinkList(nodeB, 5));
		
		Node nodeC = new Node(9);
		
		System.out.println("Test Case 2.4c:");
		printNode(nodeC);
		printNode(LinkedList.partitionLinkList(nodeC, 5));
	}

	@Test
	public void testSumLinkList() {
		Node node = new Node(7);
		Node node2 = new Node(1);
		Node node3 = new Node(6);
		
		Node node4 = new Node(5);
		Node node5 = new Node(9);
		Node node6 = new Node(2);

		node.next = node2;
		node2.next = node3;
		
		node4.next = node5;
		node5.next = node6;

		System.out.println("Test Case 2.5a:");
		printNode(node);
		printNode(node4);
		printNode(LinkedList.sumLinkList(node, node4));
		
		Node nodeB = new Node(7);
		Node nodeB2 = new Node(1);
		Node nodeB3 = new Node(6);
		
		Node nodeB4 = new Node(5);
		Node nodeB5 = new Node(9);
		Node nodeB6 = new Node(6);

		nodeB.next = nodeB2;
		nodeB2.next = nodeB3;
		
		nodeB4.next = nodeB5;
		nodeB5.next = nodeB6;

		System.out.println("Test Case 2.5b:");
		printNode(nodeB);
		printNode(nodeB4);
		printNode(LinkedList.sumLinkList(nodeB, nodeB4));
	}
	
	@Test
	public void testSumLinkListB() {
		Node node = new Node(6);
		Node node2 = new Node(1);
		Node node3 = new Node(7);
		
		Node node4 = new Node(2);
		Node node5 = new Node(9);
		Node node6 = new Node(5);

		node.next = node2;
		node2.next = node3;
		
		node4.next = node5;
		node5.next = node6;

		System.out.println("Test Case 2.5Ba:");
		printNode(node);
		printNode(node4);
		printNode(LinkedList.sumLinkListB(node, node4));
		
		Node nodeB = new Node(9);
		
		Node nodeB2 = new Node(9);
		Node nodeB3 = new Node(9);

		nodeB2.next = nodeB3;

		System.out.println("Test Case 2.5Bb:");
		printNode(nodeB);
		printNode(nodeB2);
		printNode(LinkedList.sumLinkListB(nodeB, nodeB2));
		
		Node nodeC = new Node(9);
		Node nodeC2 = new Node(9);
		
		Node nodeC3 = new Node(9);
		Node nodeC4 = new Node(9);

		nodeC.next = nodeC2;	
		nodeC3.next = nodeC4;

		System.out.println("Test Case 2.5Bc:");
		printNode(nodeC);
		printNode(nodeC3);
		printNode(LinkedList.sumLinkListB(nodeC, nodeC3));
	}

	@Test
	public void testGetHeadOfLoop() {
		Node node = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);

		node.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node3;

		System.out.println("Test Case 2.6a:");
		System.out.println(LinkedList.getHeadOfLoop(node).data);
	}

	@Test
	public void testIsPalindrome() {
		Node node = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);

		node.next = node2;
		node2.next = node3;
		node3.next = node4;

		System.out.println("Test Case 2.7a:");
		printNode(node);
		System.out.println(LinkedList.isPalindrome(node));
		
		Node nodeB = new Node(1);
		Node nodeB2 = new Node(2);
		Node nodeB3 = new Node(2);
		Node nodeB4 = new Node(1);

		nodeB.next = nodeB2;
		nodeB2.next = nodeB3;
		nodeB3.next = nodeB4;

		System.out.println("Test Case 2.7b:");
		printNode(nodeB);
		System.out.println(LinkedList.isPalindrome(nodeB));
		
		Node nodeC = new Node(1);
		Node nodeC2 = new Node(2);
		Node nodeC3 = new Node(2);
		Node nodeC4 = new Node(2);
		Node nodeC5 = new Node(1);

		nodeC.next = nodeC2;
		nodeC2.next = nodeC3;
		nodeC3.next = nodeC4;
		nodeC4.next = nodeC5;

		System.out.println("Test Case 2.7c:");
		printNode(nodeC);
		System.out.println(LinkedList.isPalindrome(nodeC));
		
		Node nodeD = new Node(1);
		Node nodeD2 = new Node(2);
		Node nodeD3 = new Node(2);
		Node nodeD4 = new Node(2);
		Node nodeD5 = new Node(2);
		
		nodeD.next = nodeD2;
		nodeD2.next = nodeD3;
		nodeD3.next = nodeD4;
		nodeD4.next = nodeD5;

		System.out.println("Test Case 2.7d:");
		printNode(nodeD);
		System.out.println(LinkedList.isPalindrome(nodeD));
	}

}
