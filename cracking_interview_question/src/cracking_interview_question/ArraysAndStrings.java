package cracking_interview_question;

public class ArraysAndStrings { 
	
	
	public static boolean isUniqueCharacters(String text)
	{
		boolean[] asci = new boolean[256];
		if(text.length() < 256)
		{
			for (int i = 0; i < text.length(); i++) {
				if(asci[text.charAt(i)])
				{
					return false;
				}
				asci[text.charAt(i)] = true;
			}
			return true;
		}
		return false;
	}
	
	public static boolean isPermutationOfOther(String text, String text2)
	{
		return false;
	}
}
