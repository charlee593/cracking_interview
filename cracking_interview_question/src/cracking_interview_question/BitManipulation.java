package cracking_interview_question;

public class BitManipulation {
	
	//5.1
	public static int insertNum(int num1, int num2, int j, int i)
	{
		int mask = ~(((1 << (j-i)) - 1) << i);
		int clearNum2 = num2 & mask;
		int shiftNum2 = clearNum2 << i;
		int result = num1 & shiftNum2;
		return result;
	}
	
	//5.2
	private static String printBinary(double num, int count)
	{
		String result = null;
		double x = 0;
		x = num * 2;
		
		if(count >= 32)
		{
			return "ERROR";
		}
		
		if(x == 0)
		{
			return "";
		}
		
		if(x > 1)
		{
			String s = printBinary(x-1, count+1);
			if(s.equalsIgnoreCase("ERROR"))
			{
				return "ERROR";
			}
			result = "1" + s;
		}
		else
		{
			String s = printBinary(x, count+1);
			if(s.equalsIgnoreCase("ERROR"))
			{
				return "ERROR";
			}
			result = "0" + s; 
		}

		return result;
	}
	
	public static void printBinary(double num)
	{
		String s = printBinary(num, 0);
		if(s.equalsIgnoreCase("ERROR"))
		{
			System.out.println(s);
		}
		System.out.println("0." + s);
	}
	
	public static void main(String[] args) 
	{
		printNextBiggest(18);
		printNextBiggest(140);
		printNextSmallest(152);
	}
	
	//5.3
	public static void printNextBiggest(int x)
	{		
		if(x == 0)
		{
			System.out.println(x);
		}
		
		//Count right most 0 and 1
		int zeroNumRight = 0;
		int oneNumRight = 0;
		int temp = x;
		while(temp != 0 && (temp & 1) == 0)
		{
			zeroNumRight++;
			temp = temp >> 1;
		}
		
		while(temp != 0 && (temp & 1) == 1)
		{
			oneNumRight++;
			temp = temp >> 1;
		}
		
		//Move leftmost 1s set's 1 to left for 1 
		//Add 1 to rightmost
		int result = x + (1 << zeroNumRight) + (1<< (oneNumRight-1)) - 1;
		
		System.out.println(result);
	}

	public static void printNextSmallest(int x)
	{		
		if(x == 0)
		{
			System.out.println(x);
		}
		
		//Count right most 0 and 1
		int zeroNumRight = 0;
		int oneNumRight = 0;
		int temp = x;
		
		while(temp != 0 && (temp & 1) == 1)
		{
			oneNumRight++;
			temp = temp >> 1;
		}
		
		while(temp != 0 && (temp & 1) == 0)
		{
			zeroNumRight++;
			temp = temp >> 1;
		}
		
		//Set right 1 to 0
		int result = x - (1 << oneNumRight) - (1 << (zeroNumRight-1)) +1;
		
		System.out.println(result);
	}
}
