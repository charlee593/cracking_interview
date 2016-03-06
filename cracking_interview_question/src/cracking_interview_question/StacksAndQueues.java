package cracking_interview_question;

import java.util.ArrayList;
import java.util.Stack;

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
	
	//3.2
	public class StackWithMin
	{
		Stack<Integer> stack = null;
		Stack<Integer> minStack = null;
		public StackWithMin()
		{
			stack = new Stack<Integer>();
			minStack = new Stack<Integer>();
		}
		
		public void peek()
		{
			stack.peek();
		}
		
		public int pop()
		{
			int result = stack.pop();
			if(result == minStack.peek())
			{
				minStack.pop();
			}
			return result;
		}
		
		public void push(int item)
		{
			if(minStack.isEmpty() || item <= minStack.peek())
			{
				minStack.push(item);
			}
			stack.push(item);
		}
		
		public int min()
		{
			if(!minStack.isEmpty())
			{
				return minStack.peek();
			}
			return 0;
		}
	}
	
	//3.3
	public class SetOfStacks<T>
	{
		ArrayList<Stack<T>> stacks = new ArrayList<Stack<T>>();
		public int sizeOfStack = 0;
		
		public SetOfStacks(int sizeOfStack)
		{
			this.sizeOfStack = sizeOfStack;
			stacks.add(new Stack<T>());
		}
		
		public T peek()
		{
			return stacks.get(stacks.size()-1).peek();
		}
		
		public void push(T item)
		{
			if(stacks.get(stacks.size()-1).size() >= sizeOfStack)
			{
				Stack<T> newStack = new Stack<T>();
				stacks.add(newStack);
			}
			stacks.get(stacks.size()-1).push(item);
		}
		
		public T pop()
		{
			T result = stacks.get(stacks.size()-1).pop();
			if(stacks.get(stacks.size()-1).isEmpty() && stacks.size() != 1)
			{
				stacks.remove(stacks.size()-1);
			}
			return result;
		}
		
		public T popAt(int index)
		{
			T result = stacks.get(index).pop();
			slideOver(index);
			return result;
		}
		
		public void slideOver(int index)
		{
			if(index != stacks.size()-1 && stacks.get(index).size() != sizeOfStack)
			{
				T itemNextStack = stacks.get(index+1).remove(0);
				stacks.get(index).push(itemNextStack);
				if(stacks.get(index +1).isEmpty())
				{
					stacks.remove(index +1);
				}
				else
				{
					slideOver(index +1);
				}

			}
		}
	}
	
	//3.4
	public void towerOfHanoi(int numBlock, Stack from, Stack middle, Stack dest)
	{
		if(!from.isEmpty() && numBlock> 0)
		{
			towerOfHanoi(numBlock -1, from, dest, middle);
			dest.push(from.pop());
			towerOfHanoi(numBlock -1, middle, from, dest);
			
		}

	}
}
