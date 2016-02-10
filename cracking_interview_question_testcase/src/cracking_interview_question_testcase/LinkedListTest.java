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
		
		System.out.println("Test Case 2.1a:");
		printNode(node);
		LinkedList.removeDuplicateFromUnsortedLinkedListB(node);
		printNode(node);
		
		Node Anode = new Node(1);

		System.out.println("Test Case 2.1b:");
		printNode(Anode);
		LinkedList.removeDuplicateFromUnsortedLinkedListB(Anode);
		printNode(Anode);
		
		Node Bnode = new Node(1);
		Node Bnode2 = new Node(1);

		
		Bnode.next = Bnode2;

		
		System.out.println("Test Case 2.1c:");
		printNode(Bnode);
		LinkedList.removeDuplicateFromUnsortedLinkedListB(Bnode);
		printNode(Bnode);
	}

//	@Test
//	public void testFindKthLastElement() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteNodeMiddleLinkedList() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPartitionLinkList() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSumLinkList() {
//		fail("Not yet implemented");
//	}
//	
//	@Test
//	public void testSumLinkListB() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetHeadOfLoop() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIsPalindrome() {
//		fail("Not yet implemented");
//	}

}
