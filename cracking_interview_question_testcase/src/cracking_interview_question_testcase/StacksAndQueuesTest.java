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
		assertEquals("Question 2a 1 min", 1, temps.min());
		assertEquals("Question 2a 2 pop", 1, temps.pop());
		assertEquals("Question 2a 3 min", 1, temps.min());
		assertEquals("Question 2a 4 pop", 2, temps.pop());
		assertEquals("Question 2a 5 min", 1, temps.min());
		assertEquals("Question 2a 6 pop", 1, temps.pop());
		assertEquals("Question 2a 7 min", 0, temps.min());
		
		temps.push(5);
		temps.push(3);
		temps.push(1);
		assertEquals("Question 2b 1 min", 1, temps.min());
		assertEquals("Question 2b 2 pop", 1, temps.pop());
		assertEquals("Question 2b 3 min", 3, temps.min());
		assertEquals("Question 2b 4 pop", 3, temps.pop());
		assertEquals("Question 2b 5 min", 5, temps.min());
		assertEquals("Question 2b 6 pop", 5, temps.pop());
		assertEquals("Question 2b 7 min", 0, temps.min());
	}
	
	@Test
	public void question3() {
		StacksAndQueues stackAndQueues = new StacksAndQueues();
		StacksAndQueues.SetOfStacks<Integer> temps = stackAndQueues.new SetOfStacks<Integer>(3);
		temps.push(1);
		temps.push(5);
		temps.push(6);
		temps.push(2);
		
		assertEquals("Question 3a 1 pop", 2, (int)temps.pop());

	}


}
