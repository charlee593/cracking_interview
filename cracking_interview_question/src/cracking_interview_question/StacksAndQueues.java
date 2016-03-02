package cracking_interview_question;

public class StacksAndQueues {
	
	//3.1
	class StackData 
	{
		public int capacity = 0;
		public int head = 0;
		public int size = 0;
		
		public StackData(int headParam, int capacityParam)
		{
			head = headParam;
			capacity = capacityParam;
		}
	}
	
	public class SingleArrayStackData
	{
		public int stackSize = 0;
		public int numberOfStack = 0;
		public int totalSizeOfArray = 0;
		public StackData[] stackBuffer = null;
		public int[] array = null;
		
		public SingleArrayStackData(int stackSizeParam, int numberOfStackParam)
		{
			stackSize = stackSizeParam;
			numberOfStack= numberOfStackParam;
			totalSizeOfArray = stackSizeParam * numberOfStackParam;
			stackBuffer = new StackData[numberOfStack];
			array = new int[totalSizeOfArray];
			
			
			for(int i = 0; i< numberOfStack; i++)
			{
				stackBuffer[i] = new StackData(i * stackSize, stackSize);
			}
			
		}
		
		public int peek(int stackNum)
		{
			if(stackBuffer[stackNum].size != 0)
			{
				int itemLocation = (stackBuffer[stackNum].size + stackBuffer[stackNum].head - 1) 
						% totalSizeOfArray;
				return array[itemLocation];
			}
			return 0;
		}
		
		public boolean isEmpty(int stackNum)
		{
			if(stackBuffer[stackNum].size != 0)
				return false;
			return true;
		}
		
		public int pop(int stackNum)
		{
			if(!isEmpty(stackNum))
			{
				int itemLocation = (stackBuffer[stackNum].size + stackBuffer[stackNum].head - 1) 
						% totalSizeOfArray;
				int result = array[itemLocation];
				array[itemLocation] =0;
				stackBuffer[stackNum].size--;
				return result;
			}
			return 0;

		}
		
		public void push(int stackNum, int item)
		{
			int currentTotalSize = 0;
			for(StackData stack : stackBuffer)
			{
				currentTotalSize += stack.size;
			}
			if(currentTotalSize < totalSizeOfArray)
			{
				if(stackBuffer[stackNum].size >= stackBuffer[stackNum].capacity )
				{
					expand(stackNum);
				}
				int topStack = (stackBuffer[stackNum].size + stackBuffer[stackNum].head -1) 
						% totalSizeOfArray;
				int destination = (topStack + 1) % totalSizeOfArray;
				array[destination] = item;
				stackBuffer[stackNum].size++;
				
			}
		}

		private void expand(int stackNum) {
			int followingStack = (stackNum+1) % numberOfStack; 
			shift(followingStack);
			stackBuffer[stackNum].capacity++;
		}

		private void shift(int stack) {
			if(stackBuffer[stack].size >= stackBuffer[stack].capacity)
			{
				expand(stack);
			}
			
			for(int i = stackBuffer[stack].capacity; i>0;i--)
			{
				int right = (stackBuffer[stack].head+i-1)% totalSizeOfArray;
				int left = (stackBuffer[stack].head+i-1-1)% totalSizeOfArray;
				if(	(right >= stackBuffer[stack].head &&
					right < (stackBuffer[stack].head+stackBuffer[stack].capacity)) ||
					((stackBuffer[stack].head  + stackBuffer[stack].capacity) >= totalSizeOfArray) &&
					right < ((stackBuffer[stack].head  + stackBuffer[stack].capacity)%totalSizeOfArray))
				{
					array[right] = array[left]; 	
				}
			}
			
			array[stackBuffer[stack].head]=0;
			stackBuffer[stack].head= (stackBuffer[stack].head+1)%(totalSizeOfArray);
			stackBuffer[stack].capacity--;

		}
		
	}
		
}
