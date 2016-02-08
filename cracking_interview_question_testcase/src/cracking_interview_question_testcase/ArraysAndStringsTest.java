package cracking_interview_question_testcase;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cracking_interview_question.ArraysAndStrings;

public class ArraysAndStringsTest {

	//1.1
	@Test
	public void testIsUniqueCharacters() 
	{
		System.out.println("Test 1.1a run in big O: O(n)");
		assertEquals("Test case 1:", true, ArraysAndStrings.isUniqueCharacters("")); 
		assertEquals("Test case 2:", true, ArraysAndStrings.isUniqueCharacters("h")); 
		assertEquals("Test case 3:", false, ArraysAndStrings.isUniqueCharacters("hh")); 
		assertEquals("Test case 4:", true, ArraysAndStrings.isUniqueCharacters("he")); 
		assertEquals("Test case 5:", true, ArraysAndStrings.isUniqueCharacters("0")); 
		assertEquals("Test case 6:", false, ArraysAndStrings.isUniqueCharacters("00"));
		assertEquals("Test case 7:", false, ArraysAndStrings.isUniqueCharacters("0 0"));
		assertEquals("Test case 8:", true, ArraysAndStrings.isUniqueCharacters("0 "));
		assertEquals("Test case 9:", true, ArraysAndStrings.isUniqueCharacters(" "));
	}
	
	//1.1b
	@Test
	public void testIsUniqueCharactersB() 
	{
		System.out.println("Test 1.1b run in big O: ");
		assertEquals("Test case 1:", true, ArraysAndStrings.isUniqueCharactersB("")); 
		assertEquals("Test case 2:", true, ArraysAndStrings.isUniqueCharactersB("h")); 
		assertEquals("Test case 3:", false, ArraysAndStrings.isUniqueCharactersB("hh")); 
		assertEquals("Test case 4:", true, ArraysAndStrings.isUniqueCharactersB("he")); 
		assertEquals("Test case 5:", true, ArraysAndStrings.isUniqueCharactersB("h e")); 
		assertEquals("Test case 6:", false, ArraysAndStrings.isUniqueCharactersB("h ee h")); 

	}
	
	//1.3
	@Test
	public void testIsPermutationOfOther() 
	{
		System.out.println("Test 1.3 run in big O: ");
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
	
	//1.4
	@Test
	public void testReplaceStringWith20() 
	{
		System.out.println("Test 1.4 run in big O: ");
		char[] text = {'M', 'r', ' ', 'J', 'o', 'h', 'n',' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' ' };
		char[] textResult = {'M', 'r', '%', '2', '0', 'J', 'o','h', 'n', '%', '2', '0', 'S', 'm', 'i', 't', 'h'};
		Assert.assertArrayEquals(textResult, ArraysAndStrings.replaceStringWith20(text));
		char[] text2 = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', ' ' };
		char[] textResult2 = {'M', 'r', '%', '2', '0', 'J', 'o','h', 'n'};
		Assert.assertArrayEquals(textResult2, ArraysAndStrings.replaceStringWith20(text2));	
	}
	
	//1.5
	@Test
	public void testBasicCompress() 
	{
		System.out.println("Test 1.5 run in big O: ");
		assertEquals("Test case 1:", "a2b1c4a3", ArraysAndStrings.basicCompress("aabccccaaa"));
		assertEquals("Test case 2:", "a", ArraysAndStrings.basicCompress("a"));
		assertEquals("Test case 3:", "aa", ArraysAndStrings.basicCompress("aa"));
		assertEquals("Test case 4:", "abb", ArraysAndStrings.basicCompress("abb"));
		assertEquals("Test case 5:", "aabb", ArraysAndStrings.basicCompress("aabb"));

	}
	
	private void printImage(int[][] matrix)
	{
		for(int i = 0; i < matrix.length; i++ )
		{
			for(int j = 0; j < matrix[i].length; j++ )
			{
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	//1.6
	@Test
	public void testRotataImage() 
	{
		Assert.assertTrue(true);
		System.out.println("Test 1.6 run in big O: ");
		System.out.println("Test 1.6a");
		int[][] image = {{1,2}, {3,4}};
		printImage(image);
		ArraysAndStrings.rotataImage(image);
		printImage(image);
		
		System.out.println("Test 1.6b");
		int[][] image2 = {{1,2, 3}, {4,5, 6}, {7, 8, 9}};
		printImage(image2);
		ArraysAndStrings.rotataImage(image2);
		printImage(image2);

		System.out.println("Test 1.6c");
		int[][] image3 = {{1,2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		printImage(image3);
		ArraysAndStrings.rotataImage(image3);
		printImage(image3);

	}
	
	//1.7
	@Test
	public void testSetRowColumnToZero() 
	{
//		fail();
		System.out.println("Test 1.7 run in big O: ");
		System.out.println("Test 1.7a");
		int[][] image = {{1,0}, {3,4}};
		printImage(image);
		ArraysAndStrings.setRowColumnToZero(image);
		printImage(image);
		
		System.out.println("Test 1.7b");
		int[][] image2 = {{1,0, 3}, {4,5, 6}, {7, 8, 9}};
		printImage(image2);
		ArraysAndStrings.setRowColumnToZero(image2);
		printImage(image2);

		System.out.println("Test 1.7c");
		int[][] image3 = {{1,2, 3, 4}, {5, 6, 7, 0}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		printImage(image3);
		ArraysAndStrings.setRowColumnToZero(image3);
		printImage(image3);
		
		System.out.println("Test 1.7d");
		int[][] image4 = {};
		printImage(image4);
		ArraysAndStrings.setRowColumnToZero(image4);
		printImage(image4);
		
		System.out.println("Test 1.7e");
		int[][] image5 = {{1,2, 3, 4}, {5, 6, 7, 0}, {9, 10, 11, 12}, {0, 0, 0, 0}};
		printImage(image5);
		ArraysAndStrings.setRowColumnToZero(image5);
		printImage(image5);

	}
	
	//1.8
	@Test
	public void testCheckStringRotation() 
	{
		System.out.println("Test 1.8 run in big O: ");
		assertEquals("Test case 1:", true, ArraysAndStrings.checkStringRotation("", "")); 
		assertEquals("Test case 2:", true, ArraysAndStrings.checkStringRotation("waterbottle", "erbottlewat")); 
		assertEquals("Test case 3:", true, ArraysAndStrings.checkStringRotation("11", "11"));
		assertEquals("Test case 4:", true, ArraysAndStrings.checkStringRotation("waterbottle", "waterbottle"));
		assertEquals("Test case 5:", false, ArraysAndStrings.checkStringRotation("waterbottle", "watersbottle"));

	}

}
