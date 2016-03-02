package cracking_interview_question_testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import cracking_interview_question.StacksAndQueues;
import cracking_interview_question.StacksAndQueues.SingleArrayStackData;

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

}
