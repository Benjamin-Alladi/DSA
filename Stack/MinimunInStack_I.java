// package Stack;
import java.util.*;

// 155. Min Stack
// SC: O(N)
public class MinimunInStack_I {

    Stack<Integer> ss=new Stack<>();
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    if(s.isEmpty())
        {
            s.push(a);
            ss.push(a);
            return;
        }

        s.push(a);
        if(a<=ss.peek())
        {
            ss.push(a);
        }
	}

	public int pop(Stack<Integer> s)
    {
        //add code here.
        if(s.isEmpty())
        {
            return -1;
        }

        int popped=s.pop();
        if(popped==ss.peek())
        {
            ss.pop();
        }
        return popped;
	}

	public int min(Stack<Integer> s)
    {
        //add code here.
        if(ss.isEmpty())
        {
            return -1;
        }
        return ss.peek();
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
