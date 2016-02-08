package cracking_interview_question;

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
		return false;
	}
	
	//1.4
	public static char[] replaceStringWith20(char[] text)
	{
		return text;
	}
	
	//1.5
	public static String basicCompress(String text)
	{
		return text;
	}
	
	//1.6
	public static void rotataImage(int[][] matrix)
	{
	}
	
	//1.7
	public static void setRowColumnToZero(int[][] matrix)
	{
	}
	
	//1.8
	public static boolean checkStringRotation(String text, String text2)
	{
		return false;
	}
}
