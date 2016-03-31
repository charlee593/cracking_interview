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
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
	

}
