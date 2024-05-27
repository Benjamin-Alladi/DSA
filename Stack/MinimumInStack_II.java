import java.util.*;

// SC: O(1)
public class MinimumInStack_II {

    int min=Integer.MAX_VALUE;
    public void push(int a,Stack<Integer> s)
	{
	    //add code here.
        if(s.isEmpty())
        {
            s.push(a);
            min=a;
            return;
        }

        if(a>min)
        {
            s.push(a);
        }
        else
        {
            s.push(a-min);
            min=a;
        }
	}

	public int pop(Stack<Integer> s)
    {
        //add code here.
        if(s.isEmpty())
        {
            return -1;
        }

        int top=s.pop();
        if(top>min)
        {
            return top;
        }
        else
        {
            int minimum=min;

            // set min to previous min
            min=min-top;
            return minimum;
        }
	}

	public int min(Stack<Integer> s)
    {
        //add code here.
        if(s.isEmpty())
        {
            return -1;
        }
        return min;
	}

	public boolean isFull(Stack<Integer>s, int n)
    {
           //add code here.
           return s.size()==n;
	}

	public boolean isEmpty(Stack<Integer>s)
    {
           //add code here.
           return s.isEmpty();
	}

    public static void main(String[] args) {
        
    }
}

/*
 import java.util.Stack;

class MinStack {
    private long min;
    private Stack<Long> s;

    public MinStack() {
        s = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (s.isEmpty()) {
            s.push((long)0); // Pushing 0 when stack is empty
            min = val; // Update min
        } else {
            s.push(val - min); // Pushing the difference between val and current min
            if (val < min) { // If val is less than min, update min
                min = val;
            }
        }
    }

    public void pop() {
        if (s.isEmpty()) {
            return;
        }

        long poppedValue = s.pop();
        if (poppedValue < 0) { // If popped value is negative, restore previous min
            min = min - poppedValue;
        }
    }

    public int top() {
        if (s.isEmpty()) {
            return -1;
        }

        long topValue = s.peek();
        if (topValue < 0) { // If top value is negative, return min
            return (int)min;
        } else {
            return (int)(min+topValue); // Otherwise, add min to get the original value
        }
    }

    public int getMin() {
        if (s.isEmpty()) {
            return -1;
        }
        return (int)min;
    }
}

 */

 /*
  
***Handling Empty Stack:

In the original implementation, when pushing a value while the stack is empty, the minimum value was updated, but the value itself was pushed onto the stack directly.
In the modified implementation, when the stack is empty, we push 0 onto the stack to indicate that it's empty. This ensures that the stack always contains at least one element representing the difference between the pushed value and the current minimum.
Updating Minimum:

When pushing onto an empty stack, we update the minimum value to be the value being pushed (val).
For subsequent pushes, if the pushed value (val) is less than the current minimum (min), we update the minimum to val.
This ensures that the minimum value is always updated correctly, whether the stack is empty or not.
Pushing the Difference:

For subsequent pushes after the stack is initialized (i.e., not empty), we push the difference between the pushed value (val) and the current minimum (min) onto the stack.
By pushing the difference, we encode the information needed to retrieve the original value when accessing the top of the stack.
Restoring Minimum on Pop:

When popping a value, if the popped value is negative, it indicates that it was encoding the minimum value.
In such cases, we restore the previous minimum by adding the negative value to the current minimum.
This ensures that the minimum value is correctly restored when popping elements from the stack.
Accessing Top Value:

When accessing the top value, if the top value is negative, it indicates that it's encoding the minimum value.
In such cases, we return the current minimum.
Otherwise, we add the current minimum to the top value to retrieve the original value.
  */
