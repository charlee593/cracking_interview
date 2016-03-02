package cracking_interview_question_testcase;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import cracking_interview_question.StacksAndQueues;
import cracking_interview_question.StacksAndQueues.*;

public class StacksAndQueuesTest {

	@Test
	public void question1() {
		StacksAndQueues temps = new StacksAndQueues();
		StacksAndQueues.SingleArrayStackData tes = temps.new SingleArrayStackData(3, 3);
		tes.push(0, 1);
		tes.push(0, 2);
		tes.push(0, 3);
		tes.push(1, 11);
		tes.push(1, 12);
		tes.push(0, 4);
		tes.push(0, 5);
		tes.push(0, 6);
		tes.push(0, 7);
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(1));
		System.out.println(tes.pop(1));
		
		tes.push(0, 1);
		tes.push(0, 2);
		tes.push(0, 3);
		tes.push(0, 4);
		tes.push(0, 5);
		tes.push(0, 6);
		tes.push(0, 7);
		tes.push(0, 8);
		tes.push(0, 9);
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
		System.out.println(tes.pop(0));
	}
	
	@Test
	public void question2() {
		StacksAndQueues stackAndQueues = new StacksAndQueues();
		StacksAndQueues.StackWithMin temps = stackAndQueues.new StackWithMin();
		temps.push(1);
		temps.push(2);
		temps.push(1);
		assertEquals("Question 1a 1 min", 1, temps.min());
		assertEquals("Question 1a 2 pop", 1, temps.pop());
		assertEquals("Question 1a 3 min", 1, temps.min());
		assertEquals("Question 1a 4 pop", 2, temps.pop());
		assertEquals("Question 1a 5 min", 1, temps.min());
		assertEquals("Question 1a 6 pop", 1, temps.pop());
		assertEquals("Question 1a 7 min", 0, temps.min());
		
		temps.push(5);
		temps.push(3);
		temps.push(1);
		assertEquals("Question 1b 1 min", 1, temps.min());
		assertEquals("Question 1b 2 pop", 1, temps.pop());
		assertEquals("Question 1b 3 min", 3, temps.min());
		assertEquals("Question 1b 4 pop", 3, temps.pop());
		assertEquals("Question 1b 5 min", 5, temps.min());
		assertEquals("Question 1b 6 pop", 5, temps.pop());
		assertEquals("Question 1b 7 min", 0, temps.min());

	
	}


}
