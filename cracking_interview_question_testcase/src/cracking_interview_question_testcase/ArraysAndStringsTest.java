package cracking_interview_question_testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import cracking_interview_question.ArraysAndStrings;

public class ArraysAndStringsTest {

	@Test
	public void testIsUniqueCharacters() {
		assertEquals("Test case 1:", true, ArraysAndStrings.isUniqueCharacters("")); 
		assertEquals("Test case 2:", true, ArraysAndStrings.isUniqueCharacters("h")); 
		assertEquals("Test case 3:", false, ArraysAndStrings.isUniqueCharacters("hh")); 
		assertEquals("Test case 4:", true, ArraysAndStrings.isUniqueCharacters("he")); 
		assertEquals("Test case 5:", true, ArraysAndStrings.isUniqueCharacters("0")); 
		assertEquals("Test case 6:", false, ArraysAndStrings.isUniqueCharacters("00"));
		assertEquals("Test case 7:", false, ArraysAndStrings.isUniqueCharacters("0 0"));
		assertEquals("Test case 8:", true, ArraysAndStrings.isUniqueCharacters("0 "));
	}
	
	@Test
	public void testIsPermutationOfOther() {
		assertEquals("Test case 1:", true, ArraysAndStrings.isPermutationOfOther("", "")); 
		assertEquals("Test case 2:", true, ArraysAndStrings.isPermutationOfOther("1", "1")); 
		assertEquals("Test case 3:", true, ArraysAndStrings.isPermutationOfOther("11", "11")); 
		assertEquals("Test case 4:", false, ArraysAndStrings.isPermutationOfOther("123", "321")); 
		assertEquals("Test case 5:", false, ArraysAndStrings.isPermutationOfOther("123", "21")); 
		assertEquals("Test case 6:", false, ArraysAndStrings.isPermutationOfOther("123", "1"));
		assertEquals("Test case 7:", true, ArraysAndStrings.isPermutationOfOther("123", ""));
		assertEquals("Test case 8:", false, ArraysAndStrings.isPermutationOfOther("123", "3211"));
		assertEquals("Test case 9:", true, ArraysAndStrings.isPermutationOfOther("123", "123123"));
		assertEquals("Test case 10:", false, ArraysAndStrings.isPermutationOfOther("123", "12312"));
		assertEquals("Test case 11:", false, ArraysAndStrings.isPermutationOfOther("123", "1212313"));

	}

}
