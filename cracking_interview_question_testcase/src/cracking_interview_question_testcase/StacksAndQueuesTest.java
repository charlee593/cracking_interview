package cracking_interview_question_testcase;

import static org.junit.Assert.*;

import java.util.Stack;

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
		assertEquals("Question 3a 2 pop", 6, (int)temps.pop());
		assertEquals("Question 3a 3 pop", 5, (int)temps.pop());
		assertEquals("Question 3a 4 pop", 1, (int)temps.pop());
		
		temps.push(1);
		temps.push(5);
		temps.push(6);
		temps.push(2);
		temps.push(8);
		assertEquals("Question 3b 1 popAt", 8, (int)temps.popAt(1));
		assertEquals("Question 3b 1 popAt", 6, (int)temps.popAt(0));
		assertEquals("Question 3b 1 popAt", 2, (int)temps.popAt(0));


	}
	
	@Test
	public void question4() {
		Stack stackFrom = new Stack();
		Stack stackMiddle = new Stack();
		Stack stackDest = new Stack();
		
		stackFrom.push(6);
		stackFrom.push(5);
		stackFrom.push(4);
		stackFrom.push(3);
		stackFrom.push(2);
		stackFrom.push(1);
		
		StacksAndQueues stackAndQueues = new StacksAndQueues();
		stackAndQueues.towerOfHanoi(6, stackFrom, stackMiddle, stackDest);

		assertEquals("Question 3d 1 pop", 1, (int)stackDest.pop());
		assertEquals("Question 3d 2 pop", 2, (int)stackDest.pop());
		assertEquals("Question 3d 3 pop", 3, (int)stackDest.pop());
		assertEquals("Question 3d 4 pop", 4, (int)stackDest.pop());
		assertEquals("Question 3d 5 pop", 5, (int)stackDest.pop());
		assertEquals("Question 3d 6 pop", 6, (int)stackDest.pop());
		
	}
	
	@Test
	public void question5() {
		StacksAndQueues stackAndQueues = new StacksAndQueues();
		StacksAndQueues.MyQueue temps = stackAndQueues.new MyQueue();
		
		
		temps.enqueue(1);
		temps.enqueue(2);
		temps.enqueue(3);
		temps.enqueue(4);
		
		assertEquals("Question 3e 1 peek", 1, (int)temps.peek());
		assertEquals("Question 3e 2 pop", 1, (int)temps.dequeue());
		assertEquals("Question 3e 3 peek", 2, (int)temps.peek());
		assertEquals("Question 3e 4 pop", 2, (int)temps.dequeue());
		assertEquals("Question 3e 5 pop", 3, (int)temps.dequeue());
		assertEquals("Question 3e 6 pop", 4, (int)temps.dequeue());
		
		temps.enqueue(5);
		temps.enqueue(6);
		
		assertEquals("Question 3e 7 pop", 5, (int)temps.dequeue());
		assertEquals("Question 3e 8 pop", 6, (int)temps.dequeue());
		
	}
	
	@Test
	public void question6() {
		StacksAndQueues stackAndQueues = new StacksAndQueues();
		StacksAndQueues.OrderedStack temps = stackAndQueues.new OrderedStack();
		
		temps.push(1);
		temps.push(2);
		temps.push(3);

		assertEquals("Question 3f 1 pop", 3, (int)temps.pop());
		assertEquals("Question 3f 2 pop", 2, (int)temps.pop());
		assertEquals("Question 3f 3 pop", 1, (int)temps.pop());

		temps.push(3);
		temps.push(2);
		
		assertEquals("Question 3f 4 pop", 3, (int)temps.pop());
		
		temps.push(1);
		
		assertEquals("Question 3f 5 pop", 2, (int)temps.pop());
		assertEquals("Question 3f 6 pop", 1, (int)temps.pop());

		
	}
	
	@Test
	public void question7() {
		StacksAndQueues stackAndQueues = new StacksAndQueues();
		StacksAndQueues.AnimalShelter temps = stackAndQueues.new AnimalShelter();
		
		StacksAndQueues.Dog dog1 = stackAndQueues.new Dog("dog1");
		StacksAndQueues.Dog dog2 = stackAndQueues.new Dog("dog2");
		
		StacksAndQueues.Cat cat1 = stackAndQueues.new Cat("cat1");
		StacksAndQueues.Cat cat2 = stackAndQueues.new Cat("cat2");
		
		temps.enqueue(dog1);
		temps.enqueue(cat1);
		
		assertEquals("Question 3g 1 dequeueAny", dog1, temps.dequeueAny());
		assertEquals("Question 3g 2 dequeueAny", cat1, temps.dequeueAny());
		
		temps.enqueue(dog1);
		temps.enqueue(cat1);
		temps.enqueue(dog2);
		temps.enqueue(cat2);
		
		assertEquals("Question 3g 3 dequeueDog", dog1, temps.dequeueDog());
		assertEquals("Question 3g 4 dequeueCat", cat1, temps.dequeueCat());
		assertEquals("Question 3g 5 dequeueAny", dog2, temps.dequeueAny());

		
	}


}
