package cracking_interview_question;

import java.util.Arrays;

public class ArraysAndStrings { 
	
	//1.1
	public static boolean isUniqueCharacters(String text)
	{
		if(text.length() < 128)
		{
			boolean[] ascii = new boolean[128];
			
			for(int i = 0; i < text.length(); i++)
			{
				char ascciOfCharacter = text.charAt(i);
				if(ascii[ascciOfCharacter])
				{
					return false;
				}
				ascii[ascciOfCharacter] = true;
			}
			return true;
		}

		return false;
	}
	
	//1.1b
	public static boolean isUniqueCharactersB(String text)
	{
		if(text.length() < 24)
		{
			int hash = 0;
			for(int i=0; text.length() > i ; i++)
			{
				if((hash & (1 << 'z' -text.charAt(i))) > 0)
				{
					return false;
				}
				hash = hash | (1 << 'z'-text.charAt(i)); 
			}
			return true;
		}
		return false;
	}
	
	//1.3
	public static boolean isPermutationOfOther(String text, String text2)
	{
		if(text.length() == text2.length())
		{
			char[] textSortedArray = text.toCharArray();
			Arrays.sort(textSortedArray);
			char[] text2SortedArray = text2.toCharArray();
			Arrays.sort(text2SortedArray);
			
			return Arrays.equals(textSortedArray, text2SortedArray);
		}
		return false;
	}
	
	//1.4
	public static char[] replaceStringWith20(char[] text)
	{
		int currentTextPointer = 0;
		int currentResultArrayPointer = 0;
		char[] resultArray = new char[text.length];
		while(currentResultArrayPointer < resultArray.length)
		{
			if(text[currentTextPointer] == ' ')
			{
				resultArray[currentResultArrayPointer] = '%';
				resultArray[++currentResultArrayPointer] = '2';
				resultArray[++currentResultArrayPointer] = '0';
				currentResultArrayPointer++;
				currentTextPointer++;
			}
			else
			{
				resultArray[currentResultArrayPointer] = text[currentTextPointer];
				currentTextPointer++;
				currentResultArrayPointer++;
			}
		}
		return resultArray;
	}
	
	//1.5
	public static String basicCompress(String text)
	{

		if(text.length() > 2)
		{
			String result = "";
			int uniqueCharPointer = 0;
			int currentCharPointer = 1;
			int counter = 1;
			while(currentCharPointer < text.length())
			{
				if(text.charAt(currentCharPointer) == text.charAt(uniqueCharPointer))
				{
					counter++;
				}
				else
				{
					result += text.charAt(uniqueCharPointer);
					result += counter;
					counter =1;
				}
				uniqueCharPointer = currentCharPointer;
				currentCharPointer++;

			}
			result += text.charAt(uniqueCharPointer);
			result += counter;

			if(result.length() < text.length())
			{
				return result;
			}
			return text;
			
		}
		return text;
	}
	
	//1.6
	public static void rotataImage(int[][] matrix)
	{
		int matrixLength = matrix[0].length-1;
		for(int i = 0; i <  matrixLength; i++)
		{
			for(int j = i; j < matrixLength- i; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[matrixLength-j][i];
				matrix[matrixLength-j][i]= matrix[matrixLength-i][matrixLength-j];
				matrix[matrixLength-i][matrixLength-j] = matrix[j][matrixLength-i];
				matrix[j][matrixLength-i] = temp;
			}
		}
	}
	
	//1.7
	public static void setRowColumnToZero(int[][] matrix)
	{
		boolean[] column = new boolean[matrix.length];
		boolean[] row = new boolean[matrix.length];
		for(int i = 0; i <  matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				if(matrix[i][j] == 0)
				{
					column[j] = true;
					row[i] = true;
				}
			}
		}
		for(int i = 0; i <  matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				if(column[j] || row[i])
				{
					matrix[i][j] = 0;
				}
			}
		}
		
		
	}
	
	//1.8
	public static boolean checkStringRotation(String text, String text2)
	{
		return false;
	}
}
